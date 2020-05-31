/* Ввести n чисел с консоли. 
Найти самое короткое и самое длинное число. Вывести найденные числа и их длину. */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OpTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1-e chislo: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("2-e chislo: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("3-e chislo: ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("4-e chislo: ");
        int d = Integer.parseInt(reader.readLine());
        System.out.println("5-e chislo: ");
        int e = Integer.parseInt(reader.readLine());

        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);
        int max3 = Math.max(max1, max2);
        int max4 = Math.max(max3, e);

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int min3 = Math.min(min1, min2);
        int min4 = Math.min(min3, e);


        System.out.println("Max: " + max4);
        String z = String.valueOf(max4);
        System.out.println("Max length: " + z.length());

        System.out.println("Min: " + min4);
        String x = String.valueOf(min4);
        System.out.println("Min length: " + x.length());

    }
}
