package view.commands;

import view.View;

public class SetChildren extends Command{
    public SetChildren(View view) {
        super("Добавить ребенка ", view);
    }
    public void execute(){
        getView().setChildren();
    }
}
