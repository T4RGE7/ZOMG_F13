package engine;

public class Calculations {

	public static double Distance(double x1, double y1, double x2, double y2) {
		double tempX = x1 - x2, tempY = y1 - y2;
		return Math.sqrt((tempX*tempX) + (tempY*tempY));
	}
	
	public static double Distance(TwoDPoint pt1, TwoDPoint pt2) {
		return Distance(pt1.getX(), pt1.getY(), pt2.getX(), pt2.getY());
	}
	
}
