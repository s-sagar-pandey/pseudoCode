public class QuestionEleven {
    public static void main(String[] args) {
        int x = 0;
        int n = 1;
        while(n <= 100){
            x = x + n;
            n = n + 1;
        }
        System.out.println(x);
    }
}
/*pseudo code
SET x to 0
SET n to 1
WHILE(n <= 100)
    x = x + n
    n = n + 1
END WHILE
WRITE x
 */