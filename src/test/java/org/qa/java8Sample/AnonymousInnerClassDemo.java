package org.qa.java8Sample;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		
		//Anonymous Inner class that extends a class :
		
		/*Thread t = new Thread()
				{
					public void run(){
						for(int i=0;i<10;i++){
							System.out.println("child thread");
						}						
					}
				};
					t.start();
					for(int i=0;i<10;i++){
						System.out.println("main thread");
					}*/
				
		
		//Anonymous Inner class that implements a interface:
		Runnable r = new Runnable()
				{
					public void run(){
						for(int i=0;i<10;i++){
							System.out.println("child thread");
						}
					}
				};
				Thread t =new Thread(r);
				t.start();
				for(int i=0;i<10;i++){
					System.out.println("main thread");
				}
				
				
			//Anonymous Inner class that defines inside method/constructor argument :
				/*Thread t = new Thread(new Runnable()
				{
					public void run(){
						for(int i=0;i<10;i++){
							System.out.println("child thread");
						}
					}
				});
				
				t.start();
				for(int i=0;i<10;i++){
					System.out.println("main thread");
				}
				*/
				
	}

}
