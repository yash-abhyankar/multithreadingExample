
public class Deadlock {

	final String myobject1="hello";
	final String object2="bye";
	

	
	Thread t1= new Thread() {
		public void run() {
			
			synchronized(myobject1) {
				
				
				   System.out.println("Thread 1 locks object1");  
				   
		           try { 
		        	   Thread.sleep(100);
		        	   } catch (Exception e) {}  
		           
		           synchronized(object2) {
		               System.out.println("Thread 1: locked resource 2");  
					}
			}
			
			
         
			
		}
		
		
	};
	
	Thread t2= new Thread() {
		public void run() {
			
			synchronized(object2) {
				
				
				   System.out.println("Thread 2 locks object2");  
				   
		           try { 
		        	   Thread.sleep(100);
		        	   } catch (Exception e) {}  
		           
		           synchronized(myobject1) {
		               System.out.println("Thread 2: locked resource 1");  
					}
			}
			
			
         
			
		}
		
		
	};
}