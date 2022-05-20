/*2. Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers.*/




import java.util.*;
class Person{  //create class Person
	String Name;
	String Gender;
	int Age;
	String Address;
	
	 Person(String gen,String name,int age,String add){ //constructor of person
			Gender=gen;
			Name=name;
			Age=age;
			Address=add;
}

}
class Employee extends Person {//create class Employee that inherit person
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;
	
	Employee(String gen,String name,int age,String add,int id,String c_n,String qu, double sal){	//constructor of Employee
		super(gen,name,age,add);
		Empid=id;
		Company_name=c_n;
		Qualification=qu;
		Salary=sal;
		


		

	}
	



}

class Teacher extends Employee { //create class Teacher that inherit Employee 

	String Sub;
	String Dpt;
	int T_id;
	Teacher(String gen,String name,int age,String add,int id,String c_n,String qu, double sal,String dpt,String sub,int tid){
		super(gen,name,age,add,id,c_n,qu,sal);
		
		Sub=sub;
		Dpt=dpt;
		T_id=tid;
		
	
	
	}
	
	

	void display(){  //methord fo display all data members of all classes

		System.out.println("\nName:"+super.Name+"\nGender:"+super.Gender+"\nAge:"+super.Age+"\nAddress:"+super.Address);
		System.out.println("\nEmp id:"+Empid+"\nCompany name:"+Company_name+"\nQualification:"+Qualification+"\nSalary:"+Salary);
		
		System.out.println("\nTearchers id:"+T_id+"\nDep:"+Dpt+"\nSub:"+Sub);
		System.out.println("-------------------------------");
	

		

	}

}

class person{  //Main class

	public static void main(String args[]){	//main methord
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter the no.of Teacher:");
			int n=obj.nextInt();
			
			// Declaring an array of Teacher
			
			Teacher[] arr=new Teacher[n];// Allocating memory for n objects of type Teacher
			
			for(int i=0;i<n;i++){
					System.out.println("\nEnter the details of TEACHER - "+(i+1)); //enterin the details of all data members using forloop
							System.out.println("______________________________");
					
					System.out.print("\nEnter name:");
					String name=obj.next();
					
					System.out.print("Enter Gender:");
					String gen=obj.next();
					
					System.out.print("Enter Age:");
					int age=obj.nextInt();
					
					System.out.print("Enter Address:");
					String ad=obj.next();
					    
					System.out.print("\nEnter emp id:");
					int id=obj.nextInt();
					
					System.out.print("Enter Company name:");
					String cname=obj.next();
					
					System.out.print("Enter Qualification:");
					String qu=obj.next();
					
					
					System.out.print("Enter emp salary:");
					double sal=obj.nextDouble();
					
					
					System.out.print("\nEnter tearchers id:");
					int t_id=obj.nextInt();
					

					
					System.out.print("Enter department:");
					String dep=obj.next();

					System.out.print("Enter Subject:");
					String sub=obj.next();

					
					arr[i]=new Teacher(gen,name,age,ad,id,cname,qu,sal,dep,sub,t_id); //calling constructor of Teacher class and passing parameeters
					
					
					System.out.println("-----------------------\n");
					
			}

		for(int j=0;j<n;j++){ 
				System.out.println("___Details of TEACHER-->" +(j+1)+"___");

				arr[j].display(); // calling display methord of each teacher objects using forloop

		}
		
		
	}
		
		
}



/*
output
------
Enter the no.of Teacher:2

Enter the details of TEACHER - 1
______________________________

Enter name:ANU
Enter Gender:FEMALE
Enter Age:25
Enter Address:CLT

Enter emp id:12
Enter Company name:TCS
Enter Qualification:MCA
Enter emp salary:35000

Enter tearchers id:1
Enter department:MCA
Enter Subject:PYTHON
-----------------------


Enter the details of TEACHER - 2
______________________________

Enter name:AMAN
Enter Gender:MALE
Enter Age:26
Enter Address:CLT

Enter emp id:15
Enter Company name:IBM
Enter Qualification:MCA
Enter emp salary:42000

Enter tearchers id:4
Enter department:CS
Enter Subject:C++
-----------------------

___Details of TEACHER-->1___

Name:ANU
Gender:FEMALE
Age:25
Address:CLT

Emp id:12
Company name:TCS
Qualification:MCA
Salary:35000.0

Tearchers id:1
Dep:MCA
Sub:PYTHON
-------------------------------
___Details of TEACHER-->2___

Name:AMAN
Gender:MALE
Age:26
Address:CLT

Emp id:15
Company name:IBM
Qualification:MCA
Salary:42000.0

Tearchers id:4
Dep:CS
Sub:C++
-------------------------------


*/
