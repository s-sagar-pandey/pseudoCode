public class ExampleOne {
    public static void main(String[] args) {
        int x = 15;
        int y = 12;
        y = x-1;
        do {
            System.out.println(x);
            x = y+(x-2);
        } while (x < 40);
    }
}
/*pseudo code
    DECLARE x : INTEGER
    DECLARE y : INTEGER
    SET x = 15, y = 12
    y = x-1
    do{
        PRINT x
        x = y + (x-2)
    }WHILE (x < 40)
    END DOWHILE
*/