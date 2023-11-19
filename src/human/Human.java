package human;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.List;

public class Human implements Serializable, FamilyTreeItem {

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
    public void setParents(Object parent1, Object parent2) {
        this.parent1 = (Human) parent1;
        this.parent2 = (Human) parent2;
    }


    public void setChildren(List<Object> children) {
        this.children = List.of((List<Human>) children);
    }
    @Override
    public float getId() {
        return getSnils();
    }

    public float getSnils(){
        return snils;
    }


    public List<Object> getChildren() {
        return Collections.singletonList((List<Human>) children);
    }

    @Override
    public void setNewChildren() {

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