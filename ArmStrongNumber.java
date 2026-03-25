import java.util.Scanner;

public class ArmStrongNumber {
    public static boolean isPalindrome(int num){
        int sum = 0;
        int num1 = num;
        while(num > 0){
            int lastdigit = num%10;
            sum += lastdigit*lastdigit*lastdigit;
            num/=10;
        }
        return num1 == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
//Psudo code
/*
    DECLARE num : INTEGER
    DECLARE num1 : INTEGER
    DECLARE sum : INTEGER
    DECLARE Lastdigit : INTEGER
    READ num
    SET num1 := num
    SET sum := 0
    WHILE(num > 0)
        LastDigit = num MOD 10
        sum = sum + LastDigit*LastDigit*LastDigit
        num = num/10
    END WHILE
    IF (sum == num1) THEN
        PRINT "Palindrome"
    ELSE
        PRINT "Not Palindrome"
*/