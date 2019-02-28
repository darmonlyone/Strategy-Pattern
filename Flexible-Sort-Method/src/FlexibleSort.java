public class FlexibleSort {
    public static void main(String[] args) {
        HeroGame[] heroGames = {
                new HeroGame("Darm",100),
                new HeroGame("Fluk",2),
                new HeroGame("Park",2),
                new HeroGame("Wan",50),
                new HeroGame("Beau",10),
                new HeroGame("Bee",10)};
        sort(heroGames, new HeroGameComparator());
        for (HeroGame hero: heroGames) {
            System.out.println(hero);
        }
    }

    public static void sort(HeroGame[] a, Comparator cmp) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (cmp.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
            HeroGame temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

}
