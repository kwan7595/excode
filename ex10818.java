import java.util.Scanner;
public class ex10818{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int no[] = new int[num];
		int temp=0,max=0,min=0,i=0;
		for(i=0;i<num;i++) no[i]=s.nextInt();
		for(i=0;i<num;i++){
			if(no[i]>=temp) temp=no[i];
		}
		max=temp;
		temp=no[0];
		for(i=0;i<num;i++){
			if(no[i]<=temp) temp=no[i];
		}
		min=temp;
		System.out.printf("%d %d",min,max);
	}
}


