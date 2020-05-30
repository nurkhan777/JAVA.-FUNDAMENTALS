import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число: ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Введите четвертое число: ");
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Введите пятое число: ");
        int e = Integer.parseInt(reader.readLine());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}
