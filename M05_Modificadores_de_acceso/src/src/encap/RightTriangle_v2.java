package encap;

public class RightTriangle_v2 {
	
	private double base;
	private double height;

	public RightTriangle_v2(double base, double height) {
		
		if (base <= 0 || height <= 0) {
			this.base = 0;
			this.height = 0;
		} else {
			this.base = base;
			this.height = height;
		}
	}
	
	public double calculateArea() {
		return this.base * this.height / 2;
	}		
}
