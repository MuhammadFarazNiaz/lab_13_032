package lab12;
public class Exception_Handling {

	void divide(int divider) throws ArithmeticException,ClassNotFoundException{
		if (divider==0) {
			throw new ArithmeticException("Number should not divided by zero");
			
		}if(divider!=0){
		int num =125/divider;
		System.out.println(num);
			
		}else {
			throw new ClassNotFoundException("Class not found");
			
		}
	}
	
	
	public static void main(String[] args) {
		try {
			Exception_Handling obj=new  Exception_Handling();
			obj.divide(0);
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Out of try catch");
		System.out.println("changed file");
		
		
	}

}
