import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

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

    //Допы
    @Test
    public void FourthTaskTest1(){
        SomeObject1 someObject1 = new SomeObject1();
        SomeObject1 someObject2 = new SomeObject1();
        Human hum1 = new Human("And","Rah");
        Human hum2 = new Human("And","Rah");
        Teacher teacher = new Teacher("Wh","weq","eqw");
        List<Object> objectList = new ArrayList<>();
        objectList.add(someObject1);
        objectList.add(hum2);
        objectList.add(teacher);
        objectList.add(someObject2);
        objectList.add(hum1);
        assertEquals(2,ReflectionDemo.getExecuteElements(objectList));
    }

    @Test
    public void FourthTaskTest2(){
        Human hum1 = new Human("And","Rah");
        Human hum2 = new Human("And","Rah");
        Teacher teacher = new Teacher("Wh","weq","eqw");
        List<Object> objectList = new ArrayList<>();
        objectList.add(hum2);
        objectList.add(teacher);
        objectList.add(hum1);
        assertEquals(0,ReflectionDemo.getExecuteElements(objectList));
    }

    @Test
    public void FifthTaskTest1(){
        SomeObject1 someObject1 = new SomeObject1();
        List<String> res = new ArrayList<>();
        res.add("public int SomeObject1.getI()");
        res.add("public java.lang.String SomeObject1.getS()");
        res.add("public char SomeObject1.getC()");
        res.add("public final native java.lang.Class java.lang.Object.getClass()");
        res.add("public void SomeObject1.setS(java.lang.String)");
        res.add("public void SomeObject1.setI(int)");
        res.add("public void SomeObject1.setC(char)");
        List<String> res2 = ReflectionDemo.getGettersAndSetters(someObject1);
        Collections.sort(res);
        Collections.sort(res2);
        boolean tr = res.equals(res2);
        assertTrue(tr);
    }

    @Test
    public void FifthTaskTest2(){
        Object ob = new Object();
        List<String> res = ReflectionDemo.getGettersAndSetters(ob);
        assertEquals("[public final native java.lang.Class java.lang.Object.getClass()]",res.toString());
    }

    class A {
        public int aaagetvvv() {
            return 1;
        }
    }

    @Test
    public void FifthTaskTest4(){
        Object ob = new A();
        List<String> res = ReflectionDemo.getGettersAndSetters(ob);
        assertEquals("[public final native java.lang.Class java.lang.Object.getClass()]",res.toString());
    }

    @Test
    public void FifthTaskTest3(){
        Object ob = null;
        List<String> res = ReflectionDemo.getGettersAndSetters(ob);
        assertEquals("[]", res.toString());
    }
}
