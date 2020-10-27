import java.util.*;

public class Employee{

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM ON MASTER BRANCH");
		Employee e=new Employee();
		int ch=e.random;
		e.check();
		e.month();
	}


       	  Random r=new Random();
          int random=r.nextInt(3);
	  int wage=20*8;

	public void check()
	{
	   int ch=random;
	   switch(random)
		{
	 	case 0:
                        System.out.println("EMPLOYEE IS PRESENT TODAY");
			System.out.println("Wage/Hr=20 and Fulldayhours=8");
			System.out.println("WAGE WILL BE="+ wage);
                case 1:
                        System.out.println("EMPLOYEE IS ABSENT TODAY");
                case 2:
			System.out.println("EMPLOYEE IS DOING PARTTIME TODAY");
                        System.out.println("Wage/Hr=20 and Parttimehours=8");
                        System.out.println("PARTTIMEWAGE WILL BE="+ wage);


		}
	}
      public void month()
	{
		int count=0;
		int maxday=20;
		int hour=8;
		for(int i=0;i<maxday;i++)
		{
			int random=r.nextInt(2);
			if(random==1)
			{
				count++;
				hour=hour+8;
				if(hour>=100)
				{
					System.out.println("HOURS REACHED TO MAXIMUMOF 100 OR MORE THEN 100");
					break;
				}
			}
		}
	System.out.println("IN THIS MONTH EMPLOYEE WAS PRESENT FOR="+count+"DAYS");
	System.out.println("MONTHLY WAGE IS="+wage);
	}

}
