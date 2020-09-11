import java.util.Scanner;

public class ex10809{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a[] = new int[26];
		int b[] = new int[26];
		for(int i=0;i<26;i++){
			a[i]=97+i;
			b[i]=-1;
		}
		String str = s.nextLine();
		int word[] = new int[str.length()];
		for(int i=0;i<str.length();i++){
			word[i]=(int)str.charAt(i);
			for(int j=0;j<26;j++){
				if(word[i]==a[j]&&b[j]==-1) b[j]=i;
			}
		}
		for(int j=0;j<26;j++) System.out.printf("%d ",b[j]);
	}
}
