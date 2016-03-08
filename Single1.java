//单例的并发访问
/*
//饿汉式
class Single
{
	private static final Single s=new Single();
	private Single(){}
	public statuc Single getinstance()
	{
		return s;
	}
}
*/
//懒汉式 有多条对共享数据的操作，容易出现多例
//如在函数上声明同步 会降低效率  所以 加上双判断
//所以一般用饿汉式
class Single1
{
	private static Single s1=null;
	private Single(){}
	public static  Single Getinstance()//加上同步
	{
		if(s1==null)//再判断一次
		synchronized(Single1.class)
		{
			if(s1==null)
			s1=new Single();
		}
		return s1;
	}
}
class demo implements Runnable
{
	public void run()
	{
		Single1.Getinstance();
	}
}
class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
