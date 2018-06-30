package vuondiadang;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Human() {

    }

    public Human(String name) {
        this.name = name;
        System.out.println(name + " được sinh ra.");
    }

    public void eat() {
        System.out.println("Eva ăn một miếng táo, Adam ăn một miếng táo, cho đến khi hết.");
    }
    public void sleep() {
        System.out.println("Eva đi ngủ, Adam đi ngủ. zzzZZZZZ");
    }
}
