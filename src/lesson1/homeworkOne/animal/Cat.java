package lesson1.homeworkOne.animal;

import lesson1.homeworkOne.Gender;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Cat {
    public int animalId;
    public int id;
    public String name;
    public Gender gender;
    public String bread;
    public List<String> skills = new ArrayList<>();

    public Cat(int animalId, int id, String name, Gender gender, String bread,List<String> skills,  List<String> parants ){
        this.animalId = animalId;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.bread = bread;
        this.skills = skills;
    }


    @Override
    public String toString() {
        return "Cat : {" +
                "animalId=" + animalId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", bread='" + bread + '\'' +
                ", skills=" + skills +
                '}';
    }
}
