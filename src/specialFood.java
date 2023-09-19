public class specialFood extends tomFood{
    private int prodMultiplier;

    public specialFood(int prodMultiplier) {
        super();
        this.prodMultiplier = prodMultiplier;
    }

    public specialFood(String foodName, int energy, int amount, int prodMultiplier) {
        super(foodName, energy, amount);
        this.prodMultiplier = prodMultiplier;
    }

    public int getProdMultiplier() {
        return prodMultiplier;
    }

    public void setProdMultiplier(int prodMultiplier) {
        this.prodMultiplier = prodMultiplier;
    }
}
