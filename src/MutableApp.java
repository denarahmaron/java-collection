import data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Denar");
        person.addHobbies("Coding");
        person.addHobbies("Game");
        doSomethingWithHobbies(person.getHobbies());
        for(var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Mancing");
    }
}
