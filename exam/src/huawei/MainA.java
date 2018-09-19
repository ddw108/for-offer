package huawei;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/19 19:01
 */
public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.close();
        int resDay = 0;
        switch (month) {
            case 1:
                resDay = 0;
                break;
            case 2:
                resDay = 31;
                break;
            case 3:
                resDay = 59;
                break;
            case 4:
                resDay = 90;
                break;
            case 5:
                resDay = 120;
                break;
            case 6:
                resDay = 151;
                break;
            case 7:
                resDay = 181;
                break;
            case 8:
                resDay = 212;
                break;
            case 9:
                resDay = 243;
                break;
            case 10:
                resDay = 273;
                break;
            case 11:
                resDay = 304;
                break;
            case 12:
                resDay = 334;
                break;
        }
        resDay += day;
        int result = resDay % 7 == 0 ? 7 : resDay % 7;
        System.out.println(result);
    }
}
