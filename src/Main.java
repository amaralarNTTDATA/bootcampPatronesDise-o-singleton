public class Main {
    public static void main(String[] args) {

        Person persona = Person.getInstance();

        System.out.println(persona.getName());
        System.out.println(persona.getAge());

        persona.setName("Antonio");
        persona.setAge(47);
        Person persona2 = Person.getInstance();

        System.out.println(persona2.getName());
        System.out.println(persona2.getAge());

    }
}