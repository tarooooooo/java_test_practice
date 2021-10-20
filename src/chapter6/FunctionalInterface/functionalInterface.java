package chapter6.FunctionalInterface;

public class functionalInterface {

	@FunctionalInterface
	public interface Greeting{
		public String hello();
	}
	
	Greeting greeting = () ->{
		return "こんにちは";
	};
	
	public static void sayHello(Greeting g) {
		System.out.println(g.hello());
	}
}
