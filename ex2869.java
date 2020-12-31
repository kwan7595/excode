import java.util.Scanner;
public class ex2869{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=0,b=0,v=0;
		a=s.nextInt();
		b=s.nextInt();
		v=s.nextInt();
		int h =0,sum=0;
		if(v/(a-b)>=a) sum=v/(a-b)-a+1;
		else if(v/(a-b)<a){
			if(v%(a-b)/(a-b)==0) sum=(v/(a-b))+1;
			else sum=v/(a-b);
		}
		System.out.printf("%d",sum);
	}
}
