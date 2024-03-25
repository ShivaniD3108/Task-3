package task3;

import java.util.Scanner;

public class DriverMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Employee Salary: ");
        double empSalary = sc.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);

        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Product Price: ");
        double productPrice = sc.nextDouble();
        System.out.print("Product Quantity: ");
        int productQuantity = sc.nextInt();


        Product product = new Product(pid, productPrice, productQuantity);
        
        double incomeTax=employee.calcTax();
        System.out.println("The income tax for the "+ empName + "is "+ incomeTax);
        
        double salesTax=product.calcTax();
        System.out.println("The sales tax for the product with id "+ product.pid + "is "+ salesTax);
    }

}
