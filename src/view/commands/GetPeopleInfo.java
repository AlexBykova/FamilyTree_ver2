package view.commands;

import model.human.Human;
import view.View;

public class GetPeopleInfo extends Command{
    public GetPeopleInfo(View view) {
        super("Вывести информацию о человеке", view);
    }
    public void execute(){
        getView().getPeopleInfo();
    }
}
