public class Puffendui extends Hogwarts {
    private int industry; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Puffendui(String name, int witchCraft, int teleport, int industry, int loyalty, int honesty) {
        super(name, witchCraft, teleport);
        this.industry = industry;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustry() {
        return industry;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    private int getCoursePower() {
        return industry + loyalty + honesty;
    }

    public void getEqualCoursePower(Puffendui other) {
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
        return super.toString() + "\n" + "Трудолюбие: " + industry + ", " + "Верность: " + loyalty + ", " + "Честность: " + honesty;
    }
}