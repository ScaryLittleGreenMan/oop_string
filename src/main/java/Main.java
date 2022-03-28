public class Main {
    public static void main(String[] args) {
        String a1 = "hello ";
        String a2 = "world";
        String a3 = a1 + a2;
        System.out.println(a3);
        String b1 = "Число 10: ";
        int b2 = 10;
        String b3 = b1 + b2;
        System.out.println(b3);
        String c1 = "String";
        String c2 = "[" + c1 + "] = " + 1;
        System.out.println(c2);
        String c3 = "Десять = " + (5 + 5);
        System.out.println(c3);
        int n=200; //преобразование примитивов в строку
        c3=String.valueOf(n);
        System.out.println(c3);


    }
}
