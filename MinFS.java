import java.util.Scanner;
class MinFS {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n = s.nextInt(); // 5 10
    System.out.println("Enter " + n + " values"); 
    int min = s.nextInt(); // 45
    int smin = 0;
    for (int i = 1; i < n; i++) {
      int num = s.nextInt(); 
      if (min > num) { 
        smin = min;
        min = num;
      } else if (smin > num) {
        smin = num;
      }
    }
    System.out.println("Min value: " + min);
    System.out.println("second Min value: " + smin); 
  }
}