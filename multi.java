class multi
{
    public static void main(String[] args)
    {
        int a[][] ={{10,20,},{40,50}};
        for (int[] a1 : a) 
        {
            for (int j = 0; j < a1.length; j++) 
            {
                System.out.println(a1[j]); 
            }
        }
    }
}
