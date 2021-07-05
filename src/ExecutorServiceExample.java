import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample  {
	
	
   
   public static void main(String args[]) {
	  
	 ExecutorService ex = Executors.newFixedThreadPool(2);
	   
	   ex.execute(newRunnable("Task1"));
	   ex.execute(newRunnable("Task2"));
	   ex.execute(newRunnable("Task4"));
	   ex.execute(newRunnable("Task5")); 
	   
/*	   ExecutorService ex1 = Executors.newFixedThreadPool(2);
	  Future f= ex1.submit(newCallable("Task1"));
	  
	  try {
			String s= (String) f.get();
		System.out.println(s);
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Future f1=   ex1.submit(newCallable("Task2"));
	  
	  try {
			String s= (String) f1.get();
			System.out.println(s);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Future f2 =  ex1.submit(newCallable("Task3"));
	  
	  try {
			String s= (String) f2.get();
			System.out.println(s);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
   }

   
   
   
private static Runnable newRunnable(String msg) {
	
	return new Runnable() {

		@Override
		public void run() {
			
			System.out.println(Thread.currentThread().getName()+msg);
		}
		
		
	};
}

private static Callable newCallable(String msg) {
	
	return new Callable() {

		@Override
		public Object call() throws Exception {
			// TODO Auto-generated method stub
			return msg;
		}

		
		
	};
}


}