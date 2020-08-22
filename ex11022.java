import java.util.Scanner;
public class ex11022{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int input = s.nextInt();
		for (int i=0;i<input;i++){
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.printf("Case #%d: %d + %d = %d",(i+1),a,b,a+b);
			System.out.print("\n");
		}
	}
}
