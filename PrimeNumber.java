import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2){
            return false;
        }else{
            for(int i = 2; i < Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
/*pseudo code
    DECLARE N:INTEGER
    READ N
    IF(N == 2)THEN
        PRINT "Prime Number"
        STOP
    ELSE
        for i ← 2 TO √n DO
            IF N MOD i = 0 THEN
            PRINT "Not Prime Number"
            STOP
        END FOR
        END IF
        PRINT "Prime"
    END
*/