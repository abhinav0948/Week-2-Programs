import java.util.Scanner;
class Voting {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int age;
    System.out.println("Enter the age");
    age=s.nextInt();
    if(age>=18) {
      System.out.println("You are eligible");
    }  
   else {
    System.out.println("You are not eligible");
    }   
   }
  }
