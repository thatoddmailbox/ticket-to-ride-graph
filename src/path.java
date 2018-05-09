public class path {
    public int side_a;
    public int side_b;
    public int weight;


    public int compareTo(path comparestu) {
        int compareage=((path)comparestu).weight;
        return compareage-this.weight;
    }

}
