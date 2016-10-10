package quiz_3;

import quiz_3.Triangle;

public class TriangleException extends Exception {
	private Triangle t;
	
	public TriangleException(Triangle t) {
		super();
		this.t=t;
	}
}
