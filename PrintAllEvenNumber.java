import java.util.Scanner;

public class PrintAllEvenNumber {
    public static void printEven(int n){
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n);
    }
}
/*Pseudo Code
    DECLARE num : INTEGER
    DECLARE i : INTEGER
    SET i := 0
    READ num
    FOR i := 1 TO num
      IF i MOD 2 == 0
        PRINT i
    END IF
    END FOR

*/