package toutiao;

import java.util.Scanner;
import java.util.ArrayList;;
/**
 * author:DingwenDeng
 * Date:2018/9/9 10:54
 */
public class MainC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        scanner.close();
        ArrayList<String> result = new ArrayList<String>();
        getResult(ip,new String(),result,4,0,ip.length());
        System.out.println(result.size());
    }

    public static void getResult(String s , String temp , ArrayList<String> result , int count , int index , int len){
        if(count == 0 && index == len){
            result.add(temp);
            return ;
        }
        if((count == 0 && index < len) || (count > 0  && index == len)){
            return ;
        }
        int value = 0;
        boolean pos = true;
        while(index < len && pos){
            if(value == 0 && s.charAt(index) == '0'){
                pos = false;
            }
            value = value * 10 + s.charAt(index) - '0';
            index++;
            if(value < 256){
                String record = "";
                if(count == 1){
                    record = temp + Integer.toString(value);
                }else{
                    record = temp + Integer.toString(value) + '.';
                }
                getResult(s , record , result , count - 1 , index , len);
            }
        }
    }
}
