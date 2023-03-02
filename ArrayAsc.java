import java.io.*;
import java.lang.*;
class ArrayAsc
{
public static void main(String args[])
  {
  float a[],t;
  int n,i,j;
  DataInputStream din;
  din=new DataInputStream(System.in);
  try{
  System.out.println("enter the size of array");
  n=Integer.parseInt(din.readLine());
  a=new float[n];
  System.out.println("enter the elements in array");
  for(i=0;i<n;i++)
  {
    a[i]=Float.parseFloat(din.readLine());
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
	{
	 if(a[i]>a[j])
	 {
	  t=a[i];
	  a[i]=a[j];
	  a[j]=t;
	 }
	}
  }
  for(i=0;i<n;i++)
  {
  System.out.println(a[i]);
  }
  }catch(IOException e){System.out.println(e);}
  }
}