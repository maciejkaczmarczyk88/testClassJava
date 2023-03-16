package task.Zada96;

import classowe.Person;

public class Hospital {
    private int number = 0;
    private int maxPerson = 5;
    PersonOne[] person = new PersonOne[maxPerson];


    public void addNewPerson(PersonOne newPerson){
        person[number] = newPerson;
        number++;
    }

    public void printPerson(){
        for (PersonOne person1 : person) {
            System.out.println(person1);
        }
    }

}
