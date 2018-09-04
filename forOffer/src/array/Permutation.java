package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Permutation {

    private void swap(char[] str, int i, int j){
        if(i != j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }

    //关键！！！
    private void PermutationHelper(HashSet<String> set, char[] str, int k){
        if(k == str.length){
            set.add(new String(str));
            return;
        }
        for(int i = 0; i < str.length; i++){
            swap(str, i, k);
            //两次调转位置可以恢复原来的情况，调转位置可以达到遍历的效果！！！
            PermutationHelper(set, str, k+1);
            swap(str, i, k);
        }
    }

    public ArrayList<String> Permutation(String str){
        ArrayList<String> result = new ArrayList<>();
        if(str == null || str.length() == 0)
            return result;
        HashSet<String> set = new HashSet<>();
        PermutationHelper(set, str.toCharArray(), 0);
        result.addAll(set);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        permutation.Permutation("ABC");
    }
}
