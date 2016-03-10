class Task implements Runnable
{
	private boolean flag;
	Task(boolean flag)
	{
		this.flag=flag;
	}
	public void run()
	{
		
		
			if(flag)
			{	
					synchronized(Mylock.a)
					{
						System.out.println("if a");
						synchronized(Mylock.b)
						{
							System.out.println("if b");
						}
					}
			}
		
			else
		   {	
				
				synchronized(Mylock.b)
				{
					System.out.println("else b");
					synchronized(Mylock.a)
					{
						System.out.println("else a");
					}
				}
		   }
	}
}
class Mylock
{
	public static final Object a = new Object();//声明static 直接类名访问
	public static final Object b = new Object();

}
class Demo
{
	public static void main(String[] args) 
	{
		Task t1=new Task(true);
		Task t2=new Task(false);
		new Thread(t1).start();
		new Thread(t2).start();
	}
}
