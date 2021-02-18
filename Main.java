import java.util.Scanner;
class Main {
  public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hi! Welcome to Ava's Ice Cream Shop. How many scoops of ice cream would you like?");
    int scoops = scan.nextInt();
    int totalScoops = iceCream(scoops); 

    int count = 0;  
    int total = finalAmount;
  }

  static int iceCream(int scoops){

    if(count <= scoops){

    System.out.println("What is the cost of the flavor that you want? ");
    String cost = scan.next();

    total = total + cost;
    }
    

  }
}