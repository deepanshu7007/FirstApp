class Node3
{
    int value;
    Node3 link;
    Node3(int value){
        this.value = value;
    }
}
 class InsertNode {
    private static Node3 insertNode(int value,int loc,Node3 head)
    {
        Node3 temp = head;
        Node3 prev = head;
        int pos = 0;
        if(loc==0)
        {
            Node3 newOne = new Node3(value);
            newOne.link = head;
            head = newOne;
        }
        else
        {
            while(temp!=null)
            {
                if(pos ==loc)
                {
                    Node3 n = new Node3(value);
                    n.link = temp;
                    prev.link = n;
                }
                prev = temp;
                temp = temp.link;
                pos+=1;
            }
        }

        return head;
    }
    private static void printList(Node3 head){
        while(head!=null)
        {
            System.out.println(head.value);
            head = head.link;
        }
    }
    public static void main(String[] args)
    {
        Node3 head = new Node3(1);
        head.link = new Node3(2);
        head.link.link = new Node3(3);
        head.link.link.link = new Node3(4);
        head.link.link.link.link = new Node3(5);
        head.link.link.link.link.link = new Node3(6);
        head.link.link.link.link.link.link = null;
        head = insertNode(10,2-1,head);
        printList(head);
    }
}
