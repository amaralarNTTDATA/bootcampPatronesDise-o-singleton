public class Person {

    private String name;
    private int age;
    private static Person instance;

    private Person() {

        this.name = "Juan";
        this.age = 25;

    }

    public static Person getInstance() {

        if (instance == null) {

            instance = new Person();

        }

        return instance;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;

    }

}
