import java.util.Objects;

public class Edge {
	public String firstCity;
	public String secondCity;

	public Edge(String f, String t) {
		firstCity = f;
		secondCity = t;
	}

	@Override
	public String toString() {
		return "Edge{" + firstCity + " -> " + secondCity + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!Edge.class.isAssignableFrom(obj.getClass())) {
			return false;
		}

		final Edge other = (Edge) obj;

		if (!this.firstCity.equals(other.firstCity) || !this.secondCity.equals(other.secondCity)) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstCity, secondCity);
	}
}
