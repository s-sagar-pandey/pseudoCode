public class QuestionFive {
    public static void main(String[] args) {
        int p = 6, q = 3, r = 5;
        q = 1 + r;
        q = 5 + q;
        if(5 < r || (p + r) > (r - p)){
            p = (9 & 7)+p*p;
            q = 5 + q * q;
        }
        System.out.println(p + q + r);
    }
}
/*pseudo code
INTEGER p, q, r
SET p = 6, q = 3, r = 5
    q = 1 + r
    q = 5 + q
    IF(5<r or (p+r)>(r-p))
        p = (9&7)+p*p
        q = 5 + q * q
    END IF
    PRINT (p + q + r)
*/