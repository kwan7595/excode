import java.util.Scanner;
public class ex11050{
	public static void main(String[] args){
		int n,r,i,nc=1,rc=1;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		r=s.nextInt();
		for(i=n;i>n-r;i--)nc=nc*i;
		for(i=1;i<=r;i++)rc=rc*i;
		System.out.printf("%d",nc/rc);
	}
}
