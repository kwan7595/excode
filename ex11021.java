import java.util.Scanner;
public class ex11021{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int caseno=s.nextInt();
		int a,b;
		for (int i=0;i<caseno;i++){
			a=s.nextInt();
			b=s.nextInt();
			System.out.printf("Case #%d: %d",(i+1),(a+b));
		}
	}
}
