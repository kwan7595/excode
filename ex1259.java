import java.util.Scanner;
public class ex1259{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String n1="",n2="",n3="";	
		int n=0,counter=0;
		while(s.nextInt()!=0){
			n1=s.next();
			n=n1.length();
			if(n/2==0){
				n2=n1.substring(0,n/2);
				n3=n1.substring(n/2,n);
			}
			else{
				n2=n1.substring(0,(n-1)/2);
				n3=n1.substring(((n-1)/2)+1,0);
			}
			for(int i=0;i<n/2;i++){
				if((int)n2.charAt(i)==(int)n3.charAt(n/2-i)) counter++;
			}
			if (counter==n/2) System.out.print("yes");
			else System.out.print("no");
			counter=0;
		}
	}
}
