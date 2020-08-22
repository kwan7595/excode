import java.util.Scanner;
public class ex2523{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int input = s.nextInt();
		int i=0,count=1;
		for(i=0;i<input;i++){
			for(int j=0;j<count;j++){
				System.out.print("*");
				count++;
			}
			System.out.print("\n");
		}
		for(int k=input;k>0;k--){
			for(int p=count;p>0;p--){
				System.out.print("*");
				count--;
			}
			System.out.print("\n");
		}
	}
}


