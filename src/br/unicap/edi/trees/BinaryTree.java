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

    public void insert(T content) {
        Node<T> aNode = new Node<>(content);
        if (this.isEmpty()) {
            this.root = aNode;
        } else {
            this.root.insertNode(content);
        }
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void inOrder(){
        if(this.isEmpty()){
            System.out.println("Arvore vazia");
        }else{
            percorrerEmOrdem(this.root)
        }
    }

    private void percorrerEmOrdem(Node<T> root2) {
        if (root2 != null) {
            percorrerEmOrdem(root2.getLeft());
            System.out.println(root2.getContent());
            percorrerEmOrdem(root2.getRight());
        }
    }

}
