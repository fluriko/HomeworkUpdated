package mate.academy.hw1;

import java.util.Objects;

// задание 1.7
public class CloneOverride implements Cloneable {
    private int number;
    private String name;
    private Person person;

    public CloneOverride(int number, String name, Person person) {
        this.number = number;
        this.name = name;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + " number: " + getNumber() + " name: " + getName() + " person: " + getPerson();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        CloneOverride cloned = (CloneOverride) super.clone();
        cloned.setPerson((Person) cloned.getPerson().clone());
        return cloned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CloneOverride)) return false;
        CloneOverride that = (CloneOverride) o;
        return getNumber() == that.getNumber() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getName());
    }
}