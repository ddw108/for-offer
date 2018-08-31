package array;

public class DuijiaoPrint {

    public void print(int a[][], int n){
        int row = 0;
        int col = 0;
        for(int i = n - 1; i >= 0; i--){
            row = 0;
            col = i;
            while(row >= 0 && row < n && col >= 0 && col < n){
                System.out.println(a[row][col]);
                row++;
                col++;
            }
        }
        for(int i = 0; i < n; i++){
            row = i;
            col = 0;
            while(row >= 0 && row < n && col >= 0 && col < n){
                System.out.println(a[row][col]);
                row++;
                col++;
            }
        }
    }
}
