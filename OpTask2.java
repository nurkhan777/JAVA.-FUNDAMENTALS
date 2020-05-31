/* Ввести n чисел с консоли. 
Вывести числа в порядке возрастания (убывания) значений их длины. */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OpTask2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];
        System.out.println("Vnesi 5 chisel: ");

        for (int i = 0; i < 5; i++) {
            arr[i] = reader.readLine();
        }
        //System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++){
                if( arr[j].length() > arr[j+1].length() ){
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("from MIN to MAX: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("from MAX to MIN: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]+ ", ");
        }
    }
}
