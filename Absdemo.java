import java.io.*;
import java.lang.*;
abstract class shape{
int l,b;
shape(int x,int y){
	l=x;
	b=y;
}
abstract double area();
void display()
 {
 System.out.println("parent display");
 }
}
class rectangle extends shape
{
rectangle(int x,int y)
 {
 super(x,y);
 }
 double area()
 {
  return (l*b);
  }
 void display()
 {
  System.out.println("Rectangle display");
  }
}
 class triangle extends shape{
 triangle(int x,int y)
{
 super(x,y);
 }
 double area()
 {
  return (0.5*l*b);
  }
 void display()
 {
  System.out.println("triangle display");
  }
 }
 class Absdemo{
 public static void main(String args[])
 {
  rectangle r=new rectangle(10,20);
  r.display();
  triangle t=new triangle(11,15);
  t.display();
  shape s=new shape();
  s.display();
  double ra=r.area();
  double ta=t.area();
  System.out.println("rectangle area:" +ra);
  System.out.println("triangle area:" +ta);
  }
 }
 