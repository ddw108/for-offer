package wangyi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/8 15:51
 */
public class MainA {

    private static int valueMax = 3001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> voter = new ArrayList<>();
        ArrayList<Integer> cost = new ArrayList<>();
        int[] currentVote = new int[m];
        for(int i = 0; i < n; i++){
            int v = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            voter.add(v);
            cost.add(c);
            currentVote[v]++;
        }
        int curMax = getMaxIndex(currentVote, m);
        int costTotal = 0;
        while (curMax != 0){
            int index = getMinIndex(voter, cost);
            //int now = voter.get(index);
            currentVote[voter.get(index)]--;
            currentVote[0]++;
            costTotal += cost.get(index);
            curMax = getMaxIndex(currentVote, m);
            voter.set(index, 0);
            cost.set(index, valueMax);
        }
        System.out.println(costTotal);
    }

    private static int getMaxIndex(int[] currentVote, int m){
        int curMax = 0;
        for(int i = 0; i < m; i++){
            if(currentVote[i] >= currentVote[curMax])
                curMax = i;
        }
        return curMax;
    }

    private static int getMinIndex(ArrayList<Integer> vote, ArrayList<Integer> cost){
        int temp = cost.get(0);
        int result = 0;
        for(int i = 0; i <cost.size(); i++){
            if(vote.get(i) != 0){
                if(temp > cost.get(i)){
                    result = i;
                    temp = cost.get(i);
                }
            }
        }
        return result;
    }
}
