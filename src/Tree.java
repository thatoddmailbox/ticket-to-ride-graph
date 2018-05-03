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

	public boolean addingEdgeWouldCauseCycle(Edge e) {
		// try creating a new tree with the edge
		Tree potentialNewTree = new Tree(this);
		potentialNewTree.addEdge(e);

		// check each edge in the tree, see if we visit any node twice
		HashMap<String, Boolean> visitedPlaces = new HashMap<String, Boolean>();
		for (Edge edgeToCheck : potentialNewTree.edges) {
			boolean hasVisited = visitedPlaces.getOrDefault(edgeToCheck.secondCity, false);
			if (hasVisited) {
				// have been to this node before
				return true;
			}
			visitedPlaces.put(edgeToCheck.secondCity, true);
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

	public String getDotFile() {
		StringBuffer buff = new StringBuffer();

		/*
		digraph G {
		  "Welcome" -> "To"
		  "To" -> "Web"
		  "To" -> "GraphViz!"
		}
		 */

		buff.append("digraph G {");

		for (Edge e: edges) {
			buff.append("\"" + e.firstCity + "\" -> \"" + e.secondCity + "\"" );
		}

		buff.append("}");

		return buff.toString();

	}
}
