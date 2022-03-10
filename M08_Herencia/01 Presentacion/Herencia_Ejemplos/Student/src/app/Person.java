package app;

public class Person {
    private String name;

    public Person(){
        this.name = "No name yet";
    }

    public Person(String initialName){
        this.name = initialName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = name;
    }

    public void writeOutput(){
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person otherPerson){
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}