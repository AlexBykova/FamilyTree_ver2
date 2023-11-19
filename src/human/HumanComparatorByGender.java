package human;

import java.util.Comparator;

public class HumanComparatorByGender<E extends FamilyTreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
