import java.io.*;
public class deserdemo
{
	public static void main(String args[])
	{
		student s=null;
		try
		{
		FileInputStream fin=new FileInputStream("E:\\java\\s.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		
		s=(student)ois.readObject();
		/*System.out.println("Deserialization Happened");
		System.out.println("Name is:"+name);
	    System.out.println("Age is:"+age);
	    System.out.println("Rollno is:"+rno);*/
		s.disp();
		}catch(IOException e){System.out.println(e);}
		catch(ClassNotFoundException e)
		{System.out.println(e);}
	}
}