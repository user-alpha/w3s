public class overridingExistingValues {
  int x = 10;

  public static void main(String[] args) {
    overridingExistingValues myObj = new overridingExistingValues();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x); 
  }
}