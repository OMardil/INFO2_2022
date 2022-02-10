package encap;

public class RightTriangle_v1 {
	
	private double area;
	private double base;
	private double height;

	public RightTriangle_v1(double base, double height) {
		if (base <= 0 || height <= 0) {
			this.setBase(0);
			this.setHeight(0);
		} else {
			this.setBase(base);
			this.setHeight(height);
		}
	}
	
	private void updateArea() {
		this.area = this.getBase() * this.getHeight() / 2;
	}
	
	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		if (base >= 0) {
			this.base = base;
			this.updateArea();
		}
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		if (height >= 0) {
			this.height = height;
			this.updateArea();
		}
	}		

	public double getArea() {
		return this.area;
	}
	
}
