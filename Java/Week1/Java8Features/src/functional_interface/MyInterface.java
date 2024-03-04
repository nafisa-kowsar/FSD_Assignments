package functional_interface;

public interface MyInterface {
	
	public abstract int add(int a, int b);
	
	default void show1() {
		System.out.println("This is Default method");
	}
	
	static void show2() {
		System.out.println("This is Static method");
	}
	
	

}
