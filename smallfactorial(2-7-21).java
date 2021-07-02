import java.util.Scanner;
class smallfactorials {
public static int fact(int n) {
    int fact = 1;
    for(int i=1;i<=n;i++){
        fact = fact*i;
    }
    return fact;
    }    
      public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
System.out.print("Enter Number Of Test Cases:");
int t = sc.nextInt();
int arr[] = new int[t];
System.out.print("Enter Numbers:");
for(int i = 0;i<t;i++){
arr[i] = sc.nextInt();
}
sc.close();
for(int i=0;i<t;i++){
    System.out.println(fact(arr[i]));
}
}
}
