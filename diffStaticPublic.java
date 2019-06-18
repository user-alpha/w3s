public class diffStaticPublic {
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    myStaticMethod(); 

    diffStaticPublic myObj = new diffStaticPublic(); 
    myObj.myPublicMethod();
  }
}