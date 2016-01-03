class A {}
class B extends A {}

class Capsule<T> {
	private T data;
	public T get(){ return this.data; }
	public void set(T data){ this.data = data; }
}


class GenericsIntro {
	public static void main(String[] args) {
		Capsule<A> capsule0 = new Capsule<A>();
		Capsule<B> capsule1 = new Capsule<B>();

		capsule0.set(new A());
		capsule1.set(new B());

		/*
		Capsule<A> invariant_capsule_fail0 = new Capsule<B>();
		Capsule<B> invariant_capsule_fail1 = new Capsule<A>();
		 */
		Capsule<? extends A> covariant_capsule = new Capsule<B>();
		Capsule<? super B> contravariant_capsule = new Capsule<A>();
	}
}
