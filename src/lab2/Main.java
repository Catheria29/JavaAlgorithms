package lab2;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Bara","Remi",23,"Ataturk cad.","Feminin");
        Employee emp1 = new Employee("Rade","Tunde",453780,34,"Benin,PObe","Male","Senior developer","Software",55 );
        Employee emp2 = new Employee("Lola","Tunde",453780,46,"Benin,PObe","Female","Senior developer","Software",22 );
        Employee person2 = new Employee("Tobi","Ola",433456,34,"Antalya,Kepez,home", "Feminin","Manager","Management",40);
        emp1.setSalary(1000);
        person2.setHourlyPay(15);
        emp2.setHourlyPay(12);

        person2.setHourlyPay(10);



        System.out.println(emp1.toString()) ;
        System.out.println(emp2.toString());



        System.out.println(emp1.payDay());
        System.out.println(person2.payDay());

        System.out.println("Before raise:" +emp2.payDay());
        emp2.getRaise();
        System.out.println("After raise: "+ emp2.payDay());

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(person2));
    }
}
