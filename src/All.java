import java.util.IllegalFormatCodePointException;

class Person{
    private String name;
    private String middleName;
    private String familyName;

    Person(String name, String familyName, String middleName){
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
    }
    public String getName() {
        return name;
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

@Override
    public String toString(){
    return name + " " + middleName + " " + familyName;
    }
}


public class All {
    public static void main(String[] args){
        Person person = new Person("John", "Dow", "Junior");
        System.out.println(person.toString());

        person.setMiddleName("William");
        System.out.println(person.getMiddleName());
    }

}

