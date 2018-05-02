import java.util.ArrayList;

public class reverse_delete {
    public static Graph fsp(Graph initial_graph){
        ArrayList<Integer>[][] sorted_adjacency;
        ArrayList<path> paths;
        boolean sorted = false;

        for (int i = 0; i < initial_graph.adjacency.length; i++) {
            for (int j = 0; j < initial_graph.adjacency[i].length; j++) {
                path new_path = new path();
                new_path.side_a = i;
                new_path.side_b = j;
                new_path.weight = initial_graph.adjacency[i][j];

                //paths.add()
                //[adjancency from] [adjacency to]
            }
        }

        return initial_graph;
    }
}
