import java.util.Scanner;
public class ex2908{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int a=0,b=0,i=0;
		a=s.nextInt();
		b=s.nextInt();
		for(i=0;i<3;i++){
			if(i=0){
				a[i]=a/100;
				b[i]=b/100;
			}
			if(i=1){
				a[i]=(a/10)%10;
				b[i]=(b/10)%10;
			}
			else{
				a[i]=a%10;
				b[i]=b%10;
			}
		}
		a=a[2]*100+a[1]*10+a[0];
		b=b[2]*100+b[1]*10+b[0];
		if(a>b) System.out.printf("%d",a);
		else System.out.printf("%d",b);
	}
}

