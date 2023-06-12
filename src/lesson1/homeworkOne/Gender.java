package lesson1.homeworkOne;

public enum Gender {
    MALE(true), FEMALE(false);
    private  boolean gender;
    public boolean isGender(){
        return  gender;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }
    private Gender(){}
    Gender(boolean gender){
        this.gender = gender;
    }
}
