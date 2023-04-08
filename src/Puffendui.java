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
}