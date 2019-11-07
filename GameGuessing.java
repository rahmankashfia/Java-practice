import java.util.*;

public class GameGuessing {
    
    public static void main(String[] args) {

        System.out.println("Start Program");
        //Players p1 = new Players("Kashfia", 34);
        //Players p2 = new Players("Alvi", 35);
        //PlayersDetails p3 = new Players("Afia", 8);
        PlayersDetails p4 = new PlayersDetails("Arisa", 2, 100, "color");
//        p1.intro();
//        p2.intro();
//        p3.intro();
        p4.intro();
        
    }   
}

class Players {

    String name;
    int age;

    Players (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void intro () {
        System.out.println(this.name + " " + this.age);
    }
}

class PlayersDetails extends Players {

    int salary;
    String hobby;

    PlayersDetails (String name, int age, int sal, String hobby) {
        super(name, age);
        this.salary = sal;
        this.hobby = hobby;
    }


}

