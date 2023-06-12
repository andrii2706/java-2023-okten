package lesson1.homeworkOne;

import lesson1.homeworkOne.animal.Cat;
import lesson1.homeworkOne.animal.Dog;
import lesson1.homeworkOne.books.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class homeWorkOne {
   homeWorkOne(){
       ArrayList<String> dogSkills = new ArrayList<>();
       ArrayList<String> dogParants = new ArrayList<>();
       ArrayList<String> catSkills = new ArrayList<>();
       ArrayList<String> catParants = new ArrayList<>();
       ArrayList<String> bookSellers = new ArrayList<>();
       Dog dog = new Dog(2, 0,  "John", Gender.MALE, "boolDog",dogSkills, dogParants);
       Dog dog2= new Dog();
       dog2.animalId = 2;
       dog2.id = 1;
       dog2.name = "Winston";
       dog2.gender = Gender.MALE ;
       dog2.bread = "boolDog";
       dog2.skills = new ArrayList<>();
       dog2.parants =new ArrayList<>();
       Cat cat = new Cat(1, 0,  "Sindy", Gender.FEMALE, "sfinks", catSkills, catParants);
       Cat cat2 = new Cat();
       cat2.animalId = 1;
       cat2.id = 1;
       cat2.name = "Lili";
       cat2.bread = "Britsh cat";
       cat2.gender = Gender.FEMALE;
       cat2.skills = new ArrayList<>();

       Book book =  new Book(3 , 0, "Clear Code", "Be a good dev", "Robert Martin", bookSellers );

       System.out.println(dog);
       System.out.println(dog2);
       System.out.println(cat);
       System.out.println(cat2);
       System.out.println(book);
    }


}
