public class tomagotchi {
    private String tomaName;
    private int hunger;
    private int age;
    private int happiness;
    private boolean isAlive;

    public tomagotchi(){
        tomaName = "";
        hunger = 0;
        age = 0;
        happiness = 0;
        isAlive = true;
    }
    public tomagotchi(String tomaName, int hunger, int age, int happiness, boolean isAlive) {
        this.tomaName = tomaName;
        this.hunger = hunger;
        this.age = age;
        this.happiness = happiness;
        this.isAlive = isAlive;
    }

    public void setTomaName(String tomaName) {this.tomaName = tomaName;}
    public void setHunger(int hunger) {this.hunger = hunger;}
    public void setAge(int age) {this.age = age;}
    public void setHappiness(int happiness) {this.happiness = happiness;}
    public void setAlive(boolean alive) {this.isAlive = alive;}

    public String getTomaName() {return this.tomaName;}
    public int getHunger() {return this.hunger;}
    public int getAge() {return this.age;}
    public int getHappiness() {return this.happiness;}
    public boolean getIsAlive() {return this.isAlive;}
}
