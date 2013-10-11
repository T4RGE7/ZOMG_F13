package engine;

public class RotatingTwoDPoint extends engine.TwoDPoint{

	protected double angle;
	
	public RotatingTwoDPoint() {
		super();
		this.angle = 0;
	}
	
	public RotatingTwoDPoint(double x, double y, double angle) {
		super(x, y);
		this.angle = 0;
	}
}
