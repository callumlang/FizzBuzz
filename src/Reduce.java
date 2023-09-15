public class Reduce {
    public static void main(String[] args) {
        Integer count = 0;
        Integer num = 100;
        // introduce num somehow?
        while (num != 0) {
            boolean divisibleBy2 = num % 2 == 0;
            if (divisibleBy2) {
                num = num / 2;
                count += 1;
            }
            else {
                num = num - 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
