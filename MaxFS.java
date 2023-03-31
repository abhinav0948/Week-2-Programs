 import java.util.Scanner;
class MaxFS {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n = s.nextInt(); // 5 10
    System.out.println("Enter " + n + " values");
    int max = s.nextInt(); // 45
    int smax = 0;
    for (int i = 1; i < n; i++) {
      int num = s.nextInt(); 
      if (max < num) {
        smax = max;
        max = num;
      } else if (smax < num) {
        smax = num;
      }
    }
    System.out.println("Max value: " + max);
    System.out.println("second Max value: " + smax);
  }
}