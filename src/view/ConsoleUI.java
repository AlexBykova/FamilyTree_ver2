package view;


import model.human.Gender;
import model.human.Human;
import model.tree.Tree;
import presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu mainMenu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        mainMenu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Приветствую!");
        while(work){
            printMenu();
            scanMenu();
        }
    }

    private void printMenu(){
        System.out.println(mainMenu.print());
    }

    private void scanMenu() {
        String choiceStr = scanner.nextLine();
        int choise = Integer.parseInt(choiceStr);
        mainMenu.execute(choise);
    }

    private void error() {
        System.out.println("Вы ввели несуществующую команду");
    }

    public void finish() {
        System.out.println("До новых встреч");
        work = false;
    }

    public void createPeople() {
        System.out.println("Укажите снилс человека: ");
        String snilsStr = scanner.nextLine();
        float snils = Float.parseFloat(snilsStr);

        System.out.println("Укажите имя и фамилию: ");
        String name = scanner.nextLine();

        System.out.println("Укажите пол (Male/Female): ");
        String genderStr = scanner.nextLine();
        Gender gender = Gender.parseGender(genderStr);

        System.out.println("Укажите дату рождения: ");
        String birthdayStr = scanner.nextLine();
        LocalDate birthday = presenter.getDate(birthdayStr);


        System.out.println("Укажите дату смерти, при ее отсутствии (человек жив) введите null: ");
        String deathStr = scanner.nextLine();
        LocalDate deathday;
        if (deathStr != null) {
            deathday = presenter.getDate(deathStr);
        } else deathday = null;

        presenter.createPeople(snils, name, gender, birthday, deathday);
    }
    @Override
    public String getPeopleInfo(){
        System.out.println("Укажите снилс человека: ");
        String snilsStr = scanner.nextLine();
        float snils = Float.parseFloat(snilsStr);
        Human human = presenter.getPeopleBySnils(snils);
        return presenter.getPeopleInfo(human);
    }


    public void getPeopleListInfo() {
        presenter.getPeopleListInfo();
    }
    @Override
    public void setChildren(){
        System.out.println("Укажите снилс первого родителя: ");
        String snilsp1Str = scanner.nextLine();
        float snilsp1 = Float.parseFloat(snilsp1Str);
        Human parent1 = presenter.getPeopleBySnils(snilsp1);

        System.out.println("Укажите снилс второго родителя: ");
        String snilsp2Str = scanner.nextLine();
        float snilsp2 = Float.parseFloat(snilsp2Str);
        Human parent2 = presenter.getPeopleBySnils(snilsp2);

        System.out.println("Укажите снилс человека, которого необходимо внести, как ребенка: ");
        String snilsStr = scanner.nextLine();
        float snils = Float.parseFloat(snilsStr);
        Human children = presenter.getPeopleBySnils(snils);


        presenter.setChildren(children, parent1, parent2);
    }

    @Override
    public void setParents(){
        System.out.println("Укажите снилс человека, которому нужно добавить родтелей: ");
        String snilsStr = scanner.nextLine();
        float snils = Float.parseFloat(snilsStr);
        Human familyMember = presenter.getPeopleBySnils(snils);

        System.out.println("Укажите снилс первого родителя: ");
        String snilsp1Str = scanner.nextLine();
        float snilsp1 = Float.parseFloat(snilsp1Str);
        Human parent1 = presenter.getPeopleBySnils(snilsp1);

        System.out.println("Укажите снилс второго родителя: ");
        String snilsp2Str = scanner.nextLine();
        float snilsp2 = Float.parseFloat(snilsp2Str);
        Human parent2 = presenter.getPeopleBySnils(snilsp2);

        presenter.setParents(parent1, parent2, familyMember);
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void sortByGender() {presenter.sortByGender();}

    public void save(){
        presenter.save();
    }

    public Tree load(){
       return presenter.load();
    }

    @Override
    public void answer(String answer) {
        System.out.println(answer);

    }
}
