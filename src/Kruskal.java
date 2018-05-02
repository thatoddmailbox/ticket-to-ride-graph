import java.util.ArrayList;

public class Kruskal {
	public static ArrayList<String> findPath(Graph input) {
		int smallestLengthFound = 9999999;
		int smallestLengthFrom = -1;
		int smallestLengthTo = -1;
		ArrayList<String> edges = new ArrayList<>();

		while (edges.size() < (input.places.size() - 1)) {
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
						if (edges.contains(from)) {
							continue;
						}
						smallestLengthFound = length;
						smallestLengthFrom = x;
						smallestLengthTo = y;
					}
				}
			}

			edges.add(input.places.get(smallestLengthFrom));

			smallestLengthFound = 9999999;
		}

		return edges;
	}
}
