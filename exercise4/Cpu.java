/*
Create CPU with attribute price. Create inner class
Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.
*/
class Cpu{
	double price=6500;
		void display(){
				System.out.println("CPU Detais\n\nprice="+price);
				Processor p=new Processor();
				Ram r= new Ram();
		
		
		}
			
			
			
			class Processor{
					int no_of_cores=8;
					String manifacture="intel";
					Processor(){
						System.out.println("\nProcessor");
						System.out.println("no_of_cores="+no_of_cores+"\nManifacture:"+manifacture);
						
					}
			
			}
			static class Ram{
					int memmory=8;
					String manifacture="BBK";
					Ram(){
							System.out.println("\nRam");
							System.out.println("memmory="+memmory+"\nManifacture:"+manifacture);
							
					
					}
					
			}
			

}



class Main{
	public static void main(String ar[]){
					Cpu cpu=new Cpu();
					cpu.display();
			
			}


}
/*
output
-------
CPU Detais

price=6500.0

Processor
no_of_cores=8
Manifacture:intel

Ram
memmory=8
Manifacture:BBK

*/
//Create a static nested class
