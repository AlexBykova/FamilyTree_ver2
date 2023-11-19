package human;

import java.util.List;

public interface FamilyTreeItem {

    public float getId();
    void setNewChildren();
    public String getName();
    public Gender getGender();
    public int getAge();

    public List<Object> getChildren();

    public void setChildren(List<Object> list);

    void setParents(Object parent1, Object parent2);
}
