import java.util.Scanner;
public class ex5543{
	public static void main(String[] args){	
		Scanner s= new Scanner(System.in);
		int[] burger = {0,0,0};
		int[] soda = {0,0};
		int i,j;
		int temp=0;
		for(i=0;i<3;i++){
			burger[i] = s.nextInt();
			if(i==0) temp=burger[i];
			if(temp>burger[i]) temp = burger[i];
		}
		for (j=0;j<2;j++){
			soda[j] = s.nextInt();
		}
		if(soda[0]>soda[1]){
			System.out.printf("%d",temp+soda[1]-50);
		}
		else{
			System.out.printf("%d",temp+soda[0]-50);
		}
	}
}
