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

    public void inOrder() {
        if (this.isEmpty()) {
            System.out.println("Arvore vazia");
        } else {
            percorrerEmOrdem(this.root);
        }
    }

    private void percorrerEmOrdem(Node<T> root2) {
        if (root2 != null) {
            percorrerEmOrdem(root2.getLeft());
            System.out.println(root2.getContent());
            percorrerEmOrdem(root2.getRight());
        }
    }

    public void inserir(T content) {
        Node<T> aux, novo;
        aux = this.root;
        novo = new Node<>(content);
        if (this.isEmpty()) {
            this.root = novo;
            return;
        }
        while (true) {
            if (content.compareTo(aux.getContent()) == 0) {
                System.out.println("Repeated");
                break;
            } else if (content.compareTo(aux.getContent()) < 0) { // inserção no lado esquerdo
                if (aux.getLeft() != null) {
                    aux = aux.getLeft();
                } else {
                    // inserir
                    aux.setLeft(novo);
                    break;
                }
            } else {// inserção no lado direito
                if (aux.getRight() != null) {
                    aux = aux.getRight();
                } else {
                    // inserir
                    aux.setRight(novo);
                    break;
                }
            }
        }
    }

}
