public class AnalyzeView {

    /* this program will analyze the viewing pattern of youtube vedio of my kid */
    public static void main(String[] args) {
        Person p1 = new Person("Afia Marium", 8);
        p1.printPersonInfo();
    
    }
}

class Person {
    String name;
    int age;
    String[] watch_list;

    Person (String name, int a) {
        this.name = name;
        this.a = a;
    }

    void printPersonInfo () {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}