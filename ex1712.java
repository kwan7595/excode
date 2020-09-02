import java.util.Scanner;
public class ex1712{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if (c>b){
			for(int n=1;;n++){
				if(n>a/(c-b)){
					System.out.printf("%d",n);
					break;
				}
			}
		}
		else System.out.printf("-1");
	}
}

			
