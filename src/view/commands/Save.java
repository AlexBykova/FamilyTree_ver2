package view.commands;

import view.View;

public class Save extends Command{
    public Save(View view) {
        super("Сохранить семейное древо в файл", view);
    }
    public void execute(){
        getView().save();
    }
}