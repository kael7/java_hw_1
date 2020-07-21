package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создать пустой проект в IntelliJ IDEA и прописать метод main()");

        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5f;
        double d = 6;
        char c = 'a';
        boolean bo = true;

        System.out.println(calculate(2,4,6,3));
        System.out.println(task10and20(5,6));
        isPositiveOrNegative(1);
        System.out.println(isNegative(-2));
        greetings("Елжан");
        isLeapYear(2020);
    }

    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        return sum>=10 && sum<=20;
    }

    public static void isPositiveOrNegative(int x) {
        if(x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        return x < 0;
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void isLeapYear(int a) {
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.println("Високосный год");
        }else {
            System.out.println("Невисокосный год");
        }
    }
}
