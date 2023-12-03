package view.commands;

import view.View;

public class SortByName extends Command{
    public SortByName(View view) {
        super("Сортировать список по имени", view);
    }
    public void execute(){
        getView().sortByName();
    }
}
