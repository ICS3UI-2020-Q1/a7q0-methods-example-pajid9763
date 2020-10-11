/**
 *
 * @author 
 */
public class Main {
  // create a method to say hello
  public static void sayHello(){
    System.out.println("Hello World");
  }

  // saying hello to a specific person
  public static void sayHello(String name){
    System.out.println("Hello " + name);
  }

  // a funtion that will calculate the area of a rectangle
  public static double calcAreaofRectangle (double length, double width){
    double area = length * width;
    return area;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // call out method sayHello
    sayHello();

    // say hello to Steve 
    String firstName = "Steve";
    sayHello(firstName);
    
  }
}
