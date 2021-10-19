package Chapter5.nonname;

public class output {
	public static void main(String[] args) {
		nonname a = new nonname();
		System.out.println(a.hello());
		
		nonname b = new nonname() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
	}
}
