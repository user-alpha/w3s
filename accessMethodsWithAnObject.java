public class accessMethodsWithAnObject {
 
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
    accessMethodsWithAnObject myCar = new accessMethodsWithAnObject();     
    myCar.fullThrottle();      
    myCar.speed(200);        
  }
}