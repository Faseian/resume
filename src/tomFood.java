public class tomFood {
    private String foodName;
    private int energy;
    private int amount;
    public tomFood(){
        foodName = "";
        energy = 0;
        amount = 0;
    }
    public tomFood(String foodName, int energy, int amount) {
        this.foodName = foodName;
        this.energy = energy;
        this.amount = amount;
    }

    public void setFoodName(String foodName) {this.foodName = foodName;}
    public void setEnergy(int energy) {this.energy = energy;}

    public void setAmount(int amount) {this.amount = amount;}

    public String getFoodName() {return this.foodName;}
    public int getEnergy() {return this.energy;}

    public int getAmount() {return amount;}
}
