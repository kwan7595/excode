import java.util.Scanner;
public class ex10951{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=0,b=0;
		String temp;
		while(s.hasNextInt()){
			a=s.nextInt();
			b=s.nextInt();
			System.out.printf("%d\n",a+b);
		}
	}
}
/* ex10951--how to deal with EoF
hasNextInt()--> if input==no return true, else false
enter input-->false-->code finish
*/
