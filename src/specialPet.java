public class specialPet extends  tomagotchi{
    private int foodProdRate;
    public specialPet() {
        super();
        int foodProdRate;
    }

    public specialPet(String tomaName, int hunger, int age, int happiness, boolean isAlive, int foodProdRate) {
        super(tomaName, hunger, age, happiness, isAlive);
        this.foodProdRate = foodProdRate;
    }

    public int getFoodProdRate() {
        return foodProdRate;
    }

    public void setFoodProdRate(int prodRate) {
        this.foodProdRate = prodRate;
    }
}
