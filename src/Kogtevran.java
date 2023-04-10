public class Kogtevran extends Hogwarts {
    private int mind; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int fullCreation; //творчество

    public Kogtevran(String name, int witchCraft, int teleport, int mind, int wisdom, int wit, int fullCreation) {
        super(name, witchCraft, teleport);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullCreation = fullCreation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullCreation() {
        return fullCreation;
    }

    private int getCoursePower() {
        return mind + wisdom + wit + fullCreation;
    }

    public void getEqualCoursePower(Kogtevran other) {
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
        return super.toString() + "\n" + "Ум: " + mind + ", Мудрость: " + wisdom + ", Остроумие: " + wit + ", Творчество: " + fullCreation;
    }
}