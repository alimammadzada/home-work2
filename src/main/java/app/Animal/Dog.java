package app.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
