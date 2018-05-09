import java.util.*;
public class Prims {
    public static Tree Prims(Graph input) {
        boolean done = false;
        Edge smallestLengthEdge = null;
        Tree MST = new Tree();
        int nextcity=0;
        int x = 0;
        int counter = 0;
            while (!done) {
                int finito = 0;
                smallestLengthEdge = new Edge("", "", input.adjacency[x][0]);
                for (int y = 0; y < input.adjacency.length - 1; y++) {
                    if (x < input.adjacency.length - 1 && input.adjacency[x][y] < smallestLengthEdge.weight && !MST.nodes.contains(input.adjacency[x][y])) {
                        smallestLengthEdge= new Edge(input.places.get(x), input.places.get(y),input.adjacency[x][y]);
//                        smallestLengthEdge.firstCity = input.places.get(x);
//                        smallestLengthEdge.secondCity = input.places.get(y);
                        nextcity = y;
                    }
                }
                MST.addEdge(smallestLengthEdge);
                x = nextcity;

                for (int i = 0; i < input.adjacency.length; i++) {
                    if (MST.nodes.contains(input.places.get(i))) finito++;
                }

                if (finito == input.adjacency.length - 1) done = true;
                counter++;
                if (counter>input.places.size()) done= true;
            }
            System.out.println("done");
        return MST;
    }
}
