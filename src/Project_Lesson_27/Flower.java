package Project_Lesson_27;

public class Flower extends Plant {
    private static final int FLOWER_GROW_PER_SEASON = 2;


    public Flower(String name, double height, int age) {
        super(name, height, age);
    }

    @Override
    public double getGrowPerSeason() {
        return FLOWER_GROW_PER_SEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getName() + " blooming in the summer - " + getHeight());

    }

    @Override
    public void doAutumn() {
        setHeight(getHeight() - 1);
        System.out.println(getName() + " is cut in autumn - " + getHeight());

    }


}
