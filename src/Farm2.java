public class Farm2 {
    private Sheep sheep;
    private Cow cow;
    private Horse horse;

    public Farm2(Sheep sheep, Cow cow, Horse horse) {
        this.sheep = sheep;
        this.cow = cow;
        this.horse = horse;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Farm2{" +
                "sheep=" + sheep +
                ", cow=" + cow +
                ", horse=" + horse +
                '}';
    }
}
