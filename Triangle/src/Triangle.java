public class Triangle {
	//Fields
	private double side1;
	private double side2;
	private double side3;
	
	//Constructor -> calls private method isTriangle
	public Triangle(double side1, double side2, double side3) {
		if(isTriangle(side1, side2, side3)) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			this.side1 = 1;
			this.side2 = 1;
			this.side3 = 1;
		}
	}
	
	//Getters!
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	//Method checking if is a legit triangle
	private boolean isTriangle(double side1, double side2, double side3) {
		return  (side1 + side2 > side3) &&
				(side2 + side3 > side1) &&
				(side1 + side3 > side2);
	}
	
	//checks if triangle is an equilateral triangle 
	public boolean isEquilateral() {
		return side1 == side2 && side2 == side3;
	}
	
	//checks if triangle is a right triangle
	public boolean isRight() {
	    return Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2) ||
	            Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2) ||
	            Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1, 2);
	}
}
