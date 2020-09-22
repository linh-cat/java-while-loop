public class App {
    public static void main(String[] args) throws Exception {
        int someValue = 4;
        int factorial = 1;
        while (someValue > 1) {
            System.out.println("some: " + someValue);
            System.out.println("fac: " + factorial);
            factorial *= someValue;
            System.out.println("fac next: " + factorial);
            someValue--;
            System.out.println("-------");

        }
        System.out.println("Final: " + factorial);
    }
}
