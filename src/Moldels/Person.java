package Moldels;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private int[] notas;

    public Person(){

    }

    

    public Person(String name, int age, int[] notas) {
        this.name = name;
        this.age = age;
        this.notas = notas;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public int[] getNotas() {
        return notas;
    }



    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getPromedio(){
        //Calcular el promedio
        //(suma de notas)/cantidad notas
        int suma = 0;
        for(int n : notas){
            suma+= n;
        }
        int prom = suma/notas.length;
        return prom;
    }

    public int NameValue(){
        int value =0;
        for(int vo = 0; vo < name.length();vo++){
            char letra = name.toLowerCase().charAt(vo);
            if (letra == 'a' || letra == 'e'|| letra =='i'|| letra =='o'|| letra == 'u')
                value+=5;
            else
                value+=age;
        }
        return value;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", promedio=" + getPromedio() + "vN=" + NameValue() +"]";
    }



   


    



    
    

    
    

}
