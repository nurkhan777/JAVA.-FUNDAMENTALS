public class MainTask4 {
    public static void main(String[] args) {
        int a = 0;
        for(int i = args.length - 1; i >= 0; i--)
            a = a + Integer.parseInt(args[i]);
        System.out.println("summa: " + a);
    }
}
