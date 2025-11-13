import java.util.*;
public class TwoDarray {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of row : ");
        int n=sc.nextInt();
        System.out.print("Enter no of coloum : ");
        int m=sc.nextInt();
        int[][] arr1= new int[n][m];
        int i,j;
        System.out.println("Enter A matrix : ");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
            arr1[i][j]=sc.nextInt();
            }
        }

        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
            if(i>0 && j<m-1){
                arr1[i][j]-=arr1[i][j];
            }
            }
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
              System.out.print(arr1[i][j]+" ");  
            }
            System.out.println();
        }
        // int[][] arr2= new int[n][m];
        // System.out.println("Enter B matrix : ");
        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //     arr2[i][j]=sc.nextInt();
        //     } 
        // }
        // int[][] arr3= new int[n][m];
        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //     arr3[i][j]=arr1[i][j]+arr2[i][j];
        //     } 
        // }
        // // System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // System.out.println("Addtion of Matrix 'A'& 'B' : ");
        // for(i=0;i<n;i++)
        // {
        //     for(j=0;j<m; j++){
        //         System.out.print(arr3[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //     arr3[i][j]=arr1[i][j]-arr2[i][j];
        //     } 
        // }
        // System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // System.out.println("Subtraction of Matrix 'A'& 'B' : ");
        // for(i=0;i<n;i++)
        // {
        //     for(j=0;j<m; j++){
        //         System.out.print(arr3[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // int[][] arr4= new int[n][m];
        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //         for(int k=0; k<m; k++){
        //             arr4[i][j]+=arr1[i][k]*arr2[k][j];
        //         }
        //     } 
        // }
        // System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // System.out.println("Mulitiplication of Matrix 'A'& 'B' : ");
        // for(i=0;i<n;i++)
        // {
        //     for(j=0;j<m; j++){
        //         System.out.print(arr4[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        
        // System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // System.out.print("Enter Element to search : ");
        // int se=sc.nextInt();
        // System.out.println("Even no in A matrix");
        // int sum=0; 
        // int count=0;   
        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //     if(arr1[i][j]%2==0){
        //         System.out.print(arr1[i][j]+" ");
        //         sum+=arr1[i][j];
        //     }
        //     if(se==arr1[i][j]){
        //         count++;
        //     }
        //     }
        // }
        // System.out.println();
        // System.out.println("Sum of even no : "+sum);
        // System.out.println("Count of element "+se+" : "+count);

        // System.err.println();
        // int sum1=0;
        // System.out.println("ODD no in A matrix");
        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //     if(arr1[i][j]%2!=0){
        //         System.out.print(arr1[i][j]+" ");
        //         sum1+=arr1[i][j];
        //     }
        //     }
        // }
        // System.err.println();
        // System.out.println("Sum of odd no : "+sum1);
        

        // System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // System.out.println("Even no in B matrix");    
        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //     if(arr2[i][j]%2==0){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     }

        // }
        // System.err.println();
        // System.out.println("ODD no in B matrix");
        // for(i=0; i<n; i++){
        //     for(j=0; j<m; j++){
        //     if(arr2[i][j]%2!=0){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     }
        // }
        // System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // System.out.println(Arrays.deepToString(arr3));

        // int count=0;
        // int[][] arr5 = arr1;
        // for(i=0; i<n; i++)
        // {
        //     count=0;
        //     for(j=0; j<m; j++)
        //     {
        //         for(int k=0; k<m; k++)
        //         {
        //             if(arr1[i][j]==arr5[j][k])
        //             {
        //                 count++;
        //             } 
        //         }
        //     }
        //     if(count>1)
        //     {
        //         System.out.println("element : "+arr1[i][j]);
        //     }
        // }
        
        // System.out.println("Count : "+count);
    }
}
