import java.util.Arrays;

public class Cloth extends Obj{
	
	//a cloth is always square, and therefore defined by two diagonal points
	//going to assume the cloth is flat at the start- easier for now when creating initial obj
	//2D array of points, contains the position of the point
	//all points have equal mass (global factor for the physics)
	
	
	public Cloth(){
		
	}
	
	//takes in x1, z1, x2, z2, y, mass
	public Cloth(double A, double B, double C, double D, double E, double F){
		double[] p1 = {A, B};
		double[] p2 = {D, E};
		//establish the four corners
		//create 2d grid of points
		//deal with spring defs
		
	}
	
	double[] intersect(double[] origin, double[] d){
		//loop through all the points and apply physics
		//probably do this five times per frame, start with 5 frames a second, probably a 10 second animation
		double[] result = new double[13];
		return result;
	}

}
