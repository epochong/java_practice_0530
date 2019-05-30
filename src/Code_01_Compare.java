import java.math.BigDecimal;

/**
 * @author wangchong
 * @date 2019/5/29 20:19
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_Compare {
    public static BigDecimal bigDecimalFibonacci(int n) {
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(1);
        BigDecimal c = new BigDecimal(1);
        for (int i = 3; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
    public static BigDecimal recursionBigDecimalFibonacci(int n) {
        if (n <= 2) {
            return new BigDecimal(1);
        }
        return recursionBigDecimalFibonacci(n - 1).add(recursionBigDecimalFibonacci(n - 2));
    }
    public static int recursionFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
    }
    public static int fibonacci(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 55; i++) {
            System.out.print((i + 1)+ ":" + fibonacci(i) + " ");
        }
        System.out.println();
        for (int i = 0; i< 55; i++) {
            System.out.print((i + 1) + ":" + bigDecimalFibonacci(i) + " ");
        }
     /*   System.out.println();
        for (int i = 0; i< 55; i++) {
            System.out.print((i + 1) + ":" + recursionFibonacci(i) + " ");

        }
        System.out.println();
        for (int i = 0; i< 55; i++) {
            System.out.print((i + 1) + ":" + recursionBigDecimalFibonacci(i) + " ");

        }*/
    }
}
