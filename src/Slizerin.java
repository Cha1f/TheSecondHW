public class Slizerin extends Hogwarts {
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourceFulness; //находчивость
    private int lustForPower; //жажда власти

    public Slizerin(String name, int witchCraft, int teleport, int cunning, int determination, int ambition, int resourceFulness, int lustForPower) {
        super(name, witchCraft, teleport);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceFulness = resourceFulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourceFulness() {
        return resourceFulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    private int getCoursePower() {
        return cunning + determination + ambition + resourceFulness + lustForPower;
    }

    public void getEqualCoursePower(Slizerin other) {
        if (other.getCoursePower() < this.getCoursePower()) {
            System.out.println(this.getName() + " сильнее чем " + other.getName());
        } else if (other.getCoursePower() > this.getCoursePower()) {
            System.out.println(other.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println(other.getName() + " и " + this.getName() + " равны по силе");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Хитрость: " + cunning + ", Решительность: "
                + determination + ", Амбициозность: " + ambition
                + ", Находчивость: " + resourceFulness + ", Жажда власти: " + lustForPower;
    }
}
