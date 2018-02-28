package chapter4;

import java.util.Scanner;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter4.Main
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/02/24
 *     desc   :
 * </pre>
 */

class Main {

    public static void main(String[] args) {
        testSwitch();
    }

    private static void testSwitch() {
        int sex = 0;
        switch (sex) {
            case 0:
                System.out.println("男性");
                break;
            case 1:
                System.out.println("男性");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }

    private static void testFor() {
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "是偶数");
                continue;
            }
            System.out.println(i + "是奇数");
        }
    }

    private static void testWhile() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("sum:" + sum);
    }

    private static void testIfElse() {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        checkGrade(grade);
    }

    private static void checkGrade(int grade) {
        if (grade >= 90) {
            System.out.println("优秀");
        } else if (grade >= 80) {
            System.out.println("良好");
        } else if (grade >= 70) {
            System.out.println("中等");
        } else if (grade >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

}
