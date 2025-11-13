public class methodss
{
    //No Parameter, No Return type
    public void printt()
    {
        System.out.println("Hello....");
    }
    //With Parameter, No Return type
    public void addtion(int a, int b)//(a,b) is parameters,(10,20) is arguments
    {
        System.out.println(a+b);
    }
    //No Paramete, With Return type
    public int add()
    {
        int c=10;
        int d=30;
        int e=c+d;
        return e;
    }
    //with parameter, With Return type
    public int sub(int p, int q)
    {
        int r=p-q;
        return r;
    }
    public static void main(String[] args) 
    {
        int num1=10;
        int num2=20;
        //With Arguments
        methodss ob=new methodss();
        ob.addtion(num1, num2);
        //Without Arguments
        ob.printt();
        int ans=ob.add();
        System.out.println(ans);
        int s=ob.sub(num1, num2);
        System.out.println(s);
    }
}
