public class stack {

  int cap, data[], i;

  stack(int c) {
    cap = c;
    data = new int[c];
    i = -1;
  }

  void push(int v) {
    if (i == cap - 1) {
      System.out.println("Overflow");
      return;
    }

    data[++i] = v;
  }

  int pop() {
    if (i == -1) {
      System.out.println("Underflow");
      return -1;
    }

    return data[i--];
  }

  int seek() {
    if (i == -1) {
      System.out.println("Underflow");
      return -1;
    }

    return data[i];
  }

  void display() {
    if (i == -1) {
      System.out.println("Underflow");
      return;
    }

    System.out.println("Stack:");
    for (int j = 0; j <= i; j++) {
      System.out.println(data[j]);
    }
  }

  public static void main(String[] args) {
    stack s = new stack(5);

    System.out.println(s.pop());

    s.push((int) (Math.random() * 1000) + 500);

    s.display();

    s.push((int) (Math.random() * 1000) + 500);

    s.display();

    System.out.println(s.seek());

    s.push((int) (Math.random() * 1000) + 500);

    s.display();

    s.push((int) (Math.random() * 1000) + 500);

    s.display();

    System.out.println(s.pop());

    s.display();
}
}
