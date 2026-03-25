public class QuestionThree {
    public static void main(String[] args) {
        int x = 259;
        if(x % 9 == 5){
        System.out.println("0");
        }else if(x % 9 == 0){
            System.out.println("9");
        }else{
            System.out.println(x%9);
        }
    }
}
/*pseudo code
DECLARE x : INTEGER
SET x := 259
    PRINT"0"
OTHERWISE
IF(x MOD 9 EQUALS 0)
    PRINT '9'
OTHERWISE
    PRINT x MOD 9
    ENDIF
*/