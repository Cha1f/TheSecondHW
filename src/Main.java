public class Main {
    public static void main(String[] args) {

        Griffindor HP = new Griffindor("Harry Potter", 10, 20, 30, 40, 50);
        Griffindor GG = new Griffindor("Germiona Greynjer", 92, 18, 60, 39, 60);

        Puffendui ZS = new Puffendui("Zahariya Smitt", 56, 1, 6, 38, 9);

        System.out.println(HP);
        System.out.println();
        Hogwarts[] hogwartsStudents = {HP, null, null, GG, ZS};
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