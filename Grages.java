import java.util.Scanner;

public class Grages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numstu,avg,total=0;
		int[] grades=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		numstu=sc.nextInt();
		
		for(int i=1;i<=numstu;i++)
		{
			System.out.println("Enter grades of a student" +i);
			grades[i]=sc.nextInt();
			if((grades[i]>=1) && (grades[i]<=100))
			{
				total=total+grades[i];
			}
			else
			{
				System.out.println("Invalid grade.Try again");
				System.out.println("Enter grades of a student" +i);
				grades[i]=sc.nextInt();
				
				
			}
		}
		
		avg=(total)/2;
		System.out.println("average="+avg);
		
	}

}
