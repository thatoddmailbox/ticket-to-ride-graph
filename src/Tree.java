import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Tree {
	public ArrayList<String> nodes;
	public ArrayList<Edge> edges;

	public Tree() {
		nodes = new ArrayList<String>();
		edges = new ArrayList<Edge>();
	}

	public Tree(Tree clone) {
		nodes = new ArrayList<String>(clone.nodes);
		edges = new ArrayList<Edge>(clone.edges);
	}

	public void addNode(String node) {
		nodes.add(node);
	}

	public ArrayList<Edge> getEdgesFromNode(String node) {
		ArrayList<Edge> foundEdges = new ArrayList<Edge>();
		for (Edge e : edges) {
			if (e.firstCity.equals(node)) {
				foundEdges.add(e);
			}
		}
		return foundEdges;
	}

	public boolean traverseWhileAvoiding(String currentNode, ArrayList<String> visitedNodes) {
		// get all the edges going from this node
		ArrayList<Edge> edgesFromCurrent = getEdgesFromNode(currentNode);
		// check if we've been here before, if so fail
		if (visitedNodes.contains(currentNode)) {
			return false;
		}
		// keep track that we've visited this node
		visitedNodes.add(currentNode);
		// traverse those edges
		for (Edge e : edgesFromCurrent) {
			if (!traverseWhileAvoiding(e.secondCity, visitedNodes)) {
				return false;
			}
		}
		// we survived
		return true;
	}

	public boolean addingEdgeWouldCauseCycle(Edge e) {
		// try creating a new tree with the edge
		Tree potentialNewTree = new Tree(this);
		potentialNewTree.addEdge(e);

		for (String node : potentialNewTree.nodes) {
			if (!potentialNewTree.traverseWhileAvoiding(node, new ArrayList<String>())) {
				// found a cycle
				return true;
			}
		}

		return false;
	}

	public void addEdge(Edge e) {
		edges.add(e);
		if (!nodes.contains(e.firstCity)) {
			nodes.add(e.firstCity);
		}
		if (!nodes.contains(e.secondCity)) {
			nodes.add(e.secondCity);
		}
	}

	public void addEdge(String from, String to, int weight) {
		addEdge(new Edge(from, to, weight));
	}

	public Integer getPathLength (){
		int total = 0;

		for (Edge e: edges) {
			total += e.weight;
		}
		return total;
	}

	public String getDotFile() {
		StringBuffer buff = new StringBuffer();

		/*
		digraph G {
		  "Welcome" -> "To"
		  "To" -> "Web"
		  "To" -> "GraphViz!"
		}

		LR_0 -> LR_2 [ label = "SS(B)" ];
		 */

		buff.append("digraph G {\n");

		for (Edge e: edges) {
			buff.append("\t\"" + e.firstCity + "\" -> \"" + e.secondCity + "\"" + "[ label = \"" + e.weight + "\" ];\n");
		}

		buff.append("}");

		return buff.toString();

	}
}
