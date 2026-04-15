package Day08.FibonacciwithIterator;

import java.util.Iterator;

class FibIterator implements Iterator<Integer> {
	private int a = 0, b = 1;
	private final int limit;

	FibIterator(int limit) {
		this.limit = limit;
	}

	public boolean hasNext() {
		return a <= limit; // still values left to produce
	}

	public Integer next() {
		int current = a;
		int temp = a + b;
		a = b;
		b = temp;
		return current;
	}
}
