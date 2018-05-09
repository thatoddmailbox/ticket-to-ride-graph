import java.util.*;
public class Prims {
    public static Tree Prims(Graph input) {
        boolean done = false;
        int z = 0;
        Boolean checkedFullTree= false;
        Edge smallestLengthEdge = null;
        Tree MST = new Tree();
        int[] currentcities = new int [input.adjacency.length+100];
        int counter = 0;
        print(input);
        currentcities[0]=0;
        while (!done) {
            int finito = 0;
            checkedFullTree= false;
            while(!checkedFullTree) {
                smallestLengthEdge = getStartingLength(input);
                for (int x = 0; x < currentcities.length-1; x++){
                    for (int y = 0; y < input.adjacency.length - 2; y++) {
                        if (input.adjacency[currentcities[x]][y] != 0) {
//                    System.out.println(input.places.get(x) + " --> " + input.places.get(y) + " (" + input.adjacency[x][y] + ")");
                            if (input.adjacency[currentcities[x]][y] <= smallestLengthEdge.weight && !MST.nodes.contains(input.places.get(y))) {
//                                System.out.println(input.places.get(currentcities[x]) + " --> " + input.places.get(y) + " (" + input.adjacency[currentcities[x]][y] + ")");
//                                System.out.println(input.places.get(y));
                                smallestLengthEdge = new Edge(input.places.get(x), input.places.get(y), input.adjacency[x][y]);
                                currentcities[z]=y;
//                                System.out.println("smallest edge" + smallestLengthEdge);
                            }
                        }
                    }
                    System.out.println("next tree in the forest");
                }
                System.out.println("checked the whole forest");
                checkedFullTree=true;
            }
            if(!MST.addingEdgeWouldCauseCycle(smallestLengthEdge)) {
                MST.addEdge(smallestLengthEdge);
                System.out.println("adding");
                z++;
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

    public static Edge getStartingLength(Graph input) {
        int x = 0;
        Edge smallestLengthEdge = null;
        for (int z = 0; z < input.adjacency.length - 2; z++) {
            if (input.adjacency[x][z] != 0) {
                smallestLengthEdge = new Edge(input.places.get(x), input.places.get(z), input.adjacency[x][z]);
            }
        }
        return smallestLengthEdge;
    }
}
