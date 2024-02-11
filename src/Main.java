public class Main {
    public static void main(String[] args) {

        double a = 30;
        double b = 20;
        System.out.println("Сравнение двух чисел:");
        
        if (a > b) {
            System.out.println("a>b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
        if (a == b) {
            System.out.println("a=b");
        }

        double addition = (a + b);
        {
            System.out.println("при сложении a и b получается: " + addition);
        }
        double subtraction = (a - b);
        {
            System.out.println("при вычитании a и b получается: " + subtraction);
        }
        double multiplication = (a * b);
        {
            System.out.println("при умножении a и b получается: " + multiplication);
        }
        double division = (a / b);
        {
            System.out.println("при делении a и b получается: " + division);
        }

        boolean String;
        if (a == b) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
