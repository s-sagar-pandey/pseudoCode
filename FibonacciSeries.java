
import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacci(int n){
        int sum = 0;
        int prev = 0;
        int next = 1;
        while(n >= 0){
            sum = prev + next;
            prev = next;
            next = sum;
            n--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}
/*pseudo code
    DECLARE n: INTEGER
    DECLARE prev : INTEGER
    DECLARE next : INTEGER
    DECLARE sum : INTEGER
    SET prev:=0,next:=1,sum:=0
    READ n
    PRINT prev
    PRINT next
    WHILE sum <= 0
        sum := prev + next
        PRINT sum
        prev := next
        next := sum
    END WHILE
 */