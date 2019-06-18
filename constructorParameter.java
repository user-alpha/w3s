public class constructorParameter {
  int x;

  public constructorParameter(int y) {
    x = y;
  }

  public static void main(String[] args) {
    constructorParameter myObj = new constructorParameter(5);
    System.out.println(myObj.x);
  }
}
