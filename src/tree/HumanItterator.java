package tree;

import human.FamilyTreeItem;
import human.Human;

import java.util.Iterator;
import java.util.List;

public class HumanItterator<E extends FamilyTreeItem> implements Iterator<E> {
    private  int index;
    private List<E> peopleList;

    public HumanItterator(List<E> peopleList) {
        this.peopleList = peopleList;
    }
    @Override
    public boolean hasNext() {return index < peopleList.size(); }

    @Override
    public E next() {return peopleList.get(index++);}
}
