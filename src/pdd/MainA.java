package pdd;

import java.util.Scanner;

public class MainA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int HP = in.nextInt();
        int normalAttack = in.nextInt();
        int buffedAttack = in.nextInt();
        in.close();
        double result = 0;
        if (normalAttack * 2 >= buffedAttack) {
            result = Math.ceil((double)HP/normalAttack);
        } else {
            int temp = (HP/buffedAttack) * 2;
            int remain = HP%buffedAttack;
            double result1 = Math.ceil((double)HP/buffedAttack) * 2;
            double result2 = temp + Math.ceil((double)remain/normalAttack);
            result = Math.min(result1, result2);
        }
        System.out.println((int)result);
    }
}