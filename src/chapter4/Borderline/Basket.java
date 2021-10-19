package chapter4.Borderline;

import java.math.BigDecimal;

class Basket<E extends Fruit> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100);
	
	Basket(E e){
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	void printName() {
		System.out.println("箱の中身は" + elem.getName() + "です。");
	}
	
	void printTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName() + "の入った箱は合計" + totalPrice + "です。");
	}
}
