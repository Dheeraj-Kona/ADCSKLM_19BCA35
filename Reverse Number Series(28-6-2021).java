import java.util.Scanner;
public class rev
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Intial Value:");
        int n = sc.nextInt();
           System.out.println("Enter Range Value:");
        int m = sc.nextInt();
         int i = n;
        while(i>=m){
               System.out.println(i);
               i=i-2;

        }
		
	}
}
