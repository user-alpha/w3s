public class disableOverrideModifiers {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    disableOverrideModifiers myObj = new disableOverrideModifiers();
    myObj.x = 50; 
    myObj.PI = 25; 
    System.out.println(myObj.x); 
  }
}
