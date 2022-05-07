import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionDemo {
    public static int getCountOfHumans(List<Object> listOfSomething){
        int count = 0;
        for (Object o : listOfSomething) {
            if (o instanceof Human) {
                count++;
            }
        }
        return count;
    }

    public static List<String> getNamesOfPublicMethods(Object obj) {
        List<String> listOfMethods = new ArrayList<>();

        Class<?> classData = obj.getClass();
        String nameOfClass = classData.getName();
        Method[] methods = classData.getMethods();
        for(Method method : methods){
            listOfMethods.add(method.getName());
        }
        return listOfMethods;
    }

    public static List<String> getNamesOfSupperclasses(Object obj){
        List<String> result = new ArrayList<>();
        Class<?> classData = obj.getClass().getSuperclass();
        while (classData != null){
            result.add(classData.getName());
            classData = classData.getSuperclass();
        }
        return result;
    }


    //Допы
    public static int getExecuteElements(List<Object> objectList){
        int count = 0;
        for(Object obj : objectList){
            if(obj instanceof Executable){
                ((Executable) obj).execute();
                count++;
            }
        }
        return count;
    }

    public static List<String> getGettersAndSetters(Object obj){
        List<String> listOfMethods = new ArrayList<>();
        if(obj == null){
            return listOfMethods;
        }

        Class<?> classData = obj.getClass();
        Method[] methods = classData.getMethods();
        //Геттер
        for(Method method : methods) {
            int modifiers = method.getModifiers();
            String methodString = method.toString();
            boolean isPublic = Modifier.isPublic(modifiers);
            boolean isStatic = Modifier.isStatic(modifiers);
            Class<?> returnType = method.getReturnType();
            boolean isVoid = returnType.getSimpleName().equals("void");
            boolean isGet = method.getName().startsWith("get");
            boolean isZero = (method.getParameterCount() == 0);

            if(isPublic && !isStatic && !isVoid && isGet && isZero) {
                listOfMethods.add(methodString);
            }
        }
        //Сеттер
        for(Method method : methods) {
            int modifiers = method.getModifiers();
            String methodString = method.toString();
            boolean isPublic = Modifier.isPublic(modifiers);
            boolean isStatic = Modifier.isStatic(modifiers);
            Class<?> returnType = method.getReturnType();
            boolean isVoid = returnType.getSimpleName().equals("void");
            boolean isGet = method.getName().startsWith("set");
            boolean isOne = (method.getParameterCount() == 1);

            if (isPublic && !isStatic && isVoid && isGet && isOne) {
                listOfMethods.add(methodString);
            }
        }
        return listOfMethods;
    }
}
