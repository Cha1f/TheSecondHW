public abstract class Hogwarts {
    private final String name;
    private final int witchCraft; //сила магии
    private final int teleport; //расстояние трансгресии

    public Hogwarts(String name, int witchCraft, int teleport) {
        this.name = name;
        this.witchCraft = witchCraft;
        this.teleport = teleport;
    }

    public String getName() {
        return name;
    }

    public int getWitchCraft() {
        return witchCraft;
    }

    public int getTeleport() {
        return teleport;
    }

    private int getTotalMagicPower() {
        return witchCraft + teleport;
    }

    public void equalStudentsHogwarts(Hogwarts other) {
        if (other.getTotalMagicPower() < this.getTotalMagicPower()) {
            System.out.println(this.getName() + " сильнее чем " + other.getName());
        } else if (other.getTotalMagicPower() > this.getTotalMagicPower()) {
            System.out.println(other.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println(other.getName() + " и " + this.getName() + " равны по силе");
        }
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" + "Сила магии: " + witchCraft + ", Расстояние трансгресии: " + teleport;
    }

}
