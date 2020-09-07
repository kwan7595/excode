import java.util.Scanner;
public class ex2908{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int A=0,B=0,i=0;
		A=s.nextInt();
		B=s.nextInt();
		for(i=0;i<3;i++){
			if(i==0){
				a[i]=A/100;
				b[i]=B/100;
			}
			if(i==1){
				a[i]=(A/10)%10;
				b[i]=(B/10)%10;
			}
			else{
				a[i]=A%10;
				b[i]=B%10;
			}
		}
		A=a[2]*100+a[1]*10+a[0];
		B=b[2]*100+b[1]*10+b[0];
		if(A>B) System.out.printf("%d",A);
		else System.out.printf("%d",B);
	}
}

