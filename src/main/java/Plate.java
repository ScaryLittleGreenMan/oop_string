public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int plateInfo() {
        System.out.println("Plate: " + food);
        return food;
    }

    public void decreaseFood(int appetite) {
        if(food-appetite<=0){
            System.out.println("В миске слишком мало еды!!! Котику не хватит!");
        }
        food -= appetite;
    }

    public void printPlateInfo() {
        System.out.println("Количество еды в миске " + food);
    }
}
