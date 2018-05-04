public class Kruskal {
	public static Tree findTree(Graph input) {
		int smallestLengthFound = Integer.MAX_VALUE;
		Edge smallestLengthEdge = null;

		Tree t = new Tree();

		while (t.edges.size() < (input.places.size() - 2)) {
			for (int x = 0; x < input.adjacency.length; x++) {
				for (int y = 0; y < input.adjacency[0].length; y++) {
					if (x == y) {
						continue;
					}

					int length = input.adjacency[x][y];
					String from = input.places.get(x);
					String to = input.places.get(y);

					if (length == 0) {
						continue;
					}

					if (length < smallestLengthFound) {
						Edge potentialNewEdge = new Edge(from, to, length);
						Edge reverseOfNewEdge = new Edge(to, from, length);
						if (t.edges.contains(potentialNewEdge) || t.edges.contains(reverseOfNewEdge)) {
							continue;
						}
						if (t.addingEdgeWouldCauseCycle(potentialNewEdge)) {
							continue;
						}
						smallestLengthFound = length;
						smallestLengthEdge = potentialNewEdge;
					}
				}
			}

			t.addEdge(smallestLengthEdge);

			smallestLengthFound = Integer.MAX_VALUE;
		}

		return t;
	}
}
