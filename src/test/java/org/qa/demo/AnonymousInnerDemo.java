package org.qa.demo;

public class AnonymousInnerDemo {

	public static void main(String[] args) {
		// AnonymousInner Class extends class:
		
		/*Thread t = new Thread()
				{
					public void run(){
						for(int i=0;i<10;i++){
							System.out.println("Child Thread");
						}
					}
				};
				
				t.start();
				
				for(int i=0;i<10;i++){
					System.out.println("Main Thread");
				}*/
				
				// AnonymousInner Class implements interface:
				
			/*	Runnable r = new Runnable()
						{
							public void run(){
								for(int i=0;i<10;i++){
									System.out.println("Child Thread");
						}
					}
				};
				
				Thread t = new Thread(r);
				t.start();
				for(int i=0;i<10;i++){
					System.out.println("Main Thread");
				}*/
				
				//Anonymous Inner class that defines inside method/constructor argument:
				
				Thread t = new Thread (new Runnable ()
						{
							public void run(){
								for(int i=0;i<10;i++){
									System.out.println("Child Thread");
								}
							}
						});
				t.start();
				for(int i=0;i<10;i++){
					System.out.println("Main Thread");
				}
	}

}
