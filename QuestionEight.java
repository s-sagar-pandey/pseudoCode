public class QuestionEight {
    public static void main(String[] args) {
        int p = 3, q = 8, r = 1;
        int sum = p + q + r;
        if((p!=0)&&(sum != 11)&&(q != 4)&&(r != 0)){
            System.out.println("Success");
        }else{
            System.out.println("Fail");
        }
    }
}
/*pseudo code
p = 3, q = 8, r = 1
INTEGER p,q,r,sum
SET sum := p+q+r
IF((p NOT EQUALS 0) and (sum EQUALS 11) and (q EQUALS 4) and (r NOT EQUALS 0))
    PRINT "Success"
  OTHERWISE
    PRINT "Fail"
    END IF
*/
