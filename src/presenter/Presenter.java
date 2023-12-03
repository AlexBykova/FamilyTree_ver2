package presenter;

import model.human.Gender;
import model.human.Human;
import model.service.Service;
import view.View;

import java.time.LocalDate;
import java.util.List;

public class Presenter {
    private View view;
    public static Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void createPeople(float snils, String name, Gender gender, LocalDate birthday, LocalDate deathday){
        Human human = service.createPeople(snils, name, gender, birthday, deathday);
        service.addPeople(human);
    }

    public String getPeopleInfo(Human human){

        return service.getPeopleInfo(human);
    }

    public void getPeopleListInfo() {
        String answer = service.getPeopleListInfo();
        view.answer(answer);
    }
    public void setChildren(List<Human> children, Human familyMember){
        service.setChildren(children, familyMember);
    }

    public void setParents(Human parent1, Human parent2, Human familyMember){
        service.setParents(parent1, parent2, familyMember);
    }
    public void sortByName() {
        service.sortByName();
    }

    public void sortByAge() {
        service.sortByAge();
    }

    public void sortByGender() {
        service.sortByGender();
    }

    public LocalDate getDate(String date){
        return service.getDate(date);
    }

    public Human getPeopleBySnils(Float snils){
        return service.getPeopleBySnils(snils);
    }

}
