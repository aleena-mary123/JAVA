import java.io.*;
public class OddEven
{
public static void main(String args[])
 {
  String str;
  int x;
  try{
     System.out.println("enter the number");
     DataInputStream d= new DataInputStream(System.in);
     str=d.readLine();
     x=Integer.parseInt(str);
     if(x%2==0)
     System.out.println("even number is:" +x);
     else
     System.out.println("odd number is:" +x);
     }catch(IOException e)
  {System.out.println(e);}
 }
}

