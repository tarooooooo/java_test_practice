package Chapter7;

import java.util.ArrayList;
import java.util.List;

public class lambda_FruitList {
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));
		
		fruits.stream()
			.filter(f -> f.quantity <= 10)
			.map(f -> f.order(20))
			.sorted((f1, f2) -> f1.quantity - f2.quantity)
			.forEach(System.out::println);
	}
}
