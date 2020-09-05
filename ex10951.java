import java.util.Scanner;
public class ex10951{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=0,b=0;
		String temp;
		for(;;){
			a=s.nextInt();
			b=s.nextInt();
			System.out.printf("%d\n",a+b);
			if(s.next()=="\n") break;
		}
	}
}
