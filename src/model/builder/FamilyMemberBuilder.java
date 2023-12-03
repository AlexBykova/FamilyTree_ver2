package model.builder;

import model.human.Gender;
import model.human.Human;

import java.time.LocalDate;

public class FamilyMemberBuilder {
    public Human build(float snils, String name, Gender gender, LocalDate birthday, LocalDate deathday) {
        return new Human(snils, name, gender, birthday, deathday);
    }
}
