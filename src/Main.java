import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Graph board = new Graph();

		// places
		board.addNode("Vancouver");
		board.addNode("Calgary");
		board.addNode("Seattle");
		board.addNode("Portland");
		board.addNode("Oregon");
		board.addNode("Salt Lake City");
		board.addNode("Helena");
		board.addNode("San Francisco");
		board.addNode("Los Angeles");
		board.addNode("Las Vegas");
		board.addNode("Phoenix");
		board.addNode("Santa Fe");
		board.addNode("El Paso");
		board.addNode("Houston");
		board.addNode("Dallas");
		board.addNode("Oklahoma City");
		board.addNode("Kansas City");
		board.addNode("Little Rock");
		board.addNode("Denver");
		board.addNode("Omaha");
		board.addNode("Duluth");
		board.addNode("Winnipeg");
		board.addNode("Sault St Marie");
		board.addNode("Chicago");
		board.addNode("Toronto");
		board.addNode("Pittsburgh");
		board.addNode("Montreal");
		board.addNode("Boston");
		board.addNode("New York");
		board.addNode("Washington");
		board.addNode("St Louis");
		board.addNode("Nashville");
		board.addNode("Raleigh");
		board.addNode("Atlanta");
		board.addNode("New Orleans");
		board.addNode("Charleston");
		board.addNode("Miami");

		// connections
		board.addPath("Vancouver", "Calgary", 3, 1);
		board.addPath("Vancouver", "Seattle", 1, 2);

		board.addPath("Calgary", "Vancouver", 3, 1);
		board.addPath("Calgary", "Seattle", 4, 1);
		board.addPath("Calgary", "Helena", 4, 1);
		board.addPath("Calgary", "Winnipeg", 6, 1);

		board.addPath("Seattle", "Vancouver", 1, 2);
		board.addPath("Seattle", "Calgary", 4, 1);
		board.addPath("Seattle", "Helena", 6, 1);
		board.addPath("Seattle", "Portland", 1, 2);

		board.addPath("Portland", "Seattle", 1, 2);
		board.addPath("Portland", "Salt Lake City", 6, 1);
		board.addPath("Portland", "San Francisco", 6, 2);

		board.addPath("Helena", "Calgary", 4, 1);
		board.addPath("Helena", "Seattle", 6, 1);
		board.addPath("Helena", "Salt Lake City", 3, 1);
		board.addPath("Helena", "Denver", 4, 1);
		board.addPath("Helena", "Omaha", 5, 1);
		board.addPath("Helena", "Duluth", 6, 1);
		board.addPath("Helena", "Winnipeg", 4, 1);

		board.addPath("Salt Lake City", "Portland", 6, 1);
		board.addPath("Salt Lake City", "Helena", 3, 1);
		board.addPath("Salt Lake City", "Denver", 3, 2);
		board.addPath("Salt Lake City", "Las Vegas", 3, 1);
		board.addPath("Salt Lake City", "San Francisco", 5, 2);

		board.addPath("San Francisco", "Portland", 5, 2);
		board.addPath("San Francisco", "Los Angeles", 3, 2);

		board.addPath("Los Angeles", "San Francisco", 3, 2);
		board.addPath("Los Angeles", "Las Vegas", 2, 1);
		board.addPath("Los Angeles", "Phoenix", 3, 1);
		board.addPath("Los Angeles", "El Paso", 6, 1);

		board.addPath("Las Vegas", "Salt Lake City", 3, 1);
		board.addPath("Las Vegas", "Los Angeles", 2, 1);

		board.addPath("Phoenix", "Los Angeles", 3, 1);
		board.addPath("Phoenix", "Denver", 5, 1);
		board.addPath("Phoenix", "Santa Fe", 3, 1);
		board.addPath("Phoenix", "El Paso", 3, 1);

		board.addPath("El Paso", "Los Angeles", 6, 1);
		board.addPath("El Paso", "Phoenix", 3, 1);
		board.addPath("El Paso", "Santa Fe", 2, 1);
		board.addPath("El Paso", "Oklahoma City", 5, 1);
		board.addPath("El Paso", "Dallas", 4, 1);
		board.addPath("El Paso", "Houston", 6, 1);

		board.addPath("Santa Fe", "El Paso", 2, 1);
		board.addPath("Santa Fe", "Phoenix", 3, 1);
		board.addPath("Santa Fe", "Denver", 2, 1);
		board.addPath("Santa Fe", "Oklahoma City", 3, 1);

		board.addPath("Denver", "Santa Fe", 2, 1);
		board.addPath("Denver", "Phoenix", 5, 1);
		board.addPath("Denver", "Salt Lake City", 3, 2);
		board.addPath("Denver", "Helena", 4, 1);
		board.addPath("Denver", "Omaha", 4, 1);
		board.addPath("Denver", "Kansas City", 4, 2);
		board.addPath("Denver", "Oklahoma City", 4, 1);

		board.addPath("Houston", "El Paso", 6, 1);
		board.addPath("Houston", "Dallas", 1, 2);
		board.addPath("Houston", "New Orleans", 2, 1);

		board.addPath("Dallas", "Houston", 1, 2);
		board.addPath("Dallas", "El Paso", 4, 1);
		board.addPath("Dallas", "Oklahoma City", 2, 2);
		board.addPath("Dallas", "Little Rock", 2, 1);

		board.addPath("Oklahoma City", "Dallas", 2, 2);
		board.addPath("Oklahoma City", "El Paso", 5, 1);
		board.addPath("Oklahoma City", "Santa Fe", 3, 1);
		board.addPath("Oklahoma City", "Denver", 4, 1);
		board.addPath("Oklahoma City", "Kansas City", 2, 2);
		board.addPath("Oklahoma City", "Little Rock", 2, 1);

		board.addPath("Kansas City", "Oklahoma City", 2, 2);
		board.addPath("Kansas City", "Denver", 4, 2);
		board.addPath("Kansas City", "Omaha", 1, 2);
		board.addPath("Kansas City", "St Louis", 2, 2);

		board.addPath("Little Rock", "New Orleans", 3, 1);
		board.addPath("Little Rock", "Dallas", 2, 1);
		board.addPath("Little Rock", "Oklahoma City", 2, 1);
		board.addPath("Little Rock", "St Louis", 2, 1);
		board.addPath("Little Rock", "Nashville", 3, 1);

		board.addPath("St Louis", "Little Rock", 2, 1);
		board.addPath("St Louis", "Kansas City", 2, 2);
		board.addPath("St Louis", "Chicago", 2, 2);
		board.addPath("St Louis", "Nashville", 2, 1);
		board.addPath("St Louis", "Pittsburgh", 5, 1);

		board.addPath("Chicago", "St Louis", 2, 2);
		board.addPath("Chicago", "Omaha", 4, 1);
		board.addPath("Chicago", "Duluth", 3, 1);
		board.addPath("Chicago", "Toronto", 4, 1);
		board.addPath("Chicago", "Pittsburgh", 4, 1);

		board.addPath("Duluth", "Helena", 6, 1);
		board.addPath("Duluth", "Winnipeg", 4, 1);
		board.addPath("Duluth", "Omaha", 2, 2);
		board.addPath("Duluth", "Sault St Marie", 3, 1);
		board.addPath("Duluth", "Toronto", 6, 1);
		board.addPath("Duluth", "Chicago", 3, 1);

		board.addPath("Omaha", "Helena", 5, 1);
		board.addPath("Omaha", "Duluth", 2, 2);
		board.addPath("Omaha", "Denver", 4, 1);
		board.addPath("Omaha", "Kansas City", 2, 2);
		board.addPath("Omaha", "Chicago", 4, 1);

		board.addPath("New Orleans", "Houston", 2, 1);
		board.addPath("New Orleans", "Little Rock", 3, 1);
		board.addPath("New Orleans", "Atlanta", 4, 2);
		board.addPath("New Orleans", "Miami", 6, 1);

		board.addPath("Sault St Marie", "Winnipeg", 6, 1);
		board.addPath("Sault St Marie", "Duluth", 3, 1);
		board.addPath("Sault St Marie", "Montreal", 5, 1);
		board.addPath("Sault St Marie", "Toronto", 2, 1);

		board.addPath("Winnipeg", "Sault St Marie", 6, 1);
		board.addPath("Winnipeg", "Calgary", 6, 1);
		board.addPath("Winnipeg", "Helena", 4, 1);
		board.addPath("Winnipeg", "Duluth", 4, 1);

		board.addPath("Montreal", "Sault St Marie", 5, 1);
		board.addPath("Montreal", "Toronto", 3, 1);
		board.addPath("Montreal", "New York", 3, 1);
		board.addPath("Montreal", "Boston", 2, 2);

		board.addPath("Toronto", "Sault St Marie", 2, 1);
		board.addPath("Toronto", "Duluth", 6, 1);
		board.addPath("Toronto", "Pittsburgh", 2, 1);
		board.addPath("Toronto", "Montreal", 3, 1);
		board.addPath("Toronto", "Chicago", 4, 1);

		board.addPath("Boston", "Montreal", 2, 2);
		board.addPath("Boston", "New York", 2, 2);

		board.addPath("New York", "Boston", 2, 2);
		board.addPath("New York", "Pittsburgh", 2, 2);
		board.addPath("New York", "Washington", 2, 2);

		board.addPath("Pittsburgh", "Toronto", 2, 1);
		board.addPath("Pittsburgh", "Chicago", 3, 2);
		board.addPath("Pittsburgh", "St Louis", 5, 1);
		board.addPath("Pittsburgh", "Nashville", 4, 1);
		board.addPath("Pittsburgh", "Raleigh", 2, 1);
		board.addPath("Pittsburgh", "Washington", 2, 1);
		board.addPath("Pittsburgh", "New York", 2, 2);

		board.addPath("Washington", "New York", 2, 2);
		board.addPath("Washington", "Pittsburgh", 2, 1);
		board.addPath("Washington", "Raleigh", 2, 2);

		board.addPath("Nashville", "St Louis", 2, 1);
		board.addPath("Nashville", "Pittsburgh", 4, 1);
		board.addPath("Nashville", "Raleigh", 3, 1);
		board.addPath("Nashville", "Little Rock", 3, 1);
		board.addPath("Nashville", "Atlanta", 1, 1);

		board.addPath("Raleigh", "Washington", 2, 2);
		board.addPath("Raleigh", "Nashville", 3, 1);
		board.addPath("Raleigh", "Atlanta", 2, 2);
		board.addPath("Raleigh", "Charleston", 2, 1);

		board.addPath("Atlanta", "Nashville", 1, 1);
		board.addPath("Atlanta", "Raleigh", 2, 2);
		board.addPath("Atlanta", "Charleston", 2, 1);
		board.addPath("Atlanta", "New Orleans", 4, 2);
		board.addPath("Atlanta", "Miami", 5, 1);

		board.addPath("Charleston", "Raleigh", 2, 1);
		board.addPath("Charleston", "Atlanta", 2, 1);
		board.addPath("Charleston", "Miami", 4, 1);

		board.addPath("Miami", "New Orleans", 5, 1);
		board.addPath("Miami", "Atlanta", 5, 1);
		board.addPath("Miami", "Charleston", 4, 1);

		// algorithms
		Tree tree = Kruskal.findTree(board);
		System.out.println(tree.edges.toString());
		System.out.println(tree.getDotFile());

		Tree tree_reverse = reverseDelete.fsp(board);
		System.out.println(tree_reverse.edges.toString());
		System.out.println(tree_reverse.getDotFile());
		int Count1 = 0;
		for (Edge e: tree_reverse.edges) {
			Count1 += e.weight;
		}
		System.out.println("Count = "+ Count1);
	}
}
