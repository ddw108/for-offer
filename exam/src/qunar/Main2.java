package qunar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int[] Pay = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            Pay[i] = Integer.valueOf(scanner.nextLine().split(" ")[1]);
        }
        scanner.close();
        int avg = 0;
        for (int i = 0; i < names.length; i++) {
            avg += Pay[i];
        }
        avg = avg / names.length;
        ArrayList<Integer> LessPay = new ArrayList<>();
        ArrayList<String> lessPerson = new ArrayList<>();
        ArrayList<Integer> MorePay = new ArrayList<>();
        ArrayList<String> morePerson = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if (Pay[i] > avg) {
                MorePay.add(Pay[i] - avg);
                morePerson.add(names[i]);
            } else if (Pay[i] < avg) {
                LessPay.add(avg - Pay[i]);
                lessPerson.add(names[i]);
            }
        }
        int[][] pptr = new int[MorePay.size()][LessPay.size()];
        for (int i = 0; i < MorePay.size(); ++i) {
            for (int j = 0; j < LessPay.size(); ++j) {
                if (MorePay.get(i) >= LessPay.get(j)) {
                    MorePay.set(i, MorePay.get(i) - LessPay.get(j));
                    pptr[i][j] = LessPay.get(j);
                    LessPay.set(j, 0);
                } else {
                    LessPay.set(j, LessPay.get(j) - MorePay.get(i));
                    pptr[i][j] = MorePay.get(i);
                    MorePay.set(i, 0);
                }
            }
        }
        for (int i = 0; i < MorePay.size(); ++i) {
            for (int j = 0; j < LessPay.size(); ++j) {
                if (pptr[i][j] != 0)
                {
                    System.out.println(lessPerson.get(j) + " " + morePerson.get(i) + " " + pptr[i][j]);
                }
            }
        }
    }
}
