package encap;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		RightTriangle_v1 triangleV1 = new RightTriangle_v1(10, 5);
		RightTriangle_v2 triangleV2 = new RightTriangle_v2(10, 5);	
		
		double out1 = triangleV1.getArea();
		double out2 = triangleV2.calculateArea();
		
		System.out.println("Class V1: " + out1);
		System.out.println("Class V2: " + out2);
	}

}
