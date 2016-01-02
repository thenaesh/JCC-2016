/*
 * Abstract base class for N-dimensional vector
 */
abstract class VecN {
	protected double[] components;

	public VecN(double[] components) {
		this.components = components;
	}

	public double getLength() {
		return Math.sqrt(this.dotP(this));
	}

	public double dotP(VecN v) {
		double acc = 0;
		for (int i = 0; i < this.components.length; i++)
			acc += this.components[i] * v.components[i];
		return acc;
	}
}

/*
 * Derived class for 2D vector
 */
class Vec2 extends VecN {
	public Vec2(double x, double y) {
		super(new double[]{x, y});
	}
}

/*
 * Derive your own 3D vector class from VecN, called Vec3
 * Implement a new method called crossP, which computes the 3D cross product
 */
// your program here

public class OOPIntro {
	public static void main(String[] args) {
		Vec2 w = new Vec2(1, 2);
		Vec2 v = new Vec2(3, 4);

		System.out.println(w.getLength());
		System.out.println(v.getLength());
		System.out.println(w.dotP(v));
	}
}
