package chapter4.Borderline;

import java.math.BigDecimal;

public class output {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));
		
		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
		
	}
}
