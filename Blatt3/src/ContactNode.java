public class ContactNode {

    private ContactNode next;
    private ContactNode prev;
    private String name;
    private String phone;

    public ContactNode getNext() {
        return next;
    }

    public ContactNode getPrev() {
        return prev;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setNext(ContactNode next) {
        this.next = next;
    }

    public void setPrev(ContactNode prev) {
        this.prev = prev;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
