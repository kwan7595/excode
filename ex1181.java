import java.util.Scanner;
import java.util.Arrays;
public class ex1181{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String str[] = new String[n];
		int len[] = new int[n];
		int i=0,j=0,temp=0;
		int count[] = new int[n];
		int counter=0;
		String tempstr="";
		for(i=0;i<n;i++){
			str[i]=s.nextLine();
			len[i]=str[i].length();
		}
		for(i=0;i<n;i++){
			for(j=1;j<n-i;j++){
				if(len[i]>len[i+j]){
					str[i]=tempstr;
					str[i]=str[i+j];
					str[i+j]=tempstr;
					len[i]=temp;
					len[i]=len[i+j];
					len[i+j]=temp;
				}
				else if(len[i]==len[i+j]){//sorting dictionary sequence via Arrays class.
					if(str[i]!=str[i+j]){
						String strt[]=new String[2];
						strt[0]=str[i];
						strt[1]=str[i+j];
						Arrays.sort(strt);
						str[i]=strt[0];
						str[i+j]=strt[1];
					}
					else if(str[i]==str[i+j]){
						count[i]=1;
						count[i+j]=1;
					}
				}
			}
		}
		for(i=0;i<n;i++){
			if(count[i]!=1) System.out.printf("%s",str[i]);
			else if(count[i]==1&&counter==0){
				System.out.printf("%s",str[i]);
				counter++;
			}
		}
	}
}


