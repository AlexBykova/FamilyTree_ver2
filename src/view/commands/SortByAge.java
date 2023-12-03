package view.commands;

import view.View;

public class SortByAge extends Command{
    public SortByAge(View view) {
        super("Сортировать список по возрасту", view);
    }
    public void execute(){
        getView().sortByAge();
    }
}
