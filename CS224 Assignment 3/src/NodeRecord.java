// CS224 Fall 2021

public class NodeRecord {
    Node node;
    NodeRecord parent;

    public NodeRecord(Node node, NodeRecord parent) {
        this.node = node;
        this.parent = parent;
    }
}
