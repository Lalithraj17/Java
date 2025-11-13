class chla2 {
    public static void main(String[] args){
        // try (Scanner sc = new Scanner(System.in)){
        // int income = sc.nextInt();
        // if (income > 7000)
        // {
        //     System.out.print("scholarship is available");
        // }
        // else {
        //     System.out.print("not eligible for scholarship");
        // }
        // }
        int[] a={1, 1, 2, 3};
        int sum=0;
        int i=0;
        int n=a[0];
        while(i<a.length){
            if(n>a[i]){
                int sub=n-a[i];
                sum+=sub;
            }
            else if(n<a[i]){
                for(int j=i+1; j<a.length; j++){
                    if(a[j]>a[i+1]){
                        n=a[j];
                    }
                }
            }
            i++;
        }
        System.out.println(sum);
    }
}