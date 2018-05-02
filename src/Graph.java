import java.util.ArrayList;

public class Graph {
	public int[][] adjacency;
	public ArrayList<String> places;

	public Graph() {
		places = new ArrayList<>();
		adjacency = new int[0][0];
	}

	public void addNode(String name) {
		places.add(name);
		int[][] newAdjacency = new int[places.size()][places.size()];
		for (int i = 0; i < (places.size() - 1); i++) {
			for (int j = 0; j < (places.size() - 1); j++) {
				newAdjacency[i][j] = adjacency[i][j];
			}
		}
		adjacency = newAdjacency;
	}

	public void addPath(String from, String to, int length, int pathCount) {
		int fromIndex = places.indexOf(from);
		int toIndex = places.indexOf(to);
		adjacency[fromIndex][toIndex] = length;
	}
}
