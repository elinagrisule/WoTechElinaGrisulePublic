public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suite, rain coat

   var temp = 70;
    
    if (temp <= 5) {
      System.out.println("Wear super warm!");
   }
    else if (temp <= 15) {
    System.out.println("Wear warm");
  }
    else if (temp <= 30) {
    System.out.println("Wear normal!");
  }
    else if (temp > 30) {
        System.out.println("Wear no cloth!");
    }
    else {
      System.out.println("I do not recognize temp!");
    }
  }
}
