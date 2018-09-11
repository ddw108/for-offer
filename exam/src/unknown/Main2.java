package unknown;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/10 16:41
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
//        while (scanner.hasNext()){
//            int i = scanner.nextInt();
//            arrayList.add(i);
//        }
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(18);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int begin = 0;
        int length = 1;
        int maxBegin = 0;
        int maxLength = 1;
        for(int i = 0; i < arrayList.size(); i++){
            if(priorityQueue.size() == 0){
                priorityQueue.add(arrayList.get(i));
                begin = i;
                length = 1;
            } else if(priorityQueue.peek() + priorityQueue.size() == arrayList.get(i)){
                priorityQueue.add(arrayList.get(i));
                length++;
            }else{
                priorityQueue.clear();
                priorityQueue.add(arrayList.get(i));
                begin = i;
                length = 1;
            }
            if(length > maxLength){
                maxBegin = begin;
                maxLength = length;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arrayList.get(maxBegin));
        res.add(maxLength);
        System.out.println(res);
    }
}
