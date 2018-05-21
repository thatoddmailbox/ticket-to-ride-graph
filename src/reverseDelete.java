import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class reverseDelete {
    public static Tree fsp(Graph initialGraph){
        ArrayList<path> sortedAdjacency;
        ArrayList<path> paths = new ArrayList<>();
        boolean sorted = false;
        for (int i = 0; i < initialGraph.adjacency.length; i++) {
            for (int j = 0; j < initialGraph.adjacency[i].length; j++) {
                boolean duplicate = false;
                //System.out.println("HERe");
                path newPath = new path();
                newPath.side_a = i;
                newPath.side_b = j;
                newPath.weight = initialGraph.adjacency[i][j];
                for (int k = 0; k < paths.size(); k++) {
                    if(newPath.side_a == paths.get(k).side_b && newPath.side_b == paths.get(k).side_a){
                        duplicate = true;
                    }
                }
                if(newPath.weight!=0){
                    if(duplicate == false){
                        paths.add(newPath);
                    }
                }//[adjancency from] [adjacency to]
            }
        }
//sort the paths by length
        Collections.sort(paths, new Comparator<path>() {
            public int compare(path p1, path p2) {
                return p2.weight - p1.weight; // Ascending
            }
        });


        for (int i = 0; i < paths.size(); i++){
            //System.out.println(deleteCheck(initialGraph , paths.get(i), paths));
            if(!deleteCheck(initialGraph , paths.get(i), paths)){
                initialGraph.deletePath(paths.get(i).side_a, paths.get(i).side_b);
            }
        }
        System.out.println(initialGraph.numbOfTrees());
        int numofpaths = 0;
        for (int i = 0; i < initialGraph.adjacency.length; i++) {
            for (int j = 0; j < initialGraph.adjacency[0].length; j++) {
                if(initialGraph.adjacency[i][j] != 0 ){
                    numofpaths++;
                }
            }
        }
        System.out.println("Paths: "+numofpaths/2);
        Tree t = new Tree();
        for (int i = 0; i < initialGraph.places.size(); i++) {
            t.addNode(initialGraph.places.get(i));
        }
        for (int i = 0; i < initialGraph.adjacency.length; i++) {
            for (int j = 0; j < initialGraph.adjacency[0].length; j++) {
                if(initialGraph.adjacency[i][j]!= 0 ){
                    t.addEdge(new Edge(initialGraph.places.get(i), initialGraph.places.get(j), initialGraph.adjacency[i][j]));
                    initialGraph.deletePath(i,j);
                }
            }
        }
        return t;
    }
    public static boolean deleteCheck(Graph g, path p, ArrayList<path> ps){
        Graph g2 = new Graph(g);
        int estimated_length = ps.size();
        g2.deletePath(p.side_a, p.side_b);
        System.out.println(g2.numbOfTrees()+ " "+g.numbOfTrees());
        if (g2.numbOfTrees() == g.numbOfTrees()){
            return false;
        }else{
            return true;
        }
    }
}
