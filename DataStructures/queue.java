public class queue {

  int cap, data[], f, r;

  queue(int c) {
    cap = c;
    data = new int[c];
    f = -1;
    r = -1;
  }

  void push(int v) {
    if (r == cap - 1) {
      System.out.println("Overflow");
      return;
    }

    data[++r] = v;
  }

  int dequeue() {
    if (f == r) {
      System.out.println("Underflow");
      return -1;
    }

    return data[++f];
  }

  int seekEnd() {
    if (r == -1) {
      System.out.println("Underflow");
      return -1;
    }

    return data[r];
  }

  int seekStart() {
    if (r == -1) {
      System.out.println("Underflow");
      return -1;
    }

    return data[f + 1];
  }

  void display() {
    if (r == -1) {
      System.out.println("Underflow");
      return;
    }

    System.out.println("Queue:");
    for (int j = f + 1; j <= r; j++) {
      System.out.println(data[j]);
    }
  }

  public static void main(String[] args) {
    queue q = new queue(5);

    System.out.println(q.dequeue());

    q.push((int) (Math.random() * 1000) + 500);

    q.display();

    q.push((int) (Math.random() * 1000) + 500);

    q.display();

    System.out.println(q.seekEnd());
    System.out.println(q.seekStart());

    q.push((int) (Math.random() * 1000) + 500);

    q.display();

    q.push((int) (Math.random() * 1000) + 500);

    q.display();

    System.out.println("Removed:" + q.dequeue());

    q.display();
  }
}
