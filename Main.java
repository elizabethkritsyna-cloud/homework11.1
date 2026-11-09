public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 25, "Professor");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Profession: " + person1.profession);
        Person person2 = new Person("Vita", 25, "Teacher");
        person2.changeProfession("Designer");

        Person person3 = new Person("Dylan", 35, "Doctor");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Profession: " + person2.profession);

        System.out.println("Name: " + person3.name);
        System.out.println("Age: " + person3.age);
        System.out.println("Profession: " + person3.profession);
    }
}
