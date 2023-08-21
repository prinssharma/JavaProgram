public class ClassesAndObjects {
   
    String name;
    int age;
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

     public static void main(String[] args) {
    

        ClassesAndObjects person1 = new ClassesAndObjects();
        person1.name = "Prins";
        person1.age = 26;
        person1.displayInfo();
    }
}
