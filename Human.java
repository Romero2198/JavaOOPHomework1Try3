package Part1.Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String surname;
    private LocalDate born;
    private Human mother, father;
    private List<Human> children;
    private Gender gender;

    public Human(String name,
                 String surname, LocalDate born, Human mother, Human father, Gender gender) {
        this.born = born;
        this.name = name;
        this.surname = surname;
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.gender = gender;
    }

    public Human(String name,
                 String surname, LocalDate born, Gender gender) {
        this.born = born;
        this.name = name;
        this.surname = surname;
        this.mother = null;
        this.father = null;
        this.children = new ArrayList<>();
        this.gender = gender;
    }
    public void addChildren(Human children) {
        this.children.add(children);
    }

    public String showChildren() {
        StringBuilder sb = new StringBuilder();
        sb.append("Дети " + this.name + " " + this.surname + ": ");
        for (Human i: children) {
            sb.append(i.toString() + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nЭтого человека зовут: " +
                this.name + " " + this.surname +
                "\nОн(а) родился(ась): " + this.born
                + "\nОн(а) " + this.gender + " пола "
                + "\nЕго(ее) мать: " + this.mother
                + "\nЕго(ее) отец: " + this.father);
        return sb.toString();
    }
}
