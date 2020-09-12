import java.util.Scanner;
public class ex1085{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x=0,y=0,w=0,h=0,xmove=0,ymove=0;
		x=s.nextInt();
		y=s.nextInt();
		w=s.nextInt();
		h=s.nextInt();
		if(w-x>=x) xmove=x;
		else if(w-x<x) xmove=w-x;
		if(h-y>=y) ymove=y;
		else if(h-y<y) ymove=h-y;
		if(xmove>=ymove) System.out.printf("%d",ymove);
		else if(xmove<ymove) System.out.printf("%d",xmove);
	}
}

