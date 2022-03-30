public class Cat {
    private String name;
    private int satiety = 0;
    private int appetite = (int) (Math.random() * 30);

    public Cat(String name, int appetite) {
        this.name = name;
        this.satiety = 0;
        this.appetite = appetite;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.plateInfo()) {
            System.out.println(name + " поел");
            plate.decreaseFood(appetite);
            satiety = +appetite;
            System.out.println(satietyCat());
            catInfo();
        } else {
            System.out.println(name + " нужно еды " + appetite + " Пополните миску!");
            System.out.println(satietyCat());
        }
    }

    public void catInfo() {
        System.out.println(name + " сытость: " + satiety + " аппетит: " + appetite);
    }

    public boolean satietyCat() {
        if (satiety == appetite) {
            return true;
        } else {
            return false;
        }
    }
}
