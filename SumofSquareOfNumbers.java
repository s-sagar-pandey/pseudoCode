
import java.util.Scanner;

public class SumofSquareOfNumbers {
    public static int sumOfSquare(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSquare(n));
    }
}
/*Pseudo code
DECLARE num : INTEGER
DECLARE sum : INTEGER
READ num
SET sum := 0
DECLARE i : INTEGER
    FOR i to num
    sum = sum + i*i
    END FOR
PRINT sum
*/