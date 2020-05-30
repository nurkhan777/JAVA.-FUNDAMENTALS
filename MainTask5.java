import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTask5 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 12: ");
        int a = Integer.parseInt(reader.readLine());

        if (a >= 1 && a <= 12) {
            if (a == 1) {
                System.out.println("Январь");}
            else if (a == 2) {
                System.out.println("Февраль");}
            else if (a == 3) {
                System.out.println("Март");}
            else if (a == 4) {
                System.out.println("Апрель");}
            else if (a == 5) {
                System.out.println("Май");}
            else if (a == 6) {
                System.out.println("Июнь");}
            else if (a == 7) {
                System.out.println("Июль");}
            else if (a == 8) {
                System.out.println("Август");}
            else if (a == 9) {
                System.out.println("Сентябрь");}
            else if (a == 10) {
                System.out.println("Октябрь");}
            else if (a == 11) {
                System.out.println("Ноябрь");}
            else if (a == 12) {
                System.out.println("Декабрь");}
        }
        else {
            System.out.println("Нету такого месяца");
        }

    }

}
