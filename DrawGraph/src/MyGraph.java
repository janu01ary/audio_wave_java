
public class MyGraph {
	
	private double a, b, c, d;
	
	public MyGraph(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public double f(double x) {
		double y = (a * x * x * x) + (b * x * x) + (c * x) + d;
		return y;
	}

}
