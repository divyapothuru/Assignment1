import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=1,n2=1,n3,sum=0,count;
       float avg;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter count value");
       count=sc.nextInt();
       System.out.println(+n1+"\n"+n2);
       for(int i=2;i<=count;i++)
       {
    	   sum=n1+n2;
    	   System.out.println(+sum);
    	   n1=n2;
    	   n2=sum;
       }
       avg=(n1+n2)/2;
       System.out.println("avg="+avg);
	}

}
