import java.util.Scanner;
public class ex1018{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int m,n,i,j,k;
		n=s.nextInt();
		m=s.nextInt();
		char och[][] = new char[n][m];
		char nch[][] = new char[8][8];
		int rm=new int[(n-7)*(m-7)];
		Arrays.fill(rm,0);// reset array rm within 0
		for(i=0;i<n;i++){
			for(j=0;j<m;j++) och[i][j]=s.next();
		}
		int n1,m1;
		int temp=999999;
		for(n1=0;n1<n-7;n++){
			for(m1=0;m1<m-7;m++){
				for(i=0+n1;i<n1+7;i++){
					for(j=0+m1;j<m1+7;j++){
						nch[i][j]=och[i][j];
					}
				}
				if(nch[i][j]=='W'){//when i,j =='w', replacing array via even&odd col.				
					for(int c=0;c<7;c++){
						if(c/2==0){//even rows replacing.
							for(int e=0;e<7;e++){
								if(e/2==0&&nch[i+c][j+e]!='W'){
									nch[i+c][j+e]='W';
									rm++;
								}	
							else if(e/2!=0&&nch[i+c][j+e]=='W'){
									nch[i+c][j+e]='B';
									rm++;
								}
							}
						}
						else{
							for(int e=0;e<7;e++){
								if(e/2==0&&nch[i+c][j+e]!='B'){
										nch[i+c][j+e]='B';
										rm++;
									}
								else if(e/2!=0&&nch[i+c][j+e]=='B'){
										nch[i+c][j+e]='W';
										rm++;
								}
							}
						}
					}
				}
				else{ //whe i,j='B'
					for(int c=0;c<7;c++){
						if(c/2==0){//even rows-col replacing.
							for(int e=0;e<7;e++){
								if(e/2==0&&nch[i+c][j+e]!='B'){
									nch[i+c][j+e]='B';
									rm++;
								}
							else if(e/2!=0&&nch[i+c][j+e]=='B'){
									nch[i+c][j+e]='W';
									rm++;
								}
							}
						}
						else{ //even row/odd col replacing 
							for(int e=0;e<7;e++){
								if(e/2==0&&nch[i+c][j+e]!='W'){
										nch[i+c][j+e]='B';
										rm++;
									}
								else if(e/2!=0&&nch[i+c][j+e]=='W'){
										nch[i+c][j+e]='B';
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
		System.out.printf("%d",temp);
	}
}



