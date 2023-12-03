package view.commands;

import view.View;

public class Load extends Command{
    public Load(View view) {
        super("Загрузить семейное древо из файла", view);
    }
    public void execute(){
        getView().load();
    }
}
