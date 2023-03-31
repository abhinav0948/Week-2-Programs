import java.util.Scanner;
class EvenOdd {
  public static void main(String args[]) {
Scanner s=new Scanner(System.in);
    int num;
    System.out.println("Enter the number");
    num=s.nextInt(); 
    if(num%2==0) {
       System.out.println("It is an Even Number");
      }
    else {
       System.out.println("It is an Odd number");
    }
    
}

}
