class Node1{
    int data;
    Node1 next;

    Node1(int x){
        data = x;
        next = null;
    }
}
class SagrigateLinkedList {
    private static Node1 divide(int N, Node1 head){
        Node1 temp,tail;
        temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        tail = temp;
        temp=head;
        while(temp!=null)
        {
            if((temp.data%2)==1) {
                tail.next = temp;
                tail = tail.next;
                tail.next = null;
            }
            temp=temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        return null;
    }
    public static void main(String[] args)
    {
        Node1 head = new Node1(1);
         head.next = new Node1(2);
         head.next.next = new Node1(3);
         head.next.next.next = new Node1(4);
         head.next.next.next.next = new Node1(5);
        head = divide(5,head);
    }
}
