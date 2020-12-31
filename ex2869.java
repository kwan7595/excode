import java.util.Scanner;
public class ex2869{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=0,b=0,v=0;
		a=s.nextInt();
		b=s.nextInt();
		v=s.nextInt();
		int h =0,counter=0;
		while(h<=v){
			h+=a;
			counter++;
			if(h>=v) break;
			else	h-=b;
		}
		System.out.printf("%d",counter);
	}
}
