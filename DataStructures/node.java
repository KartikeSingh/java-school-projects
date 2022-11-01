import java.util.Scanner;

public class node {
    static Scanner sc = new Scanner(System.in);
    node previousLink, nextLink;
    int data;

    node() {
        previousLink = null;
        nextLink = null;
        data = 0;
    }

    void create() {
        this.previousLink = null;
        node parent = this;

        System.out.println("How many nodes do you want in this doubly linked list?");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            node child = new node();
            child.previousLink = parent;
            parent.nextLink = child;

            System.out.println("Give the data of a node with index " + i);
            child.data = sc.nextInt();

            parent = child;
        }
    }

    void display() {
        node start = this.getStart();

        while (start.nextLink != null) {
            System.out.print(start.data + ", ");
            start = start.nextLink;
        }

        System.out.print(start.data + "\n");
    }

    void insertStart() {
        node start = this.getStart();
        node newNode = new node();

        System.out.println("Give the data of the node");

        newNode.data = sc.nextInt();
        newNode.nextLink = start;
        start.previousLink = newNode;
    }

    void insertEnd() {
        node end = this.getEnd();
        node newNode = new node();

        System.out.println("Give the data of the node");

        newNode.data = sc.nextInt();
        newNode.previousLink = end;
        end.nextLink = newNode;
    }

    void insertMid() {
        System.out.println("Give the index of the node after which you want to connect a new node");
        int index = sc.nextInt();

        node parent = this.getNode(index);

        if (parent == null) {
            System.out.println("Invalid index, No node found at that index");
            return;
        }

        node child = parent.nextLink;
        node newNode = new node();

        System.out.println("Give the data of the node");

        newNode.data = sc.nextInt();
        newNode.previousLink = parent;
        newNode.nextLink = child;
        parent.nextLink = newNode;

        if (child != null) {
            child.previousLink = newNode;
        }
    }

    node getStart() {
        node start = this;

        while (start.previousLink != null)
            start = start.previousLink;

        return start;
    }

    node getEnd() {
        node end = this;

        while (end.nextLink != null)
            end = end.nextLink;

        return end;
    }

    node getNode(int index) {
        node indexedNode = this.getStart();

        for (int i = 0; i < index && indexedNode.nextLink != null; i++) {
            indexedNode = indexedNode.nextLink;
        }

        return indexedNode;
    }

    public static void main(String[] args) {
        node x = new node();

        x.create();
        x.display();

        x.insertStart();
        x.display();

        x.insertEnd();
        x.display();

        x.insertMid();
        x.display();
    }
}