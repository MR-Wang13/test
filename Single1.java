//�����Ĳ�������
/*
//����ʽ
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
//����ʽ �ж����Թ������ݵĲ��������׳��ֶ���
//���ں���������ͬ�� �ή��Ч��  ���� ����˫�ж�
//����һ���ö���ʽ
class Single1
{
	private static Single s1=null;
	private Single(){}
	public static  Single Getinstance()//����ͬ��
	{
		if(s1==null)//���ж�һ��
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
