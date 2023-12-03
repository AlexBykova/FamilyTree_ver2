package model.human;

import model.builder.FamilyMemberBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.List;

public class Human implements Serializable, FamilyTreeItem<Human> {

    private float snils; // Здесь были заглавные т.к. это аббревиатура. И она была написана так чисто на автомате
    private String name;
    private Gender gender;
    private LocalDate birthday;
    private LocalDate deathday;
    private Human parent1;
    private Human parent2;
    private List<Human> children;



    public Human(float snils, String name, Gender gender, LocalDate birthday, LocalDate deathday) {
        this.snils = snils;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.deathday = deathday;
    }


    @Override
    public void setParents(Human parent1, Human parent2) {
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    @Override
    public void setChildren(List<Human> children) {
        this.children = Collections.singletonList((Human) children);
    }

    @Override
    public float getId() {
        return getSnils();
    }

    public float getSnils(){
        return snils;
    }


    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getDeathday() {
        return deathday;
    }

    @Override
    public int getAge() {
        LocalDate deathday =  this.deathday;
        LocalDate birthday = this.birthday;
        LocalDate now = LocalDate.now();
        if (deathday == null) {
            return Period.between(birthday, now).getYears();
        }
        else {
            return Period.between(birthday, deathday).getYears();
        }
    }

    public Human getParent1(){
        return parent1;
    }
    public Human getParent2(){
        return parent2;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", СНИЛС: " + snils;
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append ("Имя: " + name + "\n");
        stringBuilder.append ("Пол: " + gender + "\n");
        if (deathday != null) {
            stringBuilder.append ("Дата рождения: " + birthday + ". Дата смерти: " + deathday +"\n");
        }
        else{
            stringBuilder.append ("Дата рождения: " + birthday + "\n");
        }
        stringBuilder.append ("Родители: " + parent1 + " и " + parent2 + "\n");
        if (children != null) {
            stringBuilder.append ("Дети: " + children + "\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Human)){
            return false;
        }
        Human human = (Human) obj;
        return human.getSnils() == getSnils();
    }


}