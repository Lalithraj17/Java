import java.util.*;
public class xogame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of row :");
        int n=sc.nextInt();
        System.out.println("Enter no of coloum :");
        int m=sc.nextInt();
        char arry[][]=new char[n][m];
        int i,j,count=0;
        int win=0;
        while (win!=0) {
            System.out.print("x's turns, enter coordinates :");
            i=sc.nextInt();
            j=sc.nextInt();
            arry[i][j]='x';
            System.out.print("o's turns, enter coordinates :");
            i=sc.nextInt();
            j=sc.nextInt();
            arry[i][j]='o';
            int no=0;
            if(count<=2){
                int t=0,b=2;
                int l=0,r=2;
                for(int k=0; k<arry.length; k++){
                    if (arry[l][k]=='o'){
                        no++;
                        if(no==2){
                            System.out.println("O WINS");
                            win++;
                        }
                    }
                }l++;
                for(int k=0; k<arry.length; k++){
                    if(arry[k][t]=='o'){
                        if(no==2){
                            System.out.println("O WINS");
                            win++;
                        }
                    }
                }t++;
                for(int k=0; k<arry.length; k++){
                    

                } 
            }
            count++;
        }
    }
}
