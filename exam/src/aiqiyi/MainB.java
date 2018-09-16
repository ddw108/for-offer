package aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/15 11:00
 */
public class MainB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("\\s+");
        int index;
        int foodNum = Integer.valueOf(str[0]);
        int[] nums = new int[foodNum];
        int dayNum = Integer.valueOf(str[1]);
        int foodP = Integer.valueOf(str[2]);
        str = scanner.nextLine().split("\\s+");
        for (int i = 0; i < foodNum; i++) {
            nums[i] = Integer.valueOf(str[i]);
        }
        for (int i = 0; i < dayNum; i++) {
            str = scanner.nextLine().split("\\s+");
            index = Integer.valueOf(str[1]) - 1;
            if (str[0].equals("A")) {
                nums[index] += 1;
            } else {
                nums[index] -= 1;
            }
        }
        scanner.close();
        int finalRes = nums[foodP - 1];
        int result = 1;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != finalRes) {
                result++;
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}