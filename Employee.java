import java.util.*;

public class Employee{

	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM ON MASTER BRANCH");
		Employee e=new Employee();
		e.check();
		e.part();
	}


       	  Random r=new Random();
          int random=r.nextInt(2);
	  int part=r.nextInt(2);
	public void check()
	{

	 	if(random==1)
	        {
                        System.out.println("EMPLOYEE IS PRESENT TODAY");
			System.out.println("Wage/Hr=20 and Fulldayhours=8");
			int wage=20*8;
			System.out.println("WAGE WILL BE="+ wage);
                }
                else
                {
                        System.out.println("EMPLOYEE IS ABSENT TODAY");
                }


	}

	 public void part()
        {

                if(part==1)
                {
                        System.out.println("EMPLOYEE IS DOING PARTTIME TODAY");
                        System.out.println("Wage/Hr=20 and Parttimehours=8");
                        int wage=20*8;
                        System.out.println("PARTTIMEWAGE WILL BE="+ wage);
                }
                else
                {
                        System.out.println("EMPLOYEE IS NOT DOING PART TIME TODAY");
                }


        }




}
