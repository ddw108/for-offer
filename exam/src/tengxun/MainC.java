package tengxun;

import java.util.Scanner;

/**
 * author:DingwenDeng
 * Date:2018/9/16 11:12
 */
public class MainC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            for (int i = 0; i < n;i++){
                boolean pos = false;
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                int C = scanner.nextInt();
                for (int j = 0; j <= A * B;j++){
                    for (int k = 0; k <= A * B;k++){
                        if(B * k + C == A * j){
                            pos = true;
                            System.out.println("YES");
                            break;
                        }
                    }
                    if (pos){
                        break;
                    }
                }
                if (!pos){
                    System.out.println("NO");
                }
            }
        }
        scanner.close();
    }
}