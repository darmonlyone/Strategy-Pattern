public class HeroGame {
    private String name;
    private int level;

    public HeroGame(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp(){
        this.level++;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.level;
    }
}
