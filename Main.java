import java.util.Scanner; 


//purpose of this method is to see how many scoops of ice cream the user wants and what flavor they want for each individual scoop
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //used for user's imput

    System.out.println("Hi! Welcome to Ava's Ice Cream Shop. How many scoops of ice cream would you like?");  
    int scoops = scan.nextInt(); 
    int count = 1; //will remain 1 as we can't do 0
    iceCream(scoops, count); //calling the method 
  }
  
  static boolean iceCream(int scoops, int count) {
    Scanner scan = new Scanner(System.in);
    if (count <= scoops) { 
      //seeing how many scoops you have considering what you put into imput.
      //all scoops have to be less or equal to 1, or else you already have all your scoops. 
      System.out.println("you're at " + count + " scoop.");
      System.out.println("What flavor would you like? "); //asking what flavor user wants
      String flavor = scan.next();
      count++; //count adds 1 after every time
      return iceCream(scoops, count);
    } else { //else statement if if statement is not fulfulled
      System.out.println("You're ice cream is ready! ");
      return false;
    }

  }
}