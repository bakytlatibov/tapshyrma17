public class Farm  {
    private String address;
    private Cow cows;
    private Horse horse;
    private Sheep sheep;
    private String ownnerName;

    public Farm(String address, Cow cows, Horse horse, Sheep sheep, String ownnerName) {

        this.address = address;
        this.cows = cows;
        this.horse = horse;
        this.sheep = sheep;
        this.ownnerName = ownnerName;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnnerName() {
        return ownnerName;
    }

    public void setOwnnerName(String ownnerName) {
        this.ownnerName = ownnerName;
    }

    public Cow getCows() {
        return cows;
    }

    public void setCows(Cow cows) {
        this.cows = cows;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + cows +
                ", horse=" + horse +
                ", sheep=" + sheep +
                ", ownnerName='" + ownnerName + '\'' +
                '}';
    }
}


