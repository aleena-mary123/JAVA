import java.io.*;
import java.lang.*;
class ComplexDemo{
public static void main(String args[])
 { 
 Complex c1=new Complex();
 System.out.println("FIRST:");
 c1.read();
 c1.disp();
 Complex c2=new Complex();
  System.out.println("SECOND:");
 c2.read();
 c2.disp();
 }
}
class Complex
{
int rl,im;
String str;
void read()
{
 DataInputStream din;
 din=new DataInputStream(System.in);
 try
 {
 System.out.println("Enter real part");
 str=din.readLine();
 rl=Integer.parseInt(str);
 System.out.println("Enter imaginary part");
 str=din.readLine();
 im=Integer.parseInt(str);
 }
 catch(Exception e)
 {System.out.println(e);}
}
void disp()
 { 
 System.out.println("The real part is::" +rl);
 System.out.println("The imaginary part is::" +im);
 System.out.println("The number is::" +rl+" +" +im+" i");
 }
}
