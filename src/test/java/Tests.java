import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.*;

public class Tests {
    @Test
    public void firstTest(){
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
        assertEquals(ReflectionDemo.getCountOfHumans(listOfSomething), 5);
    }

    @Test
    public void secondTest(){
        Human hum1 = new Human("And","Rah");
        assertEquals(ReflectionDemo.getNamesOfPublicMethods(hum1).toString(),"[getName, toString, getSurname, wait, wait, wait, equals, hashCode, getClass, notify, notifyAll]");
    }

    @Test
    public void thirdTest(){
        Teacher teacher = new Teacher("Wh","weq","eqw");
        assertEquals(ReflectionDemo.getNamesOfSupperclasses(teacher).toString(),"[Human, java.lang.Object]");
    }

    @Test
    public void ObjectTest(){
        Object obj = new Object();
        assertEquals(ReflectionDemo.getNamesOfSupperclasses(obj).toString(),"[]");
    }
}
