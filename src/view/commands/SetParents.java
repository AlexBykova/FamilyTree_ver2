package view.commands;

import view.View;

public class SetParents extends Command{
    public SetParents(View view) {
        super("Добавить родителя", view);
    }
    public void execute(){
        getView().setParents();
    }
}
