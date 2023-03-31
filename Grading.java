import java.util.Scanner;
class Grading {
public static void main(String args[]) {

  Scanner s = new Scanner(System.in);
  int project,external,internal,total;
  System.out.println("Enter Project, External and Internal marks:");
project=s.nextInt();
external=s.nextInt();
internal=s.nextInt();
  total=(project*70)/100 + (project*20)/100 + (project*10)/100;
  System.out.println("Total marks : "+total);
  if(total>90) {
    System.out.println("A grade");
  }
  else if(total>=70) {
    System.out.println("B grade");
  }
  else if(total>=50) {
    System.out.println("C grade");
  }
  else {
    if(project<50) {
    System.out.println("You failed in Project and you got "+project +" marks");
  }
     if(external<50) {
    System.out.println("You failed in external and you got "+external +" marks");
     }
     if(internal<50) {
    System.out.println("You failed in internal and you got "+internal +" marks");
     }
  }
}
}