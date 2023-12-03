package model.service;

import model.builder.FamilyMemberBuilder;
import model.human.Gender;
import model.human.Human;
import model.human.comporators.HumanComparatorByAge;
import model.human.comporators.HumanComparatorByGender;
import model.human.comporators.HumanComparatorByName;
import model.tree.Tree;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Service {
    private Tree<Human> familyTree;
//    private FamilyMemberBuilder build;
    private Human familyMember;

    public Service() {
        familyTree = new Tree<>();
//        build = new FamilyMemberBuilder();
    }

    public Human createPeople(float snils, String name, Gender gender, LocalDate birthday, LocalDate deathday){
        Human human = new Human(snils, name, gender, birthday, deathday);
        return human;
    }
    public String getPeopleInfo(Human human){
        return human.getInfo();
    }

    public void addPeople(Human member){
        familyTree.addPeople(member);
    }

    public String getPeopleListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список членов семьи: \n");
        for (Human people : familyTree) {
            stringBuilder.append(people);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

   public void setChildren(List<Human> children, Human familyMember) {
        familyMember.setChildren(children);
    }

    public void setParents(Human parent1, Human parent2, Human familyMember){
        familyMember.setParents(parent1, parent2);
    }
    public void sortByName() {
        familyTree.sortByName();
    }

    public void sortByAge() {
        familyTree.sortByAge();
    }

    public void sortByGender() {
        familyTree.sortByGender();
    }

    @Override
    public String toString(){
        return getPeopleListInfo();
    }

    public LocalDate getDate(String date) {
        LocalDate ld = LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy") );
        return ld;
    }

    public Human getPeopleBySnils(Float snils){
        return familyTree.getPeopleBySnils(snils);
    }

}
