package core_java;

public class Employee {
	public static void main(String[] args) {
		int id =20;
		
		/*InterEmp ie = new InterEmp() {
			public void display() {
				//same concept we can use abstract class
				// static inner class, non static inner class, anonymous inner class
				System.out.println("Employee id is :"+ id);
			}
		};
		ie.display();*/
		//inner class calling
		//Lambda Expressions
		InterEmp ie = ()->{System.out.println("emp id");};
		// If we need to send data as argument don't need to mention the data type.
		//Lambda expression can use only functional interface;
		
	}
}

