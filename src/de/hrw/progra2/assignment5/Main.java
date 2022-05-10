package de.hrw.progra2.assignment5;

public class Main {

    public static void main(String[] args) {

        Intern intern = new Intern("Peter Mustermann", 7.3f, 5.4f, 8, 7.5f, 7.9f, 700, 0);
        System.out.println(intern);
        System.out.println(intern.validLabourHours());
        System.out.println(intern.isFulltimeEmployee());
        System.out.println(intern.returnLabourHourWarning());

        WorkingStudent workingStudent = new WorkingStudent("Karl Friedrich", 5.5f, 6.5f, 8, 5, 0, 700, 0);
        System.out.println(workingStudent);
        System.out.println(workingStudent.validLabourHours());
        System.out.println(workingStudent.isFulltimeEmployee());
        System.out.println(workingStudent.returnLabourHourWarning());

        SalesEmployee salesEmployee = new SalesEmployee("Günter Meier", 8, 8, 8, 8, 8, 3100, 50);
        System.out.println(salesEmployee);
        System.out.println(salesEmployee.validLabourHours());
        System.out.println(salesEmployee.isFulltimeEmployee());
        System.out.println(salesEmployee.returnLabourHourWarning());

        Tradesmen tradesmen = new Tradesmen("Hans Martin", 9, 9, 9, 9, 9, 50, false);
        System.out.println(tradesmen);
        System.out.println(tradesmen.writeInvoice());
        System.out.println(tradesmen.validLabourHours());
        System.out.println(tradesmen.tradeRegulationSigned());

        Freelancer freelancer = new Freelancer("Marie Martin", 9, 9, 9, 9, 9, 70, false);
        System.out.println(freelancer);
        System.out.println(freelancer.writeInvoice());
        System.out.println(freelancer.validLabourHours());
        System.out.println(freelancer.tradeRegulationSigned());

        Employee[] employees = {intern, workingStudent, salesEmployee, tradesmen, freelancer};
        ContractEmployee[] contractEmployees = {tradesmen, freelancer};

        System.out.println(StaffUtil.getTotalLabourHours(employees));
        System.out.println(StaffUtil.getInvalidWorkingHoursEmployees(employees));
        System.out.println(StaffUtil.getEstimatedContractCost(contractEmployees));

    }
}
