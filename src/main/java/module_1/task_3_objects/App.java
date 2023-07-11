package module_1.task_3_objects;

public class App {
    public static void main(String[] args) {
//        Dog - type (like Long, Integer and so on)
//        myDog - name of variable
//        new Dog() - create a variable
        Dog myDog = new Dog();

//        Hey myDog, could you please bark?
        myDog.bark();

        System.out.println();
        DogWithName billy = new DogWithName("Billy");
        billy.bark();
    }
}
