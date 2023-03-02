package linkedlist;

public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public static int countNode(Node node){
        int count =1;

        Node current = node;
        while(current.next !=null){
            current = current.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node nodeA = new Node(10);
        Node nodeB = new Node(20);
        Node nodeC = new Node(30);

        nodeA.next = nodeB;
        nodeB.next = nodeC;

        System.out.println(countNode(nodeA));
    }
}
