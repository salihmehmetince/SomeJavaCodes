
import java.time.LocalDate;
import java.util.ArrayList;


public class Person3Test {

    public static void filterByGender(ArrayList<Person3> peopleArrayList,Person3.Gender gender)
    {
        for(Person3 person:peopleArrayList)
        {
            if(person.getGender()==gender)
            {
                System.out.println(person);
            }
        }
    }
    
    public static void filterByAge(ArrayList<Person3> peopleArrayList,int age)
    {
        for(Person3 person:peopleArrayList)
        {
            if(person.getAge()>age)
            {
                System.out.println(person);
            }
        }
    }
    
    public static void filterByAgeBound(ArrayList<Person3> peopleArrayList,int minAge,int maxAge)
    {
        for(Person3 person:peopleArrayList)
        {
            if(person.getAge()>minAge&&person.getAge()<maxAge)
            {
                System.out.println(person);
            }
        }
    }

    public static void filterPerson(ArrayList<Person3> peopleArrayList,IPerson personFilter)
    {
        for(Person3 person: peopleArrayList)
        {
            if(personFilter.filterPerson(person))
            {
                System.out.println(person);
            }
        }
    }
    public static void main(String[] args) {
        Person3 person=new Person3("dasxa", LocalDate.parse("2012-09-01"), "fgdg@gmail.com", Person3.Gender.FEMALE);
        Person3 person2=new Person3("dsf", LocalDate.parse("2000-03-04"), "jghgh@gmail.com", Person3.Gender.FEMALE);
        Person3 person3=new Person3("ghhf", LocalDate.parse("2001-11-11"), "dfggfhg@gmail.com", Person3.Gender.MALE);
        Person3 person4=new Person3("kjhg", LocalDate.parse("1999-10-23"), "jhgbgg@gmail.com", Person3.Gender.MALE);
        
        //System.out.println(person4);
        
        ArrayList<Person3> peopleList=new ArrayList<>();
        peopleList.add(person);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);
        
        filterByGender(peopleList, Person3.Gender.MALE);
        System.out.println("---------------------------------------------------------------------");
        filterByAge(peopleList, 20);
        System.out.println("---------------------------------------------------------------------");
        filterByAgeBound(peopleList, 20,25);
        System.out.println("---------------------------------------------------------------------");
        filterPerson(peopleList, new IPerson() {
            @Override
            public boolean filterPerson(Person3 person) {
                return person.getAge()>15;
            }
        });
        System.out.println("---------------------------------------------------------------------");
        filterPerson(peopleList, (p)->p.getAge()>15);

    }
    
}
