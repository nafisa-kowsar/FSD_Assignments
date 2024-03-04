package functional_interface;

public class ImplJava7 implements MyInterface  {
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi = new ImplJava7();
		int result = mi.add(6,7);
		System.out.println(result);
	}
}


