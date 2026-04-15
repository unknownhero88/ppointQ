package Day08.ShapeHierarchy;

abstract class Shape {
	String color;

	Shape(String color) {
		this.color = color;
	}

	abstract double area(); // subclasses MUST implement this

	String describe() {
		return String.format("%s %s with area %.2f", color, this.getClass().getSimpleName(), area());
	}
}
