public class QuestionTwo {
    public static void main(String[] args) {
        int a = 2, b = 5, c = 10;
        for(int i = 3; i <= 6; i++){
            a = (a+a)+a;
            a = (a^11)+i;
        }
        b = (9+7)+a;
        System.out.println(a+b);
    }
}
/*pseudo code
INTEGER a,b,c
FOR(EACH c from 3 to 6)
    a = (a+a)+a
    a = (a^11)+c
ENDFOR
    b = (9+7)+a
    PRINT a+b
*/