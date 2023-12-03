package view.commands;

import view.View;

public class GetPeopleListInfo extends Command{
    public GetPeopleListInfo(View view) {
        super("Вывести информацию о всех членах семьи", view);
    }
    public void execute(){
        getView().getPeopleListInfo();
    }
}
