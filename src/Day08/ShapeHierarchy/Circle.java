package Day08.ShapeHierarchy;

class Circle extends Shape {
	double radius;

	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	double area() {
		return Math.PI*radius*radius;
	}
}
