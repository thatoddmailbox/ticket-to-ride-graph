import java.lang.reflect.Array;
import java.util.ArrayList;

public class Graph {
	public int[][] adjacency;
	public ArrayList<String> places;
	public ArrayList<Integer> traverse_state;

	public Graph() {
		places = new ArrayList<>();
		traverse_state = new ArrayList<>();
		adjacency = new int[0][0];
	}

	public Graph(Graph clone) {
		adjacency = new int[clone.adjacency.length][clone.adjacency[0].length];
		for (int i = 0; i < clone.adjacency.length; i++) {
			for (int j = 0; j < clone.adjacency[i].length; j++) {
				adjacency[i][j] = clone.adjacency[i][j];
			}
		}
		places = new ArrayList<>();
		for (String clonePlace : clone.places) {
			places.add(clonePlace);
		}
		traverse_state = new ArrayList<>();
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

	public void deletePath(int fromIndex, int toIndex){
		adjacency[fromIndex][toIndex] = 0;
		adjacency[toIndex][fromIndex] = 0;
	}
	public int numbOfTrees(){
		traverse_state.clear();

		int startNode = 0;
		int count = 0;
		for (int i = 0; i < places.size(); i++) {
			traverse_state.add(0); //0,1,2 states
		}
		numbOfTrees(0, traverse_state);

		for (int i = 0; i < traverse_state.size(); i++) {
			if(traverse_state.get(i) == 2){
				count++;
			}
		}
		return count;

	}

	public void numbOfTrees( int wya, ArrayList<Integer> states){
		 //set to state 2 meaning visited
		states.set(wya, 1);
		for (int i = 0; i < adjacency[wya].length; i++) {
			if(adjacency[wya][i] != 0 && states.get(i) == 0){
				//System.out.println("HERE");
				numbOfTrees(i, states);
			}
		}
		states.set(wya, 2);

	}

	public void addPath(String from, String to, int length, int pathCount) {
		int fromIndex = places.indexOf(from);
		int toIndex = places.indexOf(to);
		adjacency[fromIndex][toIndex] = length;
	}
}

