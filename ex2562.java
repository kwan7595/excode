import java.util.Scanner;
public class ex2562{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int no=0,count=0,temp=0,i=0;
		for(i=0;i<9;i++){
			no=s.nextInt();
			if(no>=temp){
				temp=no;
				count++;
			}
		}
		System.out.printf("%d\n%d",temp,count);
	}
}
/*
   ex2562 (09/05)
maximum sort
use temp&counter //use list
no=1st no.
temp = 0,count=0
if no>=temp temp=no, count++
print temp,no
*/
