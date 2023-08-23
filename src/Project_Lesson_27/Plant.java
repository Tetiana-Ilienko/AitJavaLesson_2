package Project_Lesson_27;

public abstract class Plant {

    private String name;
    private  double height;
    private  int age;

    public Plant(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    private int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public abstract double getGrowPerSeason(); //в дочерних классах будет возвращать рост за сезон
    public void addYearToAge(){
        this.age ++;
    }
    public void doSpring(){
        addYearToAge();
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() + " has grown in spring " + getHeight() );


    }

    public abstract void doSummer();
    public abstract void doAutumn();


    public  void doWinter(){
        System.out.println( getName() + " is not growing in Winter");
    }

    public void grow(){
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
    }
//    public String toString(){
//        return
//    }





}
