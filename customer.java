package basics;

import java.util.Scanner;

public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		
		System.out.println("Enter employee name");
		String name= sc.next();
		
		System.out.println("Enter employee address");
		String add= sc.next();
		
		System.out.println("Enter employee salary");
		float sal= sc.nextFloat();
		
		System.out.println("==================================");
		System.out.println("Employee details");
		System.out.println("==================================");
		
		System.out.println("Employee id is "+id);
		System.out.println("Employee name is "+name);
		System.out.println("Employee address is "+add);
		System.out.println("Employee salary is "+sal);
		
	}

}
