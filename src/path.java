public class path {
    public int side_a;
    public int side_b;
    public int weight;

    public int compareTo(path other) {
        int compareage = ((path)other).weight;
        return compareage-this.weight;
    }

}
