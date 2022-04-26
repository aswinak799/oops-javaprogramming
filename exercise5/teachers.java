/*Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.*/


import java.util.*;
class Employee{
	int Empid;
	String Name;
	double Salary;
	String Address;
	
	 void Employee(int id,String name,double sal,String add){
		Empid=id;
		Name=name;
		Salary=sal;
		Address=add;
}

}
class Teacher extends Employee {
	String department;
	String Subjects_taught;
	
	Teacher(String dpt,String sub,int id,String name,double sal,String add){
		//super(id,name,sal,add);
		
		department=dpt;
		Subjects_taught=sub;

		Empid=id;
		Name=name;
		Salary=sal;
		Address=add;

	}
	void display(){

		System.out.println("Emp id:"+Empid+"\nEmp Name:"+Name+"\nSalary:"+Salary+"\nAddress:"+Address);
		System.out.println("Dep:"+department+"\nSub taught:"+Subjects_taught);
		System.out.println("-------------------------------");
	

		

	}



}

class Main{

	public static void main(String args[]){
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the no.of Teacher:");
			int n=obj.nextInt();
			
			// Declaring an array of Teacher
			
			Teacher[] arr;
			arr=new Teacher[n];// Allocating memory for n objects of type Teacher
			int array[]=new int[n];
			for(int i=0;i<n;i++){
					System.out.println("Enter the details of "+(i+1)+"th Teacher");
					
					System.out.print("Enter emp id:");
					int id=obj.nextInt();
					
					System.out.print("\nEnter emp name:");
					String name=obj.next();
					
					System.out.print("\nEnter emp salary:");
					double sal=obj.nextDouble();
					
					System.out.print("\nEnter Address:");
					String ad=obj.next();

					
					System.out.print("\nEnter department:");
					String dep=obj.next();

					System.out.print("\nEnter Sub taught:");
					String sub=obj.next();

					
					arr[i]=new Teacher(dep,sub,id,name,sal,ad);
					
					
					System.out.println("-----------------------\n");
					
			}

		for(int j=0;j<n;j++){
				System.out.println("----Details of TEACHER "+(j+1)+"----");

				arr[j].display();

		}



}

}


/*

OUTPUT
------
Enter the no.of Teacher:
2
Enter the details of 1th Teacher
Enter emp id:10

Enter emp name:AJAY

Enter emp salary:50000

Enter Address:CLT

Enter department:MCA

Enter Sub taught:DATASTRUCTURE
-----------------------

Enter the details of 2th Teacher
Enter emp id:15

Enter emp name:RESHMI

Enter emp salary:40000

Enter Address:MKM

Enter department:MCA

Enter Sub taught:ADBMS
-----------------------

----Details of TEACHER 1----
Emp id:10
Emp Name:AJAY
Salary:50000.0
Address:CLT
Dep:MCA
Sub taught:DATASTRUCTURE
-------------------------------
----Details of TEACHER 2----
Emp id:15
Emp Name:RESHMI
Salary:40000.0
Address:MKM
Dep:MCA
Sub taught:ADBMS
-------------------------------


*/

