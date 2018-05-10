import java.util.*;
public class Prims {
    public static Tree Prims(Graph input) {
        boolean done = false;
        Boolean checkedFullTree= false;
        Edge smallestLengthEdge = null;
        Tree MST = new Tree();
        ArrayList<Integer> currentcities = new ArrayList<>();
        int counter = 0;
        print(input);
        while (!done) {
            int finito = 0;
            checkedFullTree= false;
            while(!checkedFullTree) {
                for (int x = 0; x < input.adjacency.length-1; x++){
                    boolean added = false;
                   // while (!added) {
                        smallestLengthEdge = getStartingLength(input, x);
                        if (!MST.addingEdgeWouldCauseCycle(smallestLengthEdge)) {
                            MST.addEdge(smallestLengthEdge);
                            System.out.println("adding");
                            added = true;
                        }
                   // }
                }
                checkedFullTree=true;
            }

            for (int i = 0; i < input.adjacency.length-2; i++) {
                if (MST.nodes.contains(input.places.get(i))) finito++;
            }

            if (finito == input.adjacency.length - 1) done = true;
            counter++;
            if (counter > input.places.size()) done = true;
        }

        System.out.println("done");
        return MST;
    }


    public static void print(Graph input){
        for(int x=0;x<input.adjacency.length-1;x++){
            for(int y=0;y<input.adjacency.length-1;y++){
                System.out.print(input.adjacency[x][y]);
            }
        System.out.println();
        }
    }

    public static Edge getStartingLength(Graph input, int x) {
        Edge smallestLengthEdge = null;
        for (int z = 0; z < input.adjacency.length - 2; z++) {
            if (input.adjacency[x][z] != 0 && (smallestLengthEdge == null || input.adjacency[x][z] < smallestLengthEdge.weight)) {
                smallestLengthEdge = new Edge(input.places.get(x), input.places.get(z), input.adjacency[x][z]);
            }
        }
        return smallestLengthEdge;
    }
}
