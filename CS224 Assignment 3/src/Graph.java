// CS224 Fall 2021

import java.util.ArrayList;
import java.util.Queue;
import java.util.PriorityQueue;

public class Graph {
    ArrayList<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<Node>();
    }

    public void addNode(Node n) {
        for (int i=0; i<nodes.size(); ++i) {
            if (nodes.get(i).name == n.name) {
                System.out.println("ERROR: graph already has a node " + n.name);
                assert false;
            }
        }
        nodes.add(n);
    }

    public void addEdge(Node n1, Node n2, int weight) {
        // make sure node2 >= node1
        if (n1.name > n2.name) {
            System.out.println("ERROR: adding edge between node " + n1.name + " and " + n2.name + " with n1.name > n2.name");
            return;
        }

        // make sure edge does not already exist

        int idx1 = this.nodes.indexOf(n1);
        if (idx1 >= 0) {
            for (int i=0; i<this.nodes.get(idx1).adjlist.size(); ++i) {
                Link link = this.nodes.get(idx1).adjlist.get(i);
                if (link.n2.name == n2.name) {
                    System.out.println("ERROR: there is already an edge from " + n1.name + " to " + n2.name);
                    return;
                }
            }

            Link e1 = new Link(n2, weight);
            this.nodes.get(idx1).add(e1);
        } else {
            System.out.println("ERROR: node " + n1.name + " not found in graph");
        }

        int idx2 = this.nodes.indexOf(n2);
        if (idx2 >= 0) {
            Link e2 = new Link(n1, weight);
            this.nodes.get(idx2).add(e2);
        } else {
            System.out.println("ERROR: node " + n1.name + " not found in graph");
        }
    }

    public void print() {
        for (int i=0; i<this.nodes.size(); ++i) {
            Node n = this.nodes.get(i);
            System.out.print("Node " + n.name + ":");
            for (int j=0; j<n.adjlist.size(); ++j)
                System.out.print(" " + n.adjlist.get(j).n2.name + " (d=" + n.adjlist.get(j).weight + ")");
            System.out.println();
        }
    }

    public int kruskal() {
        // implement this
    }
}
