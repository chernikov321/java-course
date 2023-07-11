package module_1.task_3_objects;

public class DogWithName {

    final String name;

    public DogWithName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Bark bark! My name is " + name);
    }

}
