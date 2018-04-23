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

	}
}