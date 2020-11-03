package ru.home.animals;

public class Cat {

    private int age;
    private String name;
    private boolean orintaciy;

    private static int count;

    public Cat() {
        this(1, "no-name");
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        count++;
    }

    public Cat(String name){
        this.name = name;
        age = 1;
        count++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public boolean fight(Cat cat) {

        int a = 10;
        if (a == age) {
            a++;
            int b = 60;
            for (int i = 0; i < 5; i++) {
                b++;
            }
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Aaaaaaaa! ");
    }
}
