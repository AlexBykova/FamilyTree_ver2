package view.commands;

import view.View;

public class SortByGender extends Command{
    public SortByGender(View view) {
        super("Сортировать список по полу", view);
    }
    public void execute(){
        getView().sortByGender();
    }
}
