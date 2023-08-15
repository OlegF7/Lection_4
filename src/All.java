import java.util.Calendar;
import java.util.IllegalFormatCodePointException;

class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    Person(String name, String familyName, String middleName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getYear(){
        return Calendar.getInstance().get(Calendar.YEAR) - age;
    }

    @Override
    public String toString() {
        return name + " " + middleName + " " + familyName + " " + age;
    }
}


public class All {
    public static void main(String[] args) {
        Person person = new Person("John", "Dow", "Junior", 35);
        System.out.println(person.toString());

        System.out.println("Год рождения " + person.getYear());

        person.setMiddleName("William");
        System.out.println(person.getMiddleName());
    }
    public static void printAge(int age){
        System.out.println("Возраст:" + age);

    }

}

