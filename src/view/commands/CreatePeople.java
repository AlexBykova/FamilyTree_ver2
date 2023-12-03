package view.commands;

import view.View;

public class CreatePeople extends Command{
    public CreatePeople(View view) {
        super("Добавить члена семьи", view);
    }
    public void execute(){
        getView().createPeople();
    }
}
