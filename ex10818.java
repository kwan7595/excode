import java.util.Scanner;
public class ex10818{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int no[] = new int[num];
		int max=0,min=1000000,i=0;
		for(i=0;i<num;i++){
			no[i]=s.nextInt();
			if(no[i]>=max) max=no[i];
			if(no[i]<=min) min=no[i];
		}
		System.out.printf("%d %d",min,max);
	}
}


