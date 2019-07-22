package com.granovskiy;


import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Square square = new Square(10);
        Class clazz = square.getClass();

        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);
            Annotation a = f.getAnnotation(FieldLevelAnnotation.class);
            if (a == null) {
                continue;
            }
            System.out.println(a.annotationType().getName());
            //System.out.println(((FieldLevelAnnotation)a).value());
        }

        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation a : annotations) {
            Field[] aFields = a.annotationType().getFields();
            System.out.println(a.annotationType().getName());

            for (Field f : aFields) {
                f.setAccessible(true);
                System.out.println(f);
            }
        }
        //Annotation fieldAnnotations =
    }
}

@ClassLevelAnnotation(size = 10, value = "overridden Class")
class Square {
    @FieldLevelAnnotation(value = "overridden Field")
    private String field = "default value";

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public String toJson() {
        return "";
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ClassLevelAnnotation {
    String value() default "targetClass";

    int size() default 0;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldLevelAnnotation {
    String value() default "targetField";
}

@DBConnection
class DBConnectionConfiguration {
    @UserName("${username.prop}")  // username is taken from another place
    private String username;
    @Password
    private String password;
    @DBUrl
    private String url;
    @DBDriver
    private String dbDriver;

    public DBConnectionConfiguration(String username, String password, String url, String dbDriver) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.dbDriver = dbDriver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }
}

@interface DBConnection {

}

@interface Password {
    String value() default "";
}

@interface UserName {
    String value() default "";
}

@interface DBUrl {
    String value() default "";
}

@interface DBDriver {
    String value() default "";
}
