import java.util.Scanner;
public class ex3052{
	public static void main(String[] args){
		int no[] = new int[10];
		Scanner s = new Scanner(System.in);
		int re[] = new int[42];
		int i=0;
		for(i=0;i<10;i++){
			no[i]=s.nextInt();
			re[no[i]%42]++;
		}
		int counter=0;
		for(i=0;i<42;i++){
			if(re[i]!=0) counter++;
		}
		System.out.printf("%d",counter);
	}
}

