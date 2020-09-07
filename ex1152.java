import java.util.Scanner;
import java.util.StringTokenizer;
public class ex1152{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String strData;
		strData = s.nextLine();
		StringTokenizer st= new StringTokenizer(strData," ");
		int count=0;
		while(st.hasMoreTokens()){
			st.nextToken();//using nextToken() method to read next Token.
			count++;//counting the number of token in strData
		}
		System.out.printf("%d",count);
	}
}
/* using Tokenizer methods
StringTokenizer(a,b) --> a:string data, b:delimiter(can be more then 1 delimiter)
hasMoreTokens()--> returns true if there's a token to be returned, else returns false
*/
