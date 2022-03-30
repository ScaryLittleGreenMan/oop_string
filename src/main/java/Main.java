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
        int n = 200; //преобразование примитивов в строку
        c3 = String.valueOf(n);
        System.out.println(c3);

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(50);
        //cat.eat();
        plate.plateInfo();
        cat.eat(plate);
        //plate.setFood(plate.getFood() - cat.getAppetite());
        plate.plateInfo();

        // practice
        System.out.println("||    practice    ||");
        plate.printPlateInfo();

        Cat [] catsArray = new Cat[5];
        catsArray[0] = new Cat("Барсик");
        catsArray[1] = new Cat("Василий");
        catsArray[2] = new Cat("Мурка");
        catsArray[3] = new Cat("Ластик");
        catsArray[4] = new Cat("Шерхан");

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(plate);
            plate.plateInfo();

        }
    }
}
