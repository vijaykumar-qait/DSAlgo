package Crio.QprepJava;

public class Parent extends Person {
    private int minimumAge;

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    Parent(int minimumAge) {
        super();

    }

    @Override
    public void setAge(int age) {
        if(age < minimumAge){
            throw  new IllegalArgumentException();
        }
        super.setAge(age);
    }


}
