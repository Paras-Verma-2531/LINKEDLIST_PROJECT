package LinkedListProject;
public class Node {
    Node next,prev;
     int data;
    protected  static int length;
    public Node(int data)
    {
        this.data=data;
        next=prev=null;
        length++;
    }
}
