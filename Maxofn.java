import java.util.Scanner;

class Maxofn {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int max=0;
    int num=0;
    int i;
    int b=0;
    
    System.out.println("How many values do you want to enter :");
    num = s.nextInt();
    System.out.println("Enter the values:");
    for(i=1;i<=num;i++) {
    b = s.nextInt();
    if(b>max) {
     max=b;
    }
      
    }
    System.out.println("Maximum Value is : " +max);

  }

}


