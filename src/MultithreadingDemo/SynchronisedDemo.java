package MultithreadingDemo;


		class Myelement
	{
			synchronized static void share(int i)
			//{
			//synchronized (Thread.currentThread())
		
		{
				for(int ctr=0;ctr<10;ctr++) 
			{
			System.out.println(Thread.currentThread().getName()+"shared to "+","+ctr);
			}
		}
	}
		
	

class ThreadA extends Thread
{

	Myelement e;
	ThreadA(Myelement e)
	{
		this.e=e;
	}
	public void run()
	{
		e.share(1);
	}
  }


class ThreadB extends Thread
{

	Myelement e;
	ThreadB(Myelement e)
	{
		this.e=e;
	}
	public void run()
	{
		e.share(2);
	}
  }
public class SynchronisedDemo {
	public static void main(String[]args) {
		Myelement e=new Myelement();
		ThreadA t1=new ThreadA(e);
		ThreadB t2=new ThreadB(e);
		t1.start();
		t2.start();
}
}
		
	
		
		





