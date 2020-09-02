import java.util.Scanner;
public class ex2292{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=0;
		for(t=1;;t++){
			if((n-1)/3<(t(t-1))||(n-1)/3==(t(t-1))){
				System.out.printf("%d",t);
				break;
			}
		}
	}
}
