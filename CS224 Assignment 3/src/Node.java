// CS224 Fall 2021

import java.util.ArrayList;
import java.lang.Comparable;

public class Node implements Comparable {
    ArrayList<Link> adjlist;
    int name;
    int weight; // only need for PQ implementation, for grad students

    public Node(int name) {
        this.name = name;
        this.adjlist = new ArrayList<Link>();
        this.weight = 0;
    }

    public void add(Link edge) {
        this.adjlist.add(edge);
    }

    public int compareTo(Object o) {
        Node otherNode = (Node) o;
        if (this.weight < otherNode.weight)
            return -1;
        else if (this.weight > otherNode.weight)
            return 1;
        else
            return 0;
    }
}
