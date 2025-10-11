import java.util.ArrayList;

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public double getGrade(){
        return this.grade;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public String toString() {
        return this.name + " : " + this.grade ;
    }

}
