package br.unicap.edi.trees;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public boolean isEmpty() {
        if (this.root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T content){
        Node<T> aNode = new Node<>(content);
        if(this.isEmpty()){
            this.root = aNode;
        }
        else{
            this.root.insertNode(content);
        }
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

}
