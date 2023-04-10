public class Griffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Griffindor(String name, int witchCraft, int teleport, int nobility, int honor, int bravery) {
        super(name, witchCraft, teleport);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int getCoursePower() {
        return nobility + honor + bravery;
    }

    public void getEqualCoursePower(Griffindor other) {
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
        return super.toString() + "\n" + "Благородство: " + nobility + ", Честь: " + honor + ", Храбрость: " + bravery;
    }
}
