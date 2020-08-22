import java.util.Scanner;
public class ex2446{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int input=s.nextInt();
		int i=0,j=0;
		int count=input-1;
		for(i=0;i<input;i++){
			if(i!=0){
				for(int k=0;k<i;k++) System.out.print(" ");
			}
			for(j=0;j<(count*2)+1;j++){	
				System.out.printf("*");
			}
			if(i!=0){
				 for(int k=0;k<i;k++) System.out.print(" ");                 
			}
			System.out.print("\n");
			count--;
		}
		count+=1;
		for(i=input-1;i>0;i--){
			if(i!=0){
				for(int k=0;k<i+1;k++) System.out.print(" ");
			}
			for(j=0;j<(count*2)+1;j++){
				System.out.printf("*");
			}
			if(i!=0){
				for(int k=0;k<i+1;k++) System.out.print(" ");
			}
			System.out.print("\n");
			count++;
		}
	}
}

