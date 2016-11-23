
public class Assignment_1_3 {

	public static void main(String[] args) {
		int var1= 5;
		int var2= 10;
		
		System.out.println("old value of var1 is = " + var1);
		System.out.println("ols value of var2 is = " + var2);
		
		var1=var1+var2;
		var2=var1-var2;
		var1=var1-var2;
		
		System.out.println("new value of var1 is = " + var1);
		System.out.println("new value of var2 is = " + var2);
	}

}
