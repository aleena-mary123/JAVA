import java.io.*;
import java.lang.*;
class Demo
{
String y; int x;
Demo()
 {
  System.out.println("CONSTRUCTOR called");
 }
 Demo(int a,String b)
 {
	 x=a;
	 y=b;
  System.out.println("CONSTRUCTOR called");
 }
 void inc()
 {
	 x=x+1;
	 System.out.println(x);
 }
}
class ConsDemo
{
 public static void main(String args[])
 {
   Demo d1=new Demo();
   Demo d2=new Demo(12,"WELCOME");
   d2.inc();
 }
}