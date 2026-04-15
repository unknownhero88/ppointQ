package Day09;

public class TempConverter {
	static double celsiusToFahrenheit(double c) {
		// formula: (c * 9/5) + 32
		// TODO: return calculation
		return (c * 9.0 / 5.0) + 32;
	}

	static double fahrenheitToCelsius(double f) {
		// formula: (f - 32) * 5/9
		// TODO: return calculation
		return (f - 32) * 5.0 / 9.0;
	}

	static double celsiusToKelvin(double c) {
		// formula: c + 273.15
		return c + 273.15;
	}

	public static void main(String[] args) {
		double[] cTemps = { 0, 100, 37, -40 };
		for (double c : cTemps)
			System.out.println(String.format("%.0f°C → %.2f°F", c, celsiusToFahrenheit(c)));
		System.out.println();
		double[] fTemps = { 32, 212, 98.6, -40 };
		for (double f : fTemps)
			System.out.println(String.format("%.1f°F → %.2f°C", f, fahrenheitToCelsius(f)));

		System.out.println();
		System.out.println(String.format("%.0f°C → %.2f K", 100.0, celsiusToKelvin(100)));
	}
}