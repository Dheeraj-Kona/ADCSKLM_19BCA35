import java.util.Scanner;
public class sample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
switch (ch){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    System.out.println("Given Character Is Vowel");
    break;
    default:
    System.out.println("Given Character Is Consonant");
    break;
}

}
}
