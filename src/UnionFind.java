// CS224 Fall 2021

public class UnionFind {
    NodeRecord[] sets;

    public UnionFind(Graph g) {
        sets = new NodeRecord[1 + g.nodes.size()];
        for (int i=0; i<g.nodes.size(); ++i) {
            Node n = g.nodes.get(i);
            sets[n.name] = new NodeRecord(g.nodes.get(i), null);
        }
    }

    public Node Find(Node n) {
        int c = 0;
        NodeRecord root, next;

        NodeRecord nr = this.sets[n.name];
        while (nr.parent != null) {
            nr = nr.parent;
            c = c + 1;
        }
        // System.out.println("find " + n.name + ": I looked at " + c + " nodes");

        root = nr;

        // now go pack through and set the name for all of the intermediate nodes
        nr = this.sets[n.name];
        while (nr.parent != null) {
            next = nr.parent;
            nr.parent = root;
            nr = next;
        }

        return root.node;
    }

    public void Union(Node set1, Node set2) {
        this.sets[set2.name].parent = this.sets[set1.name];
        this.sets[set2.name] = this.sets[set1.name];
    }
}
