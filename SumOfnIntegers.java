import java.util.*;
public class SumOfnIntegers {
    public static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
/*pseudo code
DECLARE n : INTEGER
DECLARE sum : INTEGER
READ n
sum := 0
    FOR i:=1 TO n
    sum := sum + i
    END FOR
PRINT SUM
*/