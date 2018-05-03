import java.util.ArrayList;

public class Tree {
	public ArrayList<String> nodes;
	public ArrayList<Edge> edges;

	public Tree() {
		nodes = new ArrayList<String>();
		edges = new ArrayList<Edge>();
	}

	public void addNode(String node) {
		nodes.add(node);
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
}
