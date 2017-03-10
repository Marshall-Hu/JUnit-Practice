package function.triangle.problem;


public class calcu {
	
	public static int result;
	
	public void equilateral(double x, double y,double z){
		if(x == z && x == y && y == z)
		{
			result = 1;
		}
		else
			result = 0;
	}
	
	public void isosceles(double x, double y,double z){
		if((x == z && x != y) || (y == z && y != x)||(x == y && y != z))
		{
			result = 1;
		}
		else
			result = 0;
	}
	
	public void scalene(double x, double y,double z){
		if(x != z && z!= y && x != y)
		{
			result = 1;
		}
		else
			result = 0;
	}
	
	
	
}
