public class Main {
    public static void main(String[] args){
        IntList list = new IntList();

        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(100);

        list.insertTail(50);

        list.removeHead();

        list.printList();
    }
}
