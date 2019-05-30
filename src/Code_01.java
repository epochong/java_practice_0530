import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/29 20:57
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        BigDecimal leftFibo = new BigDecimal(0);
        BigDecimal rightFibo = new BigDecimal(0);
        while (true) {
            if (bigDecimalFibonacci(i).compareTo(new BigDecimal(n)) < 0) {
                i++;
            } else if (bigDecimalFibonacci(i).compareTo(new BigDecimal(n)) > 0) {
                leftFibo = bigDecimalFibonacci(i - 1);
                rightFibo = bigDecimalFibonacci(i);
                int left = n - 1;
                int right = n + 1;
                int index = 1;
                while (true) {
                    BigDecimal tem = new BigDecimal(left--);
                    BigDecimal temRight = new BigDecimal(right++);
                    int judge = tem.compareTo(leftFibo);
                    int judgeRight = temRight.compareTo(rightFibo);
                    if (judge  == 0 || judgeRight == 0)  {
                        System.out.println(index);
                        break;
                    } else {
                        index++;
                    }
                }
                break;
            } else {
                System.out.println(0);
                break;
            }
        }
    }
}
