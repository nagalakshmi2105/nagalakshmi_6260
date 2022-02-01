package MultithreadingDemo;

//public class Multithread1 {

	
		// abstract thread class
		// implementing runnable interface
		
class A extends Thread
{
	public void run()//running state
	{
		System.out.println("thread A");
		for(int i=1;i<=5;i++)
		{

	
			System.out.println("value of i in A  "+i);
		}
		System.out.println("thread  A is exited ");
			}
}
class B extends Thread
{
	public void run()//running state
	{
		System.out.println("thread B");
		for(int j=1;j<=5;j++)
		{

	
			System.out.println("value of i in B  "+j);
		}
		System.out.println("thread  B is exited ");
			}
}


class C extends Thread
{
	public void run()//running state
	{
		System.out.println("thread C");
		for(int k=1;k<=5;k++)
		{

	
			System.out.println("value of i in C  "+k);
		}
		System.out.println("thread  C is exited ");
			}
}
public class Multithread1 {
	public static void main(String[] args) {
		A object1=new A();
		B object2=new B();
		C object3=new C();
		
		Thread t1=new Thread(object1);
		Thread t2=new Thread(object2);
		Thread t3=new Thread(object3);
		
		t1.start();
		t2.start();
		t3.start();
		

}
}
