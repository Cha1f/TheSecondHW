public class Main {
    public static void main(String[] args) {


        Griffindor HP = new Griffindor("Harry Potter", 10, 20, 30, 40, 50);
        Griffindor GG = new Griffindor("Germiona Greynjer", 92, 18, 60, 39, 60);
        Griffindor RW = new Griffindor("Ron Wisly", 3, 1, 4, 5, 6);
        Puffendui SD = new Puffendui("Sadrik Digory", 3, 56, 7, 8, 9);
        Puffendui ZS = new Puffendui("Zahariya Smitt", 56, 1, 6, 38, 9);
        Puffendui JFF = new Puffendui("Jastin Finn-Flatcher", 6, 7, 7, 1, 69);
        Kogtevran JCH = new Kogtevran("Jou Chang", 1, 6, 8, 99, 3, 9);
        Kogtevran PP = new Kogtevran("Padma Patil", 1, 6, 8, 99, 3, 9);
        Kogtevran MB = new Kogtevran("Markus Belbi", 6, 4, 97, 54, 65, 6);
        Slizerin DM = new Slizerin("Drako Malfoy", 30, 35, 6, 7, 49, 39, 32);
        Slizerin GM = new Slizerin("Grakham Montegu", 6, 5, 7, 65, 38, 34, 40);
        Slizerin GregG = new Slizerin("Gregory Goil", 8, 3, 8, 86, 65, 69, 3);



        System.out.println(HP + "\n" + GG + "\n" + RW + "\n" + SD + "\n"
                + ZS + "\n" + JFF + "\n" + JCH + "\n"
                + PP + "\n" + MB + "\n"
                + DM + "\n" + GM + "\n" + GregG);
        System.out.println();
        Hogwarts[] hogwartsStudents = {HP, null, null, GG, RW, SD, null, ZS, JFF, null, JCH, PP, MB, DM, GM, GregG};
        for (int i = 0; i < hogwartsStudents.length; i++) {
            for (int j = i + 1; j < hogwartsStudents.length; j++) {
                Hogwarts first = hogwartsStudents[i];
                Hogwarts second = hogwartsStudents[j];
                if (first == null || second == null) {
                    continue;
                }
                first.equalStudentsHogwarts(second);
            }
        }
    }
}