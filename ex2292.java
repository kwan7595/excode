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
/*2292
육각형 벌집.
1
234567 6개 2개방
89101112 13 14 15 16 17 18 19 12개 3개방
20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 18개
6 12 18 24 30 36 42 48 ....
1+6+12+18+24+30
6(1+2+3+......n)
따라서 숫자 k에 대해 n개방 들어가는지 확인하는 방법은
k=1+6(1+2+3...+n) 이므로
(k-1)/6=(n-1)n/2
(k-1)/3=n(n-1)*/
