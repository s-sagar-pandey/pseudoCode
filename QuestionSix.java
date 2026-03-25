public class QuestionSix {
    public static void main(String[] args) {
        int x = 10, y = 16, z = 3;
        if(x > y){
            x = 2*y;
        }else{
            y = x/2;
        }
        if(z > y){
            z = 2*y;
        }else{
            y = z/2;
        }
        System.out.println(x+y+z);
    }
}
/*pseudo code
INTEGER x,y,z
SET x = 10,y = 16,z = 3
IF(x > y)
    x = 2*y
ELSE
    y = x/2
END IF
IF(z > y)
    z = 2*y
ELSE
    y = z/2
END IF
PRINT x+y+z
*/