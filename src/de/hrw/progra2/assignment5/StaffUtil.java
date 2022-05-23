package de.hrw.progra2.assignment5;

import java.util.ArrayList;

public class StaffUtil {

    public static float getTotalLabourHours(Employee[] employees) {

        float counter = 0.0f;

        for (Employee employee : employees) {
            for (float labourHour : employee.getLabourHours()) {
                counter += labourHour;
            }
        }
        return counter;
    }

    public static ArrayList<Employee> getInvalidWorkingHoursEmployees(Employee[] employees) {

        ArrayList<Employee> invalidWorkingHoursEmployeesList = new ArrayList<>();

        for (Employee employee : employees) {
            if (!employee.validLabourHours()) {
                invalidWorkingHoursEmployeesList.add(employee);
            }
        }
        return invalidWorkingHoursEmployeesList;
    }

    public static float getEstimatedContractCost(ContractEmployee[] contractEmployees) {

        float sum = 0;

        for (ContractEmployee contractEmployee : contractEmployees) {
            sum += contractEmployee.writeInvoice();
        }
        return sum;
    }

}
