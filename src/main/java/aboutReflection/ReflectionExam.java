package main.java.aboutReflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Reflection kullanarak bir sınıfın tüm metodlarını ve alanlarını yazdıran bir program yazınız.
public class ReflectionExam {
    public static void main(String[] args) {
        Class<?> clazz = SampleClass.class;

        System.out.println("Methods:");
        for (Method method: clazz.getDeclaredMethods()){
            System.out.println(method.getName());
        }

        System.out.println();
        System.out.println("Fields:");
        for (Field field: clazz.getDeclaredFields()){
            System.out.println(field.getName());
        }
    }
}

class SampleClass {
    private int id;
    private String name;

    public void sayHi(){
        System.out.println("Hi");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}