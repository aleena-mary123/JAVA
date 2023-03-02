import java.io.*;
import java.lang.*;
class CompDemo{
public static void main(String args[])
 { 
 Comp c1=new Comp();
 System.out.println("FIRST:");
 c1.read();
 c1.disp();
 Comp c2=new Comp();
  System.out.println("SECOND:");
 c2.read();
 c2.disp();
 c1.add(c2);
 }
}
class Comp
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
 void add(Comp c2)
 {
 Comp c=new Comp();
 c.rl=this.rl+c2.rl;
 c.im=this.im+c2.im;
 System.out.println("The sum is::" +c.rl+" +" +c.im+"i");
}
}