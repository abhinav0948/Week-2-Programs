import java.util.Scanner;
class PrimeNum {
  public static void main(String args[]){
   Scanner s = new Scanner(System.in);
    int num,i=1,count=0;
    System.out.println("Enter Number : ");
    num = s.nextInt();
    while(i<=num) {
      if(num%i==0) {
        count++;
      }
      i++;
    }
    if (count==2) {
        System.out.println("It is a Prime Number");
      }
      else {
        System.out.println("It is not a Prime Number");
      }
  }
}

