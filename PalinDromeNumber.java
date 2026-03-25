import java.util.Scanner;

public class PalinDromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int m = n;
        while(n > 0){
            int lastdigit = n % 10;
            r = r*10 + lastdigit;
            n /= 10;
        }
        if(m == r){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
    }
}
