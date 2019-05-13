public class ContactNode {

    private String name;
    private String phone;

    private ContactNode left;
    private ContactNode right;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ContactNode getLeft() {
        return left;
    }

    public void setLeft(ContactNode left) {
        this.left = left;
    }

    public ContactNode getRight() {
        return right;
    }

    public void setRight(ContactNode right) {
        this.right = right;
    }
}
