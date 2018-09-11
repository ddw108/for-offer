package unknown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/10 16:27
 */
public class MainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        for(int i = 0; i < arrayList.size(); i++){
            String str = arrayList.get(i);
            int pos = (str.length()+1)/2;
            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < pos - 1; j++){
                builder.append("    ");
            }
            String pre = builder.toString();
            System.out.println(pre + str);
        }
    }
}
