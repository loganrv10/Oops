import java.util.Scanner;

public class ApplyBasicMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextByte();
        int [] arr = new int[n];
        for(int i= 1; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int min = 0;
        int r = 0;
        int index = 0;
        for (int i =0; i < arr.length; i++){
            if (arr[i] % 7 ==0){
                r = arr[i];
                if (r < min){
                    index = i;
                    min = r;

                }
            }
        }


        }
    }

