import java.util.Scanner;
public class ex10814{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=0,no=0;
		String str[] = new String[n];
		int age[] = new int[n];
		int id[] = new int[n];
		for(i=0;i<n;i++){
			str[i]=s.nextLine();
			no=str[i].indexOf(" ");
			age[i]=Integer.parseInt(str[i].substring(0,no));
			str[i]=str[i].substring(no,str[i].length());
		}
		int j=0,k=0,temp=0;
		for(i=0;i<n;i++){
			for(k=i;k<n-i;k++){
				if(age[i]>=age[i+k]){
					temp=age[i+k];
					age[i+k]=age[i];
					age[i]=temp;
					id[i+k]=i;
					id[i]=i+k;
				}
			}
		}
		for(i=0;i<n;i++) System.out.printf("%s",age[i]+str[id[i]]);
	}
}


