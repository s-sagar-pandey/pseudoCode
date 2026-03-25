
import java.util.Scanner;

public class CountHowManyDigits {
    public static void counter(int num, int d){
        int count = 0;
        while(num > 0){
            int lastdigit = num%10;
            if(lastdigit == d){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = sc.nextInt();
        counter(num, d);
    }
}
/*pseudo code

*/
