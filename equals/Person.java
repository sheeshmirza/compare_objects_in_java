package equals;

// the equals() method compares the memory location of two objects in general.
// however, we can override the equals() method to define a custom logic for the comparison of two objects.

public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        // logic can be improved! :-p
        return this.age;
    }

    @Override
    public boolean equals(Object anotherPerson) {
        return this.hashCode() == anotherPerson.hashCode();
    }

    @Override
    public String toString() {
        return this.name + "'s age is " + this.age;
    }
}