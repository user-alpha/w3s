public class creatingMultipleObjects {
  int x = 5;

  public static void main(String[] args) {
    creatingMultipleObjects myObj1 = new creatingMultipleObjects();  // Object 1
    creatingMultipleObjects myObj2 = new creatingMultipleObjects();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}