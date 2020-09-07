import java.util.Scanner;
public class ex2475{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int no[] = new int[5];
		int i=0,sum=0;
		for(i=0;i<5;i++){
			no[i]=s.nextInt();
			sum=sum+no[i]*no[i];
		}
		System.out.printf("%d",sum%10);
	}
}
