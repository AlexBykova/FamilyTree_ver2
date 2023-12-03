package model.human;

import java.util.List;

public interface FamilyTreeItem<E> {

    public float getId();
    public String getName();
    public Gender getGender();
    public int getAge();
    List<E> getChildren();

    public void setChildren(List<E> children);

    void setParents(E parent1, E parent2);
}
