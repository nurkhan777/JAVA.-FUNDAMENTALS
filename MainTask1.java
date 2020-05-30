/* import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTask1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите ваше имя: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.print("Hello " + name);

    }
}
*/

import java.util.Arrays;

public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("Hello " + Arrays.toString(args));
    }
}