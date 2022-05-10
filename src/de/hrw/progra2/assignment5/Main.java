package de.hrw.progra2.assignment5;

public class Main {

    public static void main(String[] args) {

        Intern intern = new Intern("Peter Mustermann", 7.3f, 5.4f, 8, 7.5f, 7.9f, 700, 0);

        System.out.println(intern);

        WorkingStudent workingStudent = new WorkingStudent("Karl Friedrich", 5.5f, 6.5f, 8, 0, 0, 700, 0);

        System.out.println(workingStudent);

        SalesEmployee salesEmployee = new SalesEmployee("Günter Meier", 8, 8, 8, 8, 8, 3100, 50);

        System.out.println(salesEmployee);

        Tradesmen tradesmen = new Tradesmen("Hans Martin", 9, 9, 9, 9, 9, 50, true);

        System.out.println(tradesmen);

        Freelancer freelancer = new Freelancer("Marie Martin", 9, 9, 9, 9, 9, 50, true);

        System.out.println(freelancer);

    }
}
