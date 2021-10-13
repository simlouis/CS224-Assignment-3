public class Edge implements Comparable {
    Node n1;
    Node n2;
    int weight;

    public Edge(Node n1, Node n2, int weight) {
        this.n1 = n1;
        this.n2 = n2;
        this.weight = weight;
    }

    public int compareTo(Object o) {
        Edge otherEdge = (Edge) o;
        if (this.weight < otherEdge.weight)
            return -1;
        else if (this.weight > otherEdge.weight)
            return 1;
        else
            return 0;
    }

    public String toString() {
        String s = this.n1.name + " - " + this.n2.name + " (" + this.weight + ")";
        return s;
    }
}
