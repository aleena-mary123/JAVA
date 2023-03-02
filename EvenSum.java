import java.io.*;
import java.lang.*;
class sumstatic
{
 static int n;
 public static void main(String args[])
 {
  DataInputStream d=new DataInputStream(System.in);
  try{
  System.out.println("Enter the number");
  n=Integer.parseInt(d.readLine());
  if (n%2==0)
  System.out.println("+n is even");
  }catch(IOException e)
  {
   System.out.println(e);
  }
 }
}
class Evennum
{
 static int x=0;
 static void even(int n)
 {
  for(int i=0;i<=n;i++)
  {
   x=x+i;
  }
  System.out.println("x: "+x);
 }
}
  