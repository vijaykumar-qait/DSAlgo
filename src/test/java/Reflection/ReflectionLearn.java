package Reflection;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ReflectionLearn {

    @Test
    public void givenObject_whenGetsFieldNameAtRunTime() {
        Object person = new Person();
        Field[] fields = person.getClass().getFields();

        List<String>  actualFields = getFieldNames(fields);

        System.out.println(actualFields);
    }

    private static  List<String> getFieldNames(Field[] fields) {
        List<String> fieldName = new ArrayList<String>();
        for(Field field : fields) {
            fieldName.add(field.getName());

        }
        return  fieldName;
    }
}
