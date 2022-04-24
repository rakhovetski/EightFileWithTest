import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String []args){
        Human hum1 = new Human("And","Rah");
        Human hum2 = new Human("Nik","Asa");
        Human hum3 = new Human("Iva","Rom");
        List<Object> listOfSomething = new ArrayList<>();
        listOfSomething.add(hum1);
        listOfSomething.add(hum2);
        listOfSomething.add(hum3);
        listOfSomething.add(1);
        listOfSomething.add("Hello");
        listOfSomething.add("");
        listOfSomething.add(null);
        Human hum4 = new Human("Som","Who");
        listOfSomething.add(hum4);
        Teacher teacher = new Teacher("Wh","weq","eqw");
        listOfSomething.add(teacher);
        ReflectionDemo.getNamesOfPublicMethods(hum1);
        ReflectionDemo.getNamesOfSupperclasses(teacher);
    }
}
