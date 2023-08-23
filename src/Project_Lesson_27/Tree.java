package Project_Lesson_27;

public class Tree extends Plant {

    private static final int TREE_GROW_PER_SEASON = 5;

    public Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public double getGrowPerSeason() {
        return TREE_GROW_PER_SEASON;
    }

    public void doSummer() {

        System.out.println(getName() + " is  growing in Summer " + getHeight());

    }

    @Override
    public void doAutumn() {
        System.out.println(getName() + " is not growing in Autumn");

    }


}
