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

    public void plateInfo() {
        System.out.println("Plate: " + food);
    }

    public void decreaseFood(int n) {
        food -= n;
    }
}
