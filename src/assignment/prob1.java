package assignment;


import java.util.Scanner;


class employee
{
	String name;
	int ID;
	static int employeeCount=0;
	employee(String name,int ID)
	{
		this.name=name;
		this.ID=ID;
		employeeCount++;
	}
	void displayInfo()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee ID: "+ID);
		
		
	}
	static void displayEmployeeCount()
	{
		System.out.println("Employee Count:"+employeeCount);
	}
}
public class prob1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number of employees: ");
	int n=sc.nextInt();
	employee[] Employees=new employee[n];
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter the employee "+(i+1) +" details: ");
	System.out.println("Enter the employee name: ");
	String name=sc.next();
	System.out.println("Enter the employee ID: ");
	int ID=sc.nextInt();
	Employees[i]=new employee(name,ID);
	System.out.println();
	}
	for (int i = 0; i < Employees.length; i++) {
	    System.out.println("Employee " + (i + 1) + " Details:");
	    Employees[i].displayInfo();
	    System.out.println();
	}

    
    employee.displayEmployeeCount();
	sc.close();
}
}
