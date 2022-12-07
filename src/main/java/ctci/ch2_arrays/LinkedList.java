package ctci.ch2_arrays;

public class LinkedList {
    public void setNode(Node node) {
        this.node = node;
    }

    Node node;

    public LinkedList(Node n){
        node = n;
    }

    public void add(int i){
        if(node != null){
            node.append(i);
        }
    }
}
