
import java.util.Scanner;
class Oneton {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n=0;
    System.out.println("Enter the Number : ");
    n=s.nextInt();
    for (int i=1;i<=n;i++) {
      System.out.println(i);
    }
  }
}