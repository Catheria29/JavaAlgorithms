package lab2;

import java.util.*;

class Employee extends Person {
    private String position;
    private String department;
    private float salary;
    private float workingHours;
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String LastName,int id, int age, String address,String gender, String position, String department,  float workingHours){

        super(firstName, LastName, age,address,gender);
        this.position = position;
        this.department = department;
        this.workingHours = workingHours;
        this.id = id;
    }

    public String getPosition(){
        return this.position;
    }
    public void setPosition(String firstName){
        this.position = position ;
    }
    public float getSalary(){
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getWorkingHours(){
        return this.workingHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getRaise(){
        double newHourlyPay = this.hourlyPay * (1 + 0.15);
        this.setHourlyPay(newHourlyPay);
        return newHourlyPay ;

    }
    public double payDay(){
        double pay;
        if(this.workingHours > 40)
         pay =( (this.workingHours - 40) * (this.hourlyPay * 1.5)) + (40 * this.hourlyPay);
        else
            pay = this.workingHours * this.hourlyPay;
        return Math.round(pay * 100.0) / 100.0;
    }
    public boolean equals(Employee p){
        return (p.getLastName() == this.getLastName()) && (p.getId() == this.getId());
    }

    public String toString(){

        String hourlyPayFormat = "\nHourly Pay: %.2s USD per hour. ";

        return  super.toString()+  "\nDepartment: " + this.department + ".\n" +"Position: " + this.position+". "+ String.format(hourlyPayFormat, this.hourlyPay)
                + "\nID: " + this.id +"."   +  "\n" + "Salary: " + this.salary + ".\n" ;
    }
}
