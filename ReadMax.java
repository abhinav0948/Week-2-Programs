import java.util.Scanner;
class ReadMax {
public static void main(String args[]) {
Scanner s= new Scanner(System.in);
int a,b,c,d,e;
System.out.println("Enter five numbers:");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt(); 
  d=s.nextInt(); 
  e=s.nextInt(); 
if(a>b && a>c && a>d && a>e) {
System.out.println("The biggest number is : "+a);
}
else if(b>c && b>d && b>e) {
System.out.println("The biggest number is : "+b);
}
else if(c>d && c>e) {
System.out.println("The biggest number is : "+c);
}
  else if(d>e) {
System.out.println("The biggest number is : "+d);

}
  else {
    System.out.println("The biggest number is : "+e);
  }
}

}