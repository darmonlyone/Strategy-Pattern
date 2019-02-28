
public class HeroGameComparator implements Comparator {

    /**
     * @return If level are lower return -1
     * higher return 1 but if equal
     * they will compare with value
     * string of name
     */
    @Override
    public int compare(HeroGame o1, HeroGame o2) {
        return o1.getLevel() < o2.getLevel()? -1 : o1.getLevel() > o2.getLevel()? 1:o1.getName().compareTo(o2.getName());
    }

}
