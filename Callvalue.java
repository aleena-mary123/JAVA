import java .io.*;
import java.lang.*;
class test{
public void swapfn(int a,int b){
System.out.println("inside fn befor swap-a::"+ a+ " b:: "+b);
int c=a;
a=b;
b=c;
System.out.println("inside fn after swap-a::"+ a+ " b:: "+b);
}
}
class Callvalue
{
public static void main(String args[])
{
 int a=10;
 int b=30;
 System.out.println("befor swp-a::"+ a+ " b:: "+b);
 test t=new test();
 t.swapfn(a,b);
 System.out.println("aftr swp-a::"+ a+ " b:: "+b);
 }
}