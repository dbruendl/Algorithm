public class BinTree {

    private ContactNode root;

    public void insert(String name, String phone){
        ContactNode q = new ContactNode();
        q.setName(name);
        q.setPhone(phone);

        ContactNode r = null;
        ContactNode p = root;

        while(p != null) {
            r = p;
            if(q.getName().compareTo(p.getName()) < 0) {
                p = p.getLeft();
            }else{
                p = p.getRight();
            }
        }
        if (r==null){
            root=q;
        }else{
            if(q.getName().compareTo(r.getName()) < 0){
                r.setLeft(q);
            }else{
                r.setRight(q);
            }
        }
    }

    private void inOrder(ContactNode r){
        if(r!=null) {
            inOrder(r.getLeft());
            System.out.println(r.getName() + " (" + r.getPhone() + ")");
            inOrder(r.getRight());
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrderNR(){
        ContactNode help = root;
        if(help != null){
            while(help.getLeft() != null){
                help = help.getLeft();
            }
        }
    }
}
