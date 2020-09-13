import java.util.Scanner;
public class ex2798{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=0,m=0;
		n=s.nextInt();
		m=s.nextInt();
		int card[] = new int[n];
		int max=0,temp=0;
		for(int i=0;i<n;i++) card[i]=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(card[i+j]<=card[i]){
					temp=card[i+j];
					card[i+j]=card[i];
					card[i]=temp;
				}
			}
		}
		int sum=0;
		Loop1:for(int i=0;i<n-2;i++){
			sum=card[n-1-i];
			if(m-sum>0){
				Loop2:for(int j=1;j<n-i-1;j++){
					sum+=card[n-1-i-j];
					if(m-sum>0){
						Loop3:for(int k=1;k<n-i-j;k++){
							sum+=card[n-1-i-j-k];
								if(m-sum>=0){
									break Loop1;
								}
								else sum-=card[n-1-i-j-k];
							  }
					}
					else sum-=card[n-1-i-j];
				}
			}
			  }
		System.out.printf("%d",sum);
	}
}
				


