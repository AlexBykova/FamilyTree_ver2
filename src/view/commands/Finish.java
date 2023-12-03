package view.commands;

import view.View;

public class Finish extends Command{
    public Finish(View view) {
        super("Завершить работу программы", view);
    }

    public void execute(){getView().finish();}
}
