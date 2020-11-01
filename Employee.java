import java.util.*;


class Company
{
	   public void Calculate(int companyWage,int workingHour,int workingDay)
	   {
		   int monthlyWage=companyWage*workingHour*workingDay;
		   System.out.println(monthlyWage);

	    }

}

public class Employee{

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM ON MASTER BRANCH");
		System.out.println("______________________________________________________________");
		Employee e=new Employee();
		//int ch=e.random;
		e.check();
		e.month();
		Company c1=new Company();
		System.out.println("Company1 provides Salary");
		c1.Calculate(30,8,25);
		 System.out.println("Company2 provides Salary");
		c1.Calculate(25,10,25);
		System.out.println("Company3 provides Salary");
		c1.Calculate(30,12,28);
		System.out.println("Company4 provides Salary");
		c1.Calculate(35,14,28);
		System.out.println("Company5 provides Salary");
		c1.Calculate(30,14,30);
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
	System.out.println("MONTHLY WAGE IS="+ count*wage);
	}



}
