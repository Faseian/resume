public class player {
    private String username;
    private String password;
    private int money;
    private tomagotchi[] tomagotchis;
    private tomFood[] tomFoods;

    public player() {
        username = "";
        password = "";
        money = 0;
        tomagotchis = new tomagotchi[10];
        tomFoods = new tomFood[10];
    }

    public player(String username, String password, int money, tomagotchi[] tomagotchis, tomFood[] tomFoods) {
        this.username = username;
        this.password = password;
        this.money = money;
        this.tomagotchis = tomagotchis;
        this.tomFoods = tomFoods;
    }
    public void setMoney(int money) {this.money = money;}
    public void setTomagotchis(tomagotchi[] tomagotchis) {this.tomagotchis = tomagotchis;}
    public void setTomFoods(tomFood tomFoods, int i) {this.tomFoods[i] = tomFoods;}
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}

    public int getMoney() {return money;}
    public tomagotchi[] getTomagotchis() {return tomagotchis;}
    public tomFood getTomFood(int i) {return tomFoods[i];}
    public tomFood[] getTomFoods() {return tomFoods;}
    public String getUsername() {return this.username;}
    public String getPassword() {return this.password;}

}
