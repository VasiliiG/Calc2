package ru.home.animals;

public class Hamster {
    private int age;
    private String name;
    private int weight;

    public Hamster(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public Hamster(int age) {
        this.age = age;
    }

    public Hamster(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Hamster(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
