package model.human;

public enum Gender {
    Male, Female;

    public static Gender parseGender(String genderStr) {
        if (genderStr.toLowerCase() == "male"){
            return Male;
        }
        if (genderStr.toLowerCase() == "female"){
            return Female;
        }
        return null;
    }
}
