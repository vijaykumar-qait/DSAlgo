package Crio.QprepJava;


public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;

    // TODO
    // Create setter and getter methods
    // Hints:
    // 1. Every member variable will need a corresponding setter and getter method
    // 2. Read the constraints and see if it affects the implementation of those methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }






    /*private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(){

    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String ln) {
        this.lastName = ln;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setAge(int ag) {
        if (ag < 0) {
            throw new IllegalArgumentException();
        }
        this.age = ag;
    }
    public int getAge() {
        return this.age;
    }
    public void setGender(String ge) {
        if (!ge.equals("Male") && !ge.equals("Female") && !ge.equals("Other")) {
            throw new IllegalArgumentException();
        }
        this.gender = ge;
    }
    public String getGender() {
        return this.gender;
    }
    public String getFullName() {
        return this.firstName + ' ' + this.lastName;
    }
    public String details() {
        return getFullName() + ',' + this.age + ',' + this.gender;
    }

    public static void main(String args[]) {
             Person person = new Person();
             person.setFirstName("Tony");
             person.setLastName("Stark");
             person.setAge(35);
             person.setGender("Male");
             System.out.println(person.details());
    }*/

}
