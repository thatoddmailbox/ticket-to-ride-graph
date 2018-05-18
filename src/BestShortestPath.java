import java.util.ArrayList;
import java.util.HashMap;

public class BestShortestPath {
    public static HashMap<String, Integer> findPaths(Graph g, String home) {
        HashMap<String, Integer> results = new HashMap<>();

        for (String node : g.places) {
            results.put(node, Integer.MAX_VALUE);
        }

        int homeIndex = g.places.indexOf(home);
        results.put(home, 0);

        ArrayList<Integer> placesWeAreAtNow = new ArrayList<>();
        for (int i = 0; i < g.adjacency[homeIndex].length; i++) {
            int weight = g.adjacency[homeIndex][i];
            if (weight == 0) {
                continue;
            }
            results.put(g.places.get(i), weight);
            placesWeAreAtNow.add(i);
        }

        ArrayList<Integer> placesWeWillBeAt = new ArrayList<>();
        while (placesWeAreAtNow.size() != 0) {
            for (Integer place : placesWeAreAtNow) {
                int lengthToGetHere = results.get(g.places.get(place));
                for (int i = 0; i < g.adjacency[place].length; i++) {
                    int weight = g.adjacency[place][i];
                    if (weight == 0) {
                        continue;
                    }
                    int smallestSoFar = results.get(g.places.get(i));
                    int totalWeight = lengthToGetHere + weight;
                    if (totalWeight < smallestSoFar) {
                        results.put(g.places.get(i), totalWeight);
                        placesWeWillBeAt.add(i);
                    }
                }
            }
            placesWeAreAtNow = new ArrayList<Integer>();
            placesWeAreAtNow.addAll(placesWeWillBeAt);
            placesWeWillBeAt.clear();
        }

        return results;
    }
}
