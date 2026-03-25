public class QuestionFourteen {
    public static void main(String[] args) {
        int a = 7, b = 10, c = 9;
        for(int i = 3; i <= 4; i++){
            a = b;
            if((b- a + i) < (c + b)){
                continue;
            }else{
                break;
            }
        }
        System.out.println(a+b);
    }
}
/*pseudo code
INTEGER a,b,c
SET a := 7, b := 10, c := 9
    FOR (EACH i FROM 3 to 4)
        a = b
    IF((b- a + i) < (c + b))
        CONTINUE
    ELSE
        JUMP OUT OF THE LOOP
    END IF
    a = (5+6)^c
    END FOR
    PRINT a+b
*/