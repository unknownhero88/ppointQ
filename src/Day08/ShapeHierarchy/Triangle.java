package Day08.ShapeHierarchy;

class Triangle extends Shape {
	double base, height;

	Triangle(String c, double b, double h) {
		super(c);
		base = b;
		height = h;
	}

	double area() {
		return /* TODO */ 0.5*height*base;
	}
}
