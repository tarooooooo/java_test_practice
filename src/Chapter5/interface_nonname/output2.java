package Chapter5.interface_nonname;

public class output2 {
	public static void main(String[] args) {
		B b = new B() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
	}
}
