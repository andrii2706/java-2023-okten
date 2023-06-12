package lesson1.homeworkOne.animal;

import lesson1.homeworkOne.Gender;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Dog {
    public int animalId;
    public int id;
    public String name;
    public Gender gender;
    public String bread;
    public List<String> skills = new ArrayList<>();
    public List<String> parants = new ArrayList<>();

    public Dog(int animalId, int id, String name, Gender gender, String bread,List<String> skills,  List<String> parants ){
        this.animalId = animalId;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.bread = bread;
        this.skills = skills;
        this.parants = parants;
    }

    @Override
    public String toString() {
        return "Dog : {" +
                "animalId=" + animalId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", bread='" + bread + '\'' +
                ", skills=" + skills +
                ", parants=" + parants +
                '}';
    }
}
