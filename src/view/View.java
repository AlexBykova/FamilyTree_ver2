package view;

import model.human.Gender;
import model.human.Human;

import java.time.LocalDate;
import java.util.List;

public interface View {
    void start();

    void answer(String answer);


    void createPeople();

    String getPeopleInfo();

    void getPeopleListInfo();

//    void setChildren(List<Human> children, Human familyMember);

    void setParents();

    void sortByAge();

    void sortByName();

    void sortByGender();
    void finish();
}