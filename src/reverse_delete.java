import java.util.ArrayList;

public class reverse_delete {
    public static Graph fsp(Graph initial_graph){
        ArrayList<Integer>[][] sorted_adjacency;
        ArrayList<path> paths = new ArrayList<>();
        boolean sorted = false;

        for (int i = 0; i < initial_graph.adjacency.length; i++) {
            for (int j = 0; j < initial_graph.adjacency[i].length; j++) {
                boolean duplicate = false;
                System.out.println("HERe");
                path new_path = new path();
                new_path.side_a = i;
                new_path.side_b = j;
                new_path.weight = initial_graph.adjacency[i][j];
                for (int k = 0; k < paths.size(); k++) {
                    if(new_path.side_a == paths.get(k).side_b && new_path.side_b == paths.get(k).side_a){
                        duplicate = true;
                    }
                }
                if(new_path.weight!=0){
                    if(duplicate == false){
                        paths.add(new_path);
                    }

                }


                //[adjancency from] [adjacency to]
            }
        }
        for (int i = 0; i < paths.size(); i++){
            if(!deletingwouldfuckitup(initial_graph , paths.get(i), paths)){
                initial_graph.deletePath(paths.get(i).side_a, paths.get(i).side_b);
            }
        }
        System.out.println(initial_graph.numbOfTrees());
        int numofpaths = 0;
        for (int i = 0; i < initial_graph.adjacency.length; i++) {
            for (int j = 0; j < initial_graph.adjacency[0].length; j++) {
                if(initial_graph.adjacency[j][i] != 0){
                    numofpaths++;
                }
            }
        }
        System.out.println("Paths: "+numofpaths/2);
        return initial_graph;
    }

    public static boolean deletingwouldfuckitup(Graph g, path p, ArrayList<path> ps){
        Graph g2 = g;
        int estimated_length = ps.size();
        g2.deletePath(p.side_a, p.side_b);
        if (g2.numbOfTrees() == g.numbOfTrees()){
            return false;
        }else{
            return true;
        }
    }
}
