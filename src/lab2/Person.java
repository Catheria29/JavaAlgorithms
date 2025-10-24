package lab2;

public class Person {
    private String firstName ;
    private String lastName;
    private int age;
    private String address;
    private String gender;

    public Person(String firstName, String LastName, int age, String address,String gender ){
        this.firstName = firstName;
        this.lastName = LastName;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName ;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName ;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age; ;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address ;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender ;
    }

    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + "\n" + "Age: " + this.age + "\n" + "Gender: " + this.gender + "\n" + "Address: " + this.address;
    }
}
