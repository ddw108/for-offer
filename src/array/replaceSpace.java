package array;

public class replaceSpace {

    public String replaceSpace(StringBuffer str){
        int count = 0;
        int length = str.length();
        for(int i = 0; i < length; i++){
            if(str.charAt(i) == ' ')
                count++;
        }
        str.setLength(length + 2*count);
        for(int i = length - 1; i >= 0; i--){
            if(str.charAt(i) != ' '){
                str.setCharAt(i + 2*count, str.charAt(i));
            }else{
                count--;
                str.setCharAt(i + 2*count, '%');
                str.setCharAt(i+2*count+1, '2');
                str.setCharAt(i+2*count+2, '0');
            }
        }
        return str.toString();
    }
}
