public class CountDigitsOfaNumber {
    public static int counter(int num){
        int count = 0;
        while(num > 0){
            num/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 789456;
        System.out.println(counter(num));
    }
}
/*Pseudo Code
DECLARE num:INTEGER
DECLARE count:INTEGER
SET count := 0
READ num
WHILE num > 0
    num = num/10
    INCREMENT count
    END WHILE
PRINT count
*/