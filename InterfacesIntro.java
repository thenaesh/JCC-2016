interface Eq<T> {
	public boolean eq(T o);
}

interface Ord<T> extends Eq<T> {
	public boolean lt(T o);
	public boolean gt(T o);
}


/*
 * Eq implemented in a 2D vector class
 * Comparison performed on the individual components
 */
class EqVec2 implements Eq<EqVec2> {
	private double x, y;

	public EqVec2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public boolean eq(EqVec2 o) {
		return (this.x == o.x) && (this.y == o.y);
	}
}

/*
 * Implement an ordered 3D vector class, OrdVec3
 * Perform comparison on the vector lengths
 */


public class InterfacesIntro {
	public static void main(String[] args) {
		EqVec2 u = new EqVec2(1, 2);
		EqVec2 v = new EqVec2(1, 2);
		EqVec2 w = new EqVec2(1, 3);

		System.out.println(u.eq(v));
		System.out.println(u.eq(w));
		System.out.println(v.eq(w));
	}
}
