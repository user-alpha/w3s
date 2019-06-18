public class creatingConstructor {
  int x; 

  public creatingConstructor() {
    x = 5; 
  }

  public static void main(String[] args) {
    creatingConstructor myObj = new creatingConstructor();
    System.out.println(myObj.x); 
  }
}