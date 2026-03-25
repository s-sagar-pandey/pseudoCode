
import java.util.Scanner;

public class CheckWhetherDigitisPresent {
    public static boolean isPresent(int num, int d){
        boolean found = false;
        while(num > 0){
            int lastdigit = num%10;
            if(lastdigit == d){
                found = true;
                break;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(isPresent(num, d));
    }
}
/*psudo code

DECLARE NUM: INTEGIER
DECLARE Lastdigit : INTEGER
DECLARE d: INTEGER
DECLARE found: BOOLEAN
SET found = False
Read d
WHILE num > 0
Lastdigit =num MOD 10
num = num/10
If Lastdigit == d THEN
found = TRUE
BREAK
END IF
END WHILE
IF Found ==TRUE THEN
PRINT" Search Succesfull"
ELSE
PRINT "Search unsuccesstul"
END JF*/