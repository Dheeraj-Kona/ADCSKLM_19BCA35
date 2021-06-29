import java.util.*;
class Solution
{
    
    static int reversDigits(int num)
    {
        int r,rev = 0;
        
        while(num != 0)
        {
            
            r = num%10;
            rev=rev*10+r;
            num=num/10;
        }
        
        return rev;
    }
     
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(reversDigits(num));
    }
}
