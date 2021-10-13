public class Main {

    public static void main(String args[]) {
        testFour();
    }

    public static void testFour() {
        // this is another graph from the ppt, with distinct edge weights
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//        Node n5 = new Node(5);
//        Node n6 = new Node(6);
//        Node n7 = new Node(7);
//        Node n8 = new Node(8);
//        Node n9 = new Node(9);
//        Node n10 = new Node(10);

        Graph G = new Graph();
        G.addNode(n1);
        G.addNode(n2);
        G.addNode(n3);
//        G.addNode(n4);
//        G.addNode(n5);
//        G.addNode(n6);
//        G.addNode(n7);
//        G.addNode(n8);
//        G.addNode(n9);
//        G.addNode(n10);

        G.addEdge(n1, n2, 1);
        G.addEdge(n1, n3, 2);
        G.addEdge(n2, n3, 5);
//        G.addEdge(n2, n4, 4);
//        G.addEdge(n2, n5, 7);
//        G.addEdge(n2, n9, 8);
//        G.addEdge(n3, n4, 3);
//        G.addEdge(n3, n6, 16);
//        G.addEdge(n4, n5, 6);
//        G.addEdge(n5, n6, 17);
//        G.addEdge(n5, n8, 11);
//        G.addEdge(n5, n9, 9);
//        G.addEdge(n6, n7, 15);
//        G.addEdge(n6, n10, 14);
//        G.addEdge(n7, n8, 12);
//        G.addEdge(n8, n9, 10);
//        G.addEdge(n8, n10, 13);
        G.print();

        G.kruskal();
    }
}
