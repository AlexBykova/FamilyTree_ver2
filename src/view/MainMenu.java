package view;

import view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(View view) {
        commandList = new ArrayList<>();
        commandList.add(new CreatePeople(view));
        commandList.add(new GetPeopleInfo(view));
        commandList.add(new GetPeopleListInfo(view));
//        commandList.add(new SetChildren(view));
        commandList.add(new SetParents(view));
        commandList.add(new SortByAge(view));
        commandList.add(new SortByName(view));
        commandList.add(new SortByGender(view));
        commandList.add(new Finish(view));

    }
    public String print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append ("Список команд: \n");
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(", ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }
    public void execute(int choice){
        Command command = commandList.get(choice-1);
        command.execute();
    }
    public int size(){
        return commandList.size();
    }
}
