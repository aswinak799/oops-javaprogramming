/*3. Write a program has classes Publisher, Book, Literature and Fiction. Read the
information and print the details of books from either the category, using
inheritance
Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display()
Class Literature subclass of Book-Attribute-type, Method display()
Class Fiction subclass of Book-Attribute-genre, Method display()*/

import java.util.*;
class Publisher{
	String pub_name;

	Publisher(String pname){
		pub_name=pname;

	}
	void display(){
		System.out.println("Pub_name :"+pub_name);
	} 
	

}

class Book extends Publisher {
	String title;
	String Author;

	Book(String pnm,String tit,String aut){
		super(pnm);
		title=tit;
		Author=aut;
		
	}
	void display(){
		super.display();
		System.out.println("Title :"+title+"\nAuthor:"+Author);
	} 

	

}

class Literature extends Book{
	String type;
	Literature(String pnm,String tit,String aut,String typ){
		super(pnm,tit,aut);
		type=typ;

	}
	void display(){
		super.display();
		System.out.println("Type :"+type);
	} 
	

}

class Fiction  extends Book{
	
	String genre;

	Fiction(String pnm,String tit,String aut,String gen){
		super(pnm,tit,aut);
		genre=gen;
	
	}
	void display(){
		super.display();
		System.out.println("Genre :"+genre);
	} 

}


class Main {
	public static void main(String ar[]){

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of litratuere books:");
		int ln=sc.nextInt();
		Literature [] arr= new Literature[ln];
		
		System.out.println("Enter details of litratuere books:");
		for(int i=0;i<ln;i++){
			System.out.print("Book-"+(i+1));	
			System.out.print("\nEnter Pub_name:");
			String pnm=sc.next();
			
			System.out.print("Enter Title:");
			String ti=sc.next();
			
			System.out.print("Enter Author:");
			String au=sc.next();

			System.out.print("Enter Type:");
			String typ=sc.next();

			arr[i] =new Literature(pnm,ti,au,typ);
	

		}

		
		System.out.println("\n---------------------");





		System.out.print("Enter the number of Fiction books:");
		int fn=sc.nextInt();
		Fiction [] arr1= new Fiction[fn];
		
		System.out.println("Enter details of Fiction books:");
		for(int i=0;i<ln;i++){
			System.out.print("Book-"+(i+1));	
			System.out.print("\nEnter Pub_name:");
			String pnm=sc.next();
			
			System.out.print("Enter Title:");
			String ti=sc.next();
			
			System.out.print("Enter Author:");
			String au=sc.next();

			System.out.print("Enter Gener:");
			String gn=sc.next();

			arr1[i] =new Fiction(pnm,ti,au,gn);
	

		}

		do{
					System.out.println("\n1.litratuere \n2.Fiction \n3.exit");
					System.out.println("Select your option: ");
					int opt =sc.nextInt();
					
					System.out.println("-----------------------\n");
					
					switch(opt){
						case 1:System.out.println("litratuere books\n");
							   for(int i=0;i<ln;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr[i].display();

								}
							   
								break;
						case 2:System.out.println("Fiction books\n");
								for(int i=0;i<ln;i++)
								{
									System.out.println("BOOK "+(i+1));
									arr1[i].display();

								}
								break;
						default: System.out.println("Exiting....!");
								System.exit(0);
								break;
								
					
					
					}
					
					
			
			
			
			}while(true);






	}


}


/*
Enter the number of litratuere books:2
Enter details of litratuere books:
Book-1
Enter Pub_name:DC_BOOKS
Enter Title:WINGS
Enter Author:RR
Enter Type:LITRATURE
Book-2
Enter Pub_name:DC_BOOKS
Enter Title:THOUGHTS
Enter Author:ANAND
Enter Type:LTIRATURE

---------------------
Enter the number of Fiction books:2
Enter details of Fiction books:
Book-1
Enter Pub_name:CD_BOOKS     
Enter Title:RAIN
Enter Author:SANAN
Enter Gener:FICTION
Book-2
Enter Pub_name:AK_BOOKS
Enter Title:THUNDER
Enter Author:AK
Enter Gener:FICTION

1.litratuere 
2.Fiction 
3.exit
Select your option: 
1
-----------------------

litratuere books

BOOK 1
Pub_name :DC_BOOKS
Title :WINGS
Author:RR
Type :LITRATURE
BOOK 2
Pub_name :DC_BOOKS
Title :THOUGHTS
Author:ANAND
Type :LTIRATURE

1.litratuere 
2.Fiction 
3.exit
Select your option: 
2
-----------------------

Fiction books

BOOK 1
Pub_name :CD_BOOKS
Title :RAIN
Author:SANAN
Genre :FICTION
BOOK 2
Pub_name :AK_BOOKS
Title :THUNDER
Author:AK
Genre :FICTION

1.litratuere 
2.Fiction 
3.exit
Select your option:

*/


