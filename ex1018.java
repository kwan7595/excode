import java.util.Scanner;
public class ex1018{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int m=0,n=0,i=0,j=0,k=0,c=0,e=0;
		n=s.nextInt();
		m=s.nextInt();
		char och[][] = new char[n][m];
		char nch[][] = new char[8][8];
		int rm=0;
		for(i=0;i<n;i++) och[i]=s.next().toCharArray();
		int n1,m1;
		int temp=999999;
		for(n1=0;n1<n-7;n1++){
			for(m1=0;m1<m-7;m1++){
				for(i=0+n1;i<n1+8;i++){
					for(j=0+m1;j<m1+8;j++){
						nch[i-n1][j-m1]=och[i][j];
					}
				}
				if(nch[0][0]=='W'){//when i,j =='w', replacing array via even&odd col.
					for(c=0;c<8;c++){
						if(c/2==0){//even rows replacing.
							for(e=0;e<8;e++){
								if(e/2==0&&nch[c][e]!='W'){
									nch[c][e]='W';
									rm++;
								}	
							else if(e/2!=0&&nch[c][e]=='W'){
									nch[c][e]='B';
									rm++;
								}
							}
						}
						else if(c/2!=0){
							for(e=0;e<8;e++){
								if(e/2==0&&nch[c][e]!='B'){
										nch[c][e]='B';
										rm++;
									}
								else if(e/2!=0&&nch[c][e]=='B'){
										nch[c][e]='W';
										rm++;
								}
							}
						}
					}
				}
				else if(nch[0][0]=='B'){ //whe i,j='B'
					for(c=0;c<8;c++){
						if(c/2==0){//even rows-col replacing.
							for(e=0;e<8;e++){
								if(e/2==0&&nch[c][e]!='B'){
									nch[c][e]='B';
									rm++;
								}
							else if(e/2!=0&&nch[c][e]=='B'){
									nch[c][e]='W';
									rm++;
								}
							}
						}
						else if(c/2!=0){ //even row/odd col replacing 
							for(e=0;e<8;e++){
								if(e/2==0&&nch[c][e]!='W'){
										nch[c][e]='W';
										rm++;
									}
								else if(e/2!=0&&nch[c][e]=='W'){
										nch[c][e]='B';
										rm++;
								}
							}
						}
					}
				}
				if(temp>=rm){
					temp=rm;
					rm=0;
				}
				else rm=0;
				}
			}
//		System.out.printf("%d",rm);
		for(i=0;i<8;i++){
			for(j=0;j<8;j++) System.out.printf("%c",nch[i][j]);
			System.out.printf("\n");
		}
	}
}




