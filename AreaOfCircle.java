import java.util.Scanner;
class AreaOfCircle

{	
	
	public static void main(String[]args)
	{
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :");
		radius=sc.nextDouble();
		
		Area obj1=new Area(radius);
		
	}
}

class Area
{
	double area;
	
	Area(double radius)
	{
		area=(radius*radius*22)/7;
		System.out.print("AreaOfCircle :"+area);
	}
}
	

	