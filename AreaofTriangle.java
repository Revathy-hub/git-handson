import java.util.Scanner;
class AreaofTriangle
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the width of the Triangle");
double b=obj.nextDouble();
System.out.println("Enter the height of the Triangle");
double h=obj.nextDouble();
double area=(b*h)/2;
System.out.println("Area of Triangle =" + area);
}
}