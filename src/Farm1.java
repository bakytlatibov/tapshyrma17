public class Farm1 {
    private Sheep sheep;
    private Cow cow;
    private Horse horse;

    public Farm1(Sheep sheep1, Sheep sheep2, Sheep sheep3, Cow cow1,Cow cow2,Cow cow3,Cow cow4,Cow cow5, Horse horse1,Horse horse2) {
        this.sheep = sheep1;
        this.sheep = sheep2;
        this.sheep = sheep3;

//        this.cow=cow1;
//        this.cow = cow2;
//        this.cow = cow3;
//        this.cow = cow4;
        this.cow = cow5;
        this.horse = horse1;
        this.horse = horse2;


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
        return "Farm1{" +
                "sheep=" + sheep +'\''+
                "sheep=" + sheep +'\n'+
                "sheep=" + sheep +'\n'+
                ", cow=" + cow +'\n'+
                ", cow=" + cow +'\n'+
                ", cow=" + cow +'\n'+
                ", cow=" + cow +'\n'+
                ", cow=" + cow +'\n'+
                ", horse=" + horse +'\n'+
                ", horse=" + horse +
                '}';
    }
}

