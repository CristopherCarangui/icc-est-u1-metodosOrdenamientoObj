import Moldels.Person;
import Controllers.PersonController;
public class App {
    public static void main(String[] args) throws Exception {
        Person[] persona = {
            new Person("Juan", 25, new int[] {10,15,20}),
            new Person("Ana", 19,new int[] {15,15,20}),
            new Person("Carlos", 30,new int[] {10,10,10}),
            new Person("Maria", 22,new int[] {20,15,20}),
            new Person("Diego", 15,new int[] {20,10,20}),
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

            PersonController bsortPromedio = new PersonController();
            bsortPromedio.sortPersonByAvrNotas(persona);
            System.out.println("Ordenamiento por notas");
            for(Person person : persona){
                System.out.println(person);
            }

            PersonController bsortNombreValue = new PersonController();
            bsortNombreValue.sortPersonbyNameVlue(persona);
            System.out.println("Ordenamiento por valor de nombre");
            for(Person person : persona){
                System.out.println(person);
            }
        }
    }

