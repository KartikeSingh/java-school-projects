public class LinkedList {

  node2 parent;

  LinkedList(int i) {
    parent = new node2(10);
    node2 t = parent;

    for (int j = 1; j < i; j++) {
      t.next = new node2(12 + j);
      t = t.next;
    }
  }

  void pushStart(int v) {
    node2 newParent = new node2(v);

    newParent.next = parent;

    parent = newParent;
  }

  void pushEnd(int v) {
    node2 t = parent;

    while ((t.next != null)) t = t.next;

    t.next = new node2(v);
  }

  void pushMid(int v, int index) {
    if (index == 0) {
      node2 newParent = new node2(v);

      newParent.next = parent;

      parent = newParent;

      return;
    }

    node2 child = new node2(v);
    node2 t = parent;

    for (int j = 0; j < index && (t.next != null); j++) {
      t = t.next;
    }

    node2 oldChild = t.next;
    t.next = child;
    child.next = oldChild;
  }

  node2 popStart() {
    node2 oldParent = parent;
    parent = parent.next;

    return oldParent;
  }

  node2 popEnd() {
    int l = size();
    node2 secondLast = getNode(l - 2);
    node2 last = getNode(l - 1);

    System.out.println(l + ":" + secondLast.data + ":" + last.data);
    secondLast.next = null;

    return last;
  }

  node2 popMid(int index) {
    if (index == 0) {
      node2 oldParent = parent;
      parent = parent.next;

      return oldParent;
    }

    node2 from = getNode(index - 1);
    node2 removed = getNode(index);
    node2 to = getNode(index + 1);

    if (from != null) from.next = to;

    return removed;
  }

  void display() {
    System.out.println("List (" + size() + "): ");

    node2 t = parent;

    while ((t != null)) {
      System.out.println(t.data);
      t = t.next;
    }
  }

  int size() {
    int l = 1;

    node2 t = parent;

    while ((t.next != null)) {
      t = t.next;
      l++;
    }

    return l;
  }

  node2 getNode(int index) {
    int i = 0;
    node2 t = parent;

    for (; i < index && (t.next != null); i++) {
      t = t.next;
    }

    return i < index ? null : t;
  }

  public static void main(String[] args) {
    LinkedList l = new LinkedList(5);

    l.display();

    l.pushStart(1);
    l.display();

    l.pushEnd(0);
    l.display();

    l.pushMid(-1, 0);
    l.display();

    l.pushMid(1234, 2);
    l.display();

    l.pushMid(69, 10);
    l.display();

    System.out.println("Pop From Start: " + l.popStart().data);
    l.display();

    System.out.println("Pop From End: " + l.popEnd().data);
    l.display();

    System.out.println("Pop From Mid: " + l.popMid(0).data);
    l.display();

    System.out.println("Pop From Mid: " + l.popMid(2).data);
    l.display();

    node2 removed = l.popMid(10);
    if (removed != null) System.out.println(
      "Pop From Mid: " + removed.data
    ); else System.out.println("Pop From Mid: No Node Found");
    l.display();
  }
}

class node2 {

  node2 next;
  int data;

  node2(int v) {
    data = v;
  }

  node2(int v, node2 n) {
    data = v;
    next = n;
  }
}
