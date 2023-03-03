class ObjDemo
{
public static void main(String args[])
{
 test c=new test();
 int a=3;
 int b=4;
 int s=c.sum(a,b);
 c.a=10;
 c.b=20;
 int s1=c.sum(c.a,c.b);
 System.out.println("a is:"+c.a);
 System.out.println("b is:"+b);
 System.out.println("sum is:"+s);
 System.out.println("sum1 is:"+s1);
}
}
class test{
int a,b;
public int sum(int x,int y)
{
return(x+y);
}
}