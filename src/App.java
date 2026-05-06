import Moldels.Person;
import Controllers.PersonController;
public class App {
    public static void main(String[] args) throws Exception {
        Person[] persona = {
            new Person("Juan", 25),
            new Person("Ana", 19),
            new Person("Carlos", 30),
            new Person("Maria", 22),
            new Person("Diego", 15),
            };
            for(Person person : persona){
                System.out.println(person);
            }

            PersonController bsortAge = new PersonController();
            bsortAge.sortPersonByAge(persona);
            System.out.println("Ordenados la Edad");
            for(Person person : persona){
                System.out.println(person);
            }
            PersonController bsortName = new PersonController();
            bsortName.sortPersonByName(persona);
            System.out.println("Ordenamiento de nombres");
            for(Person person : persona){
                System.out.println(person);
            }
        }
    }

