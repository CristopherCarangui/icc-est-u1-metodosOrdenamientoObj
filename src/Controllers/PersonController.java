package Controllers;
import Moldels.Person;
public class PersonController {
    // Metodo que ordena un arreglo de personas 
    // por su EDAD(age), con metodo insercion
    public void sortPersonByAge(Person[] personas){
        for(int i = 1 ; i<personas.length; i++){
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getAge()>aux.getAge()){
                personas[j+1] = personas[j];
                j--;

            }
            personas[j+1]=aux;
        }


    }

    public void sortPersonByName(Person[] personas){
        for(int i = 1 ; i<personas.length; i++){
            Person aux = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getName().compareTo(aux.getName())>0){
                personas[j+1] = personas[j];
                j--;

            }
            personas[j+1]=aux;
        }


    }
    //Metodo ordena las personas segun el
    // Promedio de sus notas con seleccion
    public void sortPersonByAvrNotas(Person[] personas){
        for(int i = 0; i<personas.length;i++){
            int aux = i;
            for(int j = i+1; j< personas.length;j++){
                // comparacion para actualizar el indice
                if(personas[j].getPromedio()<personas[aux].getPromedio())
                    aux = j;
                
            }
            //preguntar si el index es != i
            //dntonces cambio poaiciones
            if(i!= aux){
                Person index = personas[i];
                personas[i]= personas[aux];
                personas[aux]= index;  
            }
        }
    }

    public void sortPersonbyNameVlue(Person[] personas){
        //Odernar el arreglo de personas por un valor de su nombre
        // el valor del nombre sera la cantidad de letras 
        // donde las vocales valen  5
        // consonantes valen  el valor de la edad
        // ej: Juan 20
        // 20+5+5+20=50
        for(int i = 0; i<personas.length;i++){
            int aux = i;
            for(int j = i+1; j< personas.length;j++){
                // comparacion para actualizar el indice
                if(personas[j].NameValue()<personas[aux].NameValue())
                    aux = j;
                
            }
            //preguntar si el index es != i
            //dntonces cambio poaiciones
            if(i!= aux){
                Person index = personas[i];
                personas[i]= personas[aux];
                personas[aux]= index;  
            }
        }
    }
}

