import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter Value for X and Y: "+ '\n' );

    // Numerical input
    int X = myObj.nextInt();
    int Y = myObj.nextInt();

    // Output input by user
    System.out.println("The Sum of X and Y is: " + (X + Y));
  }
}