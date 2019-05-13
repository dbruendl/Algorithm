public class IntList {

    private IntNode head;

    public void insertHead(Integer i){
        IntNode newNode = new IntNode();
        newNode.setData(i);
        newNode.setNext(head);
        head = newNode;
    }

    public void printList(){
        IntNode help = head;
        while(help != null){
            System.out.println(help.getData());
            help = help.getNext();
        }
    }

    public void insertTail(Integer i){
        if(head==null){
            insertHead(i);
        } else {
            IntNode newNode = new IntNode();
            newNode.setData(i);

            IntNode help = head;
            while(help.getNext() != null){
                help = help.getNext();
            }
            help.setNext(newNode);
        }
    }

    public void removeHead(){
        if(head!=null){
            head = head.getNext();
        }
    }
}
