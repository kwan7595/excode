import java.util.Scanner;
public class ex2798{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=0,m=0,i=0;
		n=s.nextInt();
		m=s.nextInt();
		int card[] = new int[n];
		for(i=0;i<n;i++) card[i]=s.nextInt();
		int j=0,k=0,sum=0,temp=0;
		for(i=0;i<n;i++){
			for(j=1;j<n-i;j++){
				for(k=1;k<n-i-j;k++){
					temp=card[i]+card[i+j]+card[i+j+k];
					if(temp<=m&&sum<=temp) sum=temp;
				}
			}
		}
		System.out.printf("%d",sum);
	}
}

