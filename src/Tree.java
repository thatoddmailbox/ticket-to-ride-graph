import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


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
