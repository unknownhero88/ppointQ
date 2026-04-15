package Day08.ShapeHierarchy;

class Rectangle extends Shape {
	double width, height;

	Rectangle(String c, double w, double h) {
		super(c);
		width = w;
		height = h;
	}

	double area() {
		return /* TODO */ height*width;
	}
}
