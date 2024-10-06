package org.examplez;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double tax = 0.0;
        if (this.salary > 1000) {
            tax = this.salary * 3 / 100;
        }

        return tax;
    }

    double bonus(){
        double bonus = 0.0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }

        return bonus;
    }

    double raiseSalary() {
        double raiseSalary = 0.0;
        int currentYear = 2024;
        int experience = currentYear - this.hireYear;
        if (experience < 10) {
            raiseSalary = this.salary * 0.05;
        } else if (experience < 20) {
            raiseSalary = this.salary * 0.1;
        } else {
            raiseSalary = this.salary * 0.15;
        }

        return raiseSalary;
    }

    @Override
    public String toString() {
        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()) + "\n" +
                "Toplam Maaş : " + (this.salary + bonus() + raiseSalary() - tax());
    }
}
