class Vehicle {
  protected String brand = "Ford";         
  public void honk() {                     
    System.out.println("Tuut, tuut!");
  }
}

class inheritance extends Vehicle {
  private String modelName = "Mustang";    
  public static void main(String[] args) {

        inheritance myCar = new inheritance();

    myCar.honk();

    System.out.println(myCar.brand + " " + myCar.modelName); 
  }
} 