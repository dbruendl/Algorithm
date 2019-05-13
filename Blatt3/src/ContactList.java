import java.util.List;

public class ContactList {

	private ContactNode head = new ContactNode();

	public void insert (String name, String phone) {
		if(this.head.getName() == null){
			head.setName(name);
			head.setPhone(phone);
		}else {
			ContactNode newNode = new ContactNode();
			ContactNode help = head;
			newNode.setName(name);
			newNode.setPhone(phone);
			if (help.getName().compareTo(newNode.getName()) > 0 || help.getName().compareTo(newNode.getName()) == 0) {
				newNode.setNext(head);
				head.setPrev(newNode);
				head = newNode;
			} else {
				while (help.getName().compareTo(newNode.getName()) < 0 && help.getNext() != null) {
					help = help.getNext();
				}
				newNode.setNext(help.getNext());
				newNode.setPrev(help);
				help.setNext(newNode);
				if(newNode.getNext() != null) {
					newNode.getNext().setPrev(newNode);
				}
			}
		}
	}

	public void delete(String name){
		ContactNode help = head;
		while(help.getName().compareTo(name) != 0){
			help = help.getNext();
		}
		help.getPrev().setNext(help.getNext());
		help.getNext().setPrev(help.getPrev());
	}

	private ContactNode getLastElem() {
		ContactNode le = head;
		while(le.getNext() != null){
			le = le.getNext();
		}
		return le;
	}

	public void printListAsc(){
		ContactNode help = this.getLastElem();
		while(help != null){
			System.out.println(help.getName() + ": " + help.getPhone());
			help = help.getPrev();
		}
	}

	public void printListDesc(){
		ContactNode help = head;
		while(help != null){
			System.out.println(help.getName() + ": " + help.getPhone());
			help = help.getNext();
		}
	}

	public static void main(String[] args) {
			ContactList cl = new ContactList();
			cl.insert("Asder","545545545");
			cl.insert("Kusukuss","5254614684");
			cl.insert("Yolo","4565465");
			cl.insert("Anna","4646846");
			cl.insert("Kathi","5254614684");
			cl.insert("Zoro","5254614684");



			cl.printListDesc();

			System.out.println("");

			cl.printListAsc();

			cl.delete("Kusukuss");
			System.out.println("");

			cl.printListDesc();

	}

}