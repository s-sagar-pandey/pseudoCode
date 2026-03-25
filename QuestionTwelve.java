public class QuestionTwelve {
    public static void main(String[] args) {
        int p = 0, q = 2, r = 9;
         r = 7 + p;
         q = q + r;
         for(int i = 4; i <= 7; i++){
            p = (p+p)&q;
            if((p + q) < (r - p)|| (8 < p)){
                p = (p+2)+q;
                 break;
            }
         }
         System.out.println(p + q);
    }
}
/*pseudo code
INTEGER p , q , r
SET p = 0, q = 2, r = 9
r = 7 + p
q = q + r
    FOR EACH r FROM 4 to 7
    p = (p + p)&q
    if((p + q) < (r - p) || 8 < p)
        p = (p + 2) + q
     JUMP OUT OF THE LOOP
     END IF
    END FOR
*/