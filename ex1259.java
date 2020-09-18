import java.util.Scanner;
public class ex1259{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=0,i=0,count=0;
		String number="",number1="",number2="",number2r="";
		while(s.nextInt()!=0){
			n=s.nextInt();
			number=Integer.toString(n);
			if(number.length()/2==0){
				number1=number.substring(0,n/2);
				number2=number.substring((n/2)+1,n-1);
			}
			else{
				number1=number.substring(0,(n-1)/2);
				number2=number.substring(((n-1)/2)+2,n-1);
			}
			for(i=0;i<number2.length();i++) number2r.charAt(i)=number2.charAt(n-i);
			if(number2r==number1) System.out.printf("yes\n");
			else System.out.printf("no\n");
		}
	}
}

			
