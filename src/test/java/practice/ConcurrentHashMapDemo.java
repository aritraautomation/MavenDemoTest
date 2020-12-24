package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread{
	
	static ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<Integer,String>(); 
	
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread is updating Map");
		m.put(11, "AL");
	}

	public static void main(String[] args) throws InterruptedException {
		
		m.put(15, "NM");
		m.put(17, "JJL");
		m.put(19, "BLP");
		
		ConcurrentHashMapDemo chm = new ConcurrentHashMapDemo();
		chm.start();
		
		Set st = m.entrySet();
		
		Iterator itr = st.iterator();
		
		while(itr.hasNext()){
			Map.Entry me =(Map.Entry)itr.next();
			System.out.println("Main Thread iterating....");
			System.out.println("Key  " + me.getKey() + " Value : " + me.getValue());
			Thread.sleep(3000);			
		}
		System.out.println(m);		
		
		m.putIfAbsent(17, "LLP");
		m.putIfAbsent(18, "BBB");
		System.out.println(m);
		
		m.remove(19, "YUD");
		m.remove(19, "BLP");
		System.out.println(m);
		
		m.replace(15, "QOP", "XCRT");
		m.replace(15, "NM", "YCRT");
		System.out.println(m);
	}

}
//O/P:
/*Main Thread iterating....
Key  17 Value : JJL
Child Thread is updating Map
Main Thread iterating....
Key  19 Value : BLP
Main Thread iterating....
Key  11 Value : AL
Main Thread iterating....
Key  15 Value : NM
{17=JJL, 19=BLP, 11=AL, 15=NM}
{17=JJL, 18=BBB, 19=BLP, 11=AL, 15=NM}
{17=JJL, 18=BBB, 11=AL, 15=NM}
{17=JJL, 18=BBB, 11=AL, 15=XCRT}*/