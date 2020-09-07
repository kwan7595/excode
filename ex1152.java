import java.util.Scanner;
import java.util.StringTokenizer;
public class ex1152{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String strData;
		strData = s.nextLine();
		StringTokenizer st= new StringTokenizer(strData," ");
		int count=0;
		while(st.hasMoreTokens()) count++;
		System.out.printf("%d",count);
	}
}
		
