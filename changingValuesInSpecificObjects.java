public class changingValuesInSpecificObjects {
  int x = 5;

  public static void main(String[] args) {
    changingValuesInSpecificObjects myObj1 = new changingValuesInSpecificObjects();  // Object 1
    changingValuesInSpecificObjects myObj2 = new changingValuesInSpecificObjects();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}