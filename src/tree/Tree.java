package tree;

import human.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tree <E extends FamilyTreeItem> implements Serializable, Iterable<E>{
    private List<E> peopleList;

    public Tree() {
        peopleList = new ArrayList<>();
    }

    public E getPeopleBySnils (Float snils) {
        for (E people: peopleList){
            if (people.getId() == snils){
                return people;
            }
        }
        return null;
    }

    public void addPeople(E people) {
        peopleList.add(people);
    }

    public String getPeopleListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append ("Список членов семьи: \n");
        for (E people: peopleList){
            stringBuilder.append(people);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

//    public void setNewChildren(E children, E parent1, E parent2) {
//        for (E human: peopleList){
//            if (human.getId() == parent1.getSnilsId()){
//                List<E> list = new ArrayList<>(parent1.getChildren());
//                list.add(children);
//                parent1.(list);
//            }
//            if (human.getId() == parent2.getId()){
//                List<E> list = new ArrayList<>(parent2.getChildren());
//                list.add(children);
//                parent2.setChildren(list);
//            }
//        }
//        children.setParents(parent1,parent2);
//    }

    @Override
    public Iterator<E> iterator() {
        return new HumanItterator<>(peopleList);
    }

    public void sortByName() {
        Collections.sort(peopleList, new HumanComparatorByName<>());
    }

    public void sortByAge() {
        Collections.sort(peopleList, new HumanComparatorByAge<>());
    }

    public void sortByGender() {
        Collections.sort(peopleList, new HumanComparatorByGender<>());
    }
}
