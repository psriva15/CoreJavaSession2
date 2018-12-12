import java.util.Scanner;
public class Session2AssignmentQ1 {
	public static void main(String args[])
	  {
	    int x, y, z;
	    System.out.println("Enter three integers");
	    Scanner in = new Scanner(System.in);
	 
	    x = in.nextInt();
	    y = in.nextInt();
	    z = in.nextInt();
	 
	    if (x > y && x > z)
	      System.out.println("Largest number is x = " + x);
	    else if (y > x && y > z)
	      System.out.println("Largest number is y = " + y);
	    else if (z > x && z > y)
	      System.out.println("Largest number is z = " + z);
	    else
	      System.out.println("The numbers are not distinct.");
	  }
}
