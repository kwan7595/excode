import java.util.Scanner;
public class ex10250{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		int user[][] = new int[3][test];
		int roomno[] = new int[test];
		for(int i=0;i<test;i++){
			for(int j=0;j<3;j++) user[j][i]=s.nextInt();
			roomno[i]= ((user[2][i]/user[0][i])+1)+(user[2][i]%user[0][i])*100;
			System.out.printf("%d\n",roomno[i]);
		}
	}
}

