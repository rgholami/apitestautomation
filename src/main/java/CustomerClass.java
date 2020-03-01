public class CustomerClass {



    // 1- create Getter/Setter - "Cntrol + N" HIGHLIGHT ARRTIBUTES AND HIT contl + N to create gettter.setter methods
    // 2-  to comment code-block, highlig the code block and use Command"  + "/"
    // 2B-b to uncomment a block of code, "Command + "/
    // 3- to refactoring, highlight attribute, use tab "Refactor then change/refactor to a different name,
    // Getter/Setter for the changed apptibute - refactors
//  4- Declaration /usage - click on "age , for example, click "command"  key, it shows all useage of attribut
    // attribute, its gettter/Setter
    // 50 Artifacts = to create jar, you need to create artifact,
    // 6- Crerate jar file from Artifact -- go project structure + Command + ";" --same Jar from main



    String firstName ;
    String lastName;
    int age;
    String address;

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }
}
