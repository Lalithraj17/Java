import java.util.Scanner;
class Demo{
    public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) 
         {
            //array
            /*System.out.print("Enter the Size : ");
            int n=sc.nextInt();
            int age[]= new int[n];
            for (int i=0; i<n; i++)
            {
                System.out.print("Enter the age "+(1+i)+" : ");
                age[i]=sc.nextInt();
            }
            System.out.println("Ages are : ");
            int sum=0;
            for(int i=0; i<age.length; i++)
            {
                System.out.print("Enter the age "+(1+i)+" : ");
                System.out.println(age[i]);
                sum+=age[i];
            }
            System.out.println("Total ages = "+sum);
            System.out.println("Average ages = "+(sum/n));*/


            /*System.out.print("Enter the Size : ");
            int n=sc.nextInt();
            int num[]= new int[n];
            for (int i=0; i<n; i++)
            {
                System.out.print("Enter the num "+(1+i)+" : ");
                num[i]=sc.nextInt();
            }
            System.out.println("Nums are : ");
            int count=0;
            for(int i=0; i<num.length; i++)
            {
                // System.out.print("Enter the age "+(1+i)+" : ");
                // System.out.println(age[i]);
                if(num[i]%2==0){
                    count++;
                    System.out.println(num[i]+" is Even");
                }
                else{
                    System.out.println(num[i]+" is Odd");
                }
            }
            System.out.println("Total Even nums = "+count);
            System.out.println("Total Odd nums = "+(n-count));*/


                //Range of data types in array
                /*System.out.println("Enter values for different data types:");
                int o;
                System.out.print("Enter the Size of Byte : ");
                int b1=sc.nextInt();
                byte b[] = new byte[b1];
                for(o=0; o<b1; o++){
                System.out.print("Enter a byte value: ");
                b[o] = sc.nextByte();
                
                }

                System.out.print("Enter the Size of Short : ");
                int s1=sc.nextInt();
                short[] s = new short[s1];
                for(o=0; o<s.length; o++){
                System.out.print("Enter a short value: ");
                s[o] = sc.nextByte();
                }

                System.out.print("Enter the Size of Integer : ");
                int i1=sc.nextInt();
                int i[] = new int[i1];
                for(o=0; o<i.length; o++){
                System.out.print("Enter an integer value: ");
                i[o] = sc.nextInt();
                }

                System.out.print("Enter the Size of Long : ");
                int l1=sc.nextInt();
                long[] l = new long[l1];
                for(o=0; o<l.length; o++){
                System.out.print("Enter a long value: ");
                l[o] = sc.nextLong();
                }

                System.out.print("Enter the Size of Float : ");
                int f1=sc.nextInt();
                float[] f = new float[f1];
                for(o=0; o<f.length; o++){
                System.out.print("Enter a float value: ");
                f[o] = sc.nextFloat();
                }

                System.out.print("Enter the Size of Double : ");
                int d1=sc.nextInt();
                double[] d = new double[d1];
                for(o=0; o<d.length; o++){
                System.out.print("Enter a double value: ");
                d[o] = sc.nextDouble();
                }

                System.out.print("Enter the Size of Char : ");
                int c1=sc.nextInt();
                char[] c = new char[c1];
                for(o=0; o<c.length; o++){
                System.out.print("Enter a character: ");
                c[o] = sc.next().charAt(o);
                }

                System.out.print("Enter the Size of boolean : ");
                int bool1=sc.nextInt();
                boolean[] bool = new boolean[bool1];
                for(o=0; o<bool.length; o++){
                System.out.print("Enter a boolean value: ");
                bool[0] = sc.nextBoolean();
                }

                System.out.println("Array:");
                System.out.println("Byte: " + Arrays.toString(b));
                System.out.println("Short: " +Arrays.toString(s));
                System.out.println("Integer: " +Arrays.toString(i));
                System.out.println("Long: " +Arrays.toString(l));
                System.out.println("Float: " +Arrays.toString(f));   
                System.out.println("Double: " +Arrays.toString(d));
                System.out.println("Character: " +Arrays.toString(c));
                System.out.println("Boolean: " +Arrays.toString(bool));*/



                //Binary operations
                /*int a=-1;
                System.out.println(Integer.toBinaryString(a));
                a<<=3;
                 System.out.println(Integer.toBinaryString(a));
                System.out.println(a);
                b>>=2;
                System.out.println(Integer.toBinaryString(a));
                System.out.println(b);
                System.out.println(Integer.toBinaryString(b));
                a<<=1;
                 System.out.println(Integer.toBinaryString(a));
                System.out.println(a);
                a>>>=2;
                System.out.println(Integer.toBinaryString(a));
                System.out.println(a);*/

            //Simple IF
            /*int a=sc.nextInt();
            if(a%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }*/


             
        //Palindrom
        /*String or = sc.nextLine();
        String re = new StringBuilder(or).reverse().toString();
        System.out.println("Original: " + or);
        System.out.println("Reversed: " + re);
            if(re==or){
                System.out.println(or+" is Palindrom");
            }
            else{
                System.out.println(or+" is not Palindrom");
            }*/


        //Palindrom using while
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
            while(temp>0){
                int a = temp%10;
                sum=sum*10+a;
                temp=temp/10;
            }
            System.out.println("reversed :"+sum);
            if(sum==num){
                System.out.println(num+" is Palindrom");
            }
            else{
                System.out.println(num+" is not Palindrom");
            }

        //do while
        /*int n=sc.nextInt();
        int i=1,f=1;
		do {
			f=f*i;
			i++;
		}
		while(i<=n);
		System.out.print(f);*/

        
        //continue & break
        /*int i=5;
        while(i>=1)
        {
            System.out.println(i);
            if(i==3)
            {
                break;//continue is the infinite loop
            }
            i--;
        }*/


            
        }
    }
}