package tree;

public class VerifySquenceOfBST {

    public boolean VerifySquenceOfBST(int [] sequence){
        if(sequence.length <= 0)
            return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] sequence, int begin, int end){
        if(begin >= end)
            return true;
        int n = begin;
        while (n < end){
            if(sequence[n] > sequence[end])
                break;
            else
                n++;
        }
        for(int i = n; i < end; i++){
            if(sequence[i] < sequence[end])
                return false;
        }
        return judge(sequence, begin, n-1) && judge(sequence, n, end-1);
    }
}
