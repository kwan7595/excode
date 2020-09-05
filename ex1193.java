import java.util.Scanner;
public class ex1193{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int n=0,k=0;
		for(n=1;;n++){
			if(a*2<=n*(n+1)){
				k=n;
				break;
			}
		}
		int row=(a*2-((k-1)*k))/2;
		int col=k-row+1;
		System.out.printf("%d/%d",row,col);
	}
}
/*1193
row/col 꼴임.
2중for문?
1:row 1 col 1
2:row 1 col 2
3:row 2 col 1
4:row 1 col 3
5:row 2 col 2
6:row 3 col 1
28<=n(n+1)
n=5
a*2-(k-1)k/2 -->4
for:t=1;t<n;t++
1 2 3 4 5
t=4-->row, col = n-t+1
1 2 3 4 5 6 7 .... n
*/

