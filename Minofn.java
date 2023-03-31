import java.util.Scanner;

class Minofn {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int min=0;
    int num=0;
    int i;
    int b=0;
    
    System.out.println("How many values do you want to enter :");
    num = s.nextInt();
    System.out.println("Enter the values:");
    min=s.nextInt();
    for(i=1;i<num;i++) {
    b = s.nextInt();
    if(b<min) {
     min=b;
    }
      
    }
    System.out.println("Maximum Value is : " +min);

  }

}
