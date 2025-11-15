import java.util.Scanner;

public class Fibonacci{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Ask user how many terms of Fibonnaci series to print
    System.out.println("Enter number of terms: ");
    int n = sc.nextInt();   //Read user input

    //Initialize first two terms of Fibonacci series
    for(int i=1;i<=n;i++){
      System.out.println(a + " ");  //Print current term

      //Calculate next term
      int next = a + b;

      //Update variables for next iteration
      a = b;
      b = next;
    }
    sc.close();
  }
}
