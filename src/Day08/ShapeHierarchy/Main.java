package Day08.ShapeHierarchy;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = { new Circle("Red", 7), new Rectangle("Blue", 5, 8), new Triangle("Green", 6, 10), };
		for (Shape s : shapes)
			System.out.println(s.describe());

		Shape largest = shapes[0];
		for (Shape s : shapes)
			if (s.area() > largest.area())
				largest = s;
		System.out.println("Largest: " + largest.describe());
	}
}