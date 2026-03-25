import java.util.*;
public class ReverseaNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int n = sc.nextInt();
        while(n > 0){
            int lastdigit = n % 10;
            r = r*10+lastdigit;
            n /= 10;
        }
        System.out.println(r);
    }
}