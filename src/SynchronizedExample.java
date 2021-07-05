  class SynObject{
	
 synchronized	public void prints(int n) {
		
		for(int i=0;i<10;i++) {
			
			
			System.out.println(i*n);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				System.out.println(e);
				e.printStackTrace();
			}
			
		}
		
	}
	
}



public class SynchronizedExample {

	public static void main(String args[]) {
		SynObject obj=new SynObject();
	Thread t1=new Thread() {
		
		public void run() {
			
			obj.prints(5);
		}
	};
Thread t2=new Thread() {
		
		public void run() {
			
			obj.prints(100);
		}
	};
	
	t1.start();
	t2.start();
}
}
