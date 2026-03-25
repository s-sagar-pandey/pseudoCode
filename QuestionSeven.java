public class QuestionSeven {
    public static void main(String[] args) {
        int x = 8, y = 6, z = 4;
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
/*pseudo code
INTEGER x,y,z
SET x = 8, y = 6, z = 4
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
PRINT x + y + z
*/