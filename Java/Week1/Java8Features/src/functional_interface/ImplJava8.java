package functional_interface;

public class ImplJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda- Expressions
		MyInterface mi = (int a, int b)->{ return a+b; };
		System.out.println(mi.add(5,6));
		
		mi.show1(); //default method
		
		MyInterface.show2(); //static method

	}

	

}
