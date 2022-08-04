package LinkedListProject;

public class SinglyList {
    Node head,temp,tail;
    public void addAtBeg(int data)
    {
        Node node= new Node(data);
        if(head!=null)
            node.next=head;
        head=tail=node;// if head == null
    }
    public void addAtEnd(int data)
    {
        Node node=new Node(data);
        if(head!=null)
        {
            tail.next=node;
            tail=node;// add node at end
        }
        else
         head=tail=node;
    }
    public int addAtPos(int pos,int data)
    {
        if(pos<1||pos>Node.length){ return -1;}// invalid pos : return -1;
        else if(pos==1)
        {
            addAtBeg(data);// if pos ==1(add at beg)
            return 0;
        }else
        {Node node=new Node(data);
            int i=1;
            temp=head;
            while(i<pos-1)// traverse till pos -1
            {
                temp=temp.next;
                i++;
            }node.next=temp.next;// link between previous data
            temp.next=node;// insert node at temp next
            return 0;
        }
    }
    public int deleteFromBeg()
    { int data=-1;
        if(head==null)return data;
        else if(head.next==null)
        {
            data=head.data;head=tail=null;Node.length=0;
        }
        else {
            Node.length--;
            data = head.data;
            head = head.next;
        }
        return data;
    }
    public int deleteFromEnd()
    {
        int data=-1;
        temp=head;
        if(head==null)return data;
        else if(head.next==null) {
            data = head.data;head=tail=null;Node.length=0;
        }
        else
        { Node.length--;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }data=temp.next.data;
            temp.next=null;
        }return data;
    }
    public int deleteFromPos(int pos)
    { int data=-1;
        if(pos<1||pos>Node.length){return  -1;}
        else if(pos==1){ data=deleteFromBeg();}
        else if(pos==Node.length){data=deleteFromEnd();}
        else
        {temp=head;
            int i=1;
            while(i<pos-1)
            {
                temp=temp.next;i++;
            }data=temp.next.data;// store deleted_data
            temp=temp.next.next;// make further linking
        }
        return data;
    }
    public int reverse()
    {
        Node current, prev, nextnode;
        if(head==null)return -1;
        else if(head.next==null)return 0;
        else
        {
            current=head;prev=null;
            while(current!=null)
            {
                nextnode=current.next;
                current.next=prev;
                prev=current;
                current=nextnode;
            }head=prev;
        }return 0;
    }
    public int Display()
    {
        if(head==null) return -1;
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println(temp.data);
        return 0;
    }
}
