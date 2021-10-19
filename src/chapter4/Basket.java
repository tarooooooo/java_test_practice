package chapter4;

public class Basket<E> {
	private E elem;
	
	Basket(E e){
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
}
