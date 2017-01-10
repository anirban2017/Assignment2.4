package Assignment2_4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment2_4 {
	public static void main(String[] args) throws IOException 
	{
	int a,b,c,largest;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter any three numbers: ");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	c=Integer.parseInt(br.readLine());

	if(a>=b && a>=c) 
	{
	System.out.println("highest number: "+a);
	}
	if(b>=a && b>=c) 
	{
	System.out.println("highest number: "+b);
	}
	if(c>=a && c>=b) 
	{
	System.out.println("highest number: "+c);
	}
	}

}