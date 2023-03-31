import java.util.Scanner;
class BigNum {
public static void main(String args[]) {
Scanner s= new Scanner(System.in);
int a,b,c;
System.out.println("Enter three numbers:");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();  
if(a>b && a>c) {
System.out.println("The biggest number is : "+a);
}
else if(b>c) {
System.out.println("The biggest number is : "+b);
}
else {
System.out.println("The biggest number is : "+c);
}
}

}