public class QuestionNine {
    public static void main(String[] args) {
        int x,y,z;
        x = 10; y = 6; z = 6;
        if(x > y){
            x = y;
        }else{
            y = x;
        }
        if(z > y){
            z = y;
        }else{
            y = z;
        }
        System.out.println(x+y+z);
    }
}
/*Pseudo code
INTEGER x,y,z
SET x := 10, y := 6, z = 6
IF(x > y)
    x = y
ELSE
    y = x
END IF
IF(z > y)
    z = y
ELSE
    y = z
END IF
PRINT x+y+z
*/