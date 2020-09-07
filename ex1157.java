import java.util.Scanner;

public class ex1157{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int counter[] = new int[26];//alphabet counter array
		char a[] = new char[26];//alphabet saving array
		int i=0;
		for(i=0;i<26;i++){ //resets each array with lowercase alphabets/0
			counter[i]=0;
			a[i]=(char)(i+97);
		}
		String str = s.nextLine();
		str= str.toLowerCase();//lower the string
		for(int k=0;k<str.length();k++){
			for(int j=0;j<a.length;j++){
				if(str.charAt(k)==a[j]) counter[j]++;
			}
		}
		int max=0,count=0,index=0;
		for(i=0;i<26;i++){//finding the most frequent alphabet
			if(counter[i]>max){
				max=counter[i];
				index=i;
			}
			else if(counter[i]==max&&str.length()!=1){
				System.out.printf("?");
				count=1;
				break;
			}
		}
		if(count!=1) System.out.printf("%c",(index+65));
		}
}

