//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину. 

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OpTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];
        int a = 0;
        System.out.println("Vnesi 5 chisel: ");

        for (int i = 0; i < 5; i++) {
            arr[i] = reader.readLine();
            a = a + arr[i].length();
            }

        System.out.println("Общ длина: " + a);

        for (int i = 0; i < 5; i++) {
            if (arr[i].length() > a / 5) {
                System.out.println("Больше средней длины: " + arr[i] + ", длина: " + arr[i].length());
            }
            else if (arr[i].length() < a / 5) {
                System.out.println("Меньше средней длины: " + arr[i] + ", длина: " + arr[i].length());
            }
        }

    }
}
