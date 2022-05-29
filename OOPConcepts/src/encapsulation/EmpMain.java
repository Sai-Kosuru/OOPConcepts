package encapsulation;

public class EmpMain {
    public static void main(String[] args){
        Employee employee = new Employee();
        int baseSalary = employee.getBaseSalary();
        int hourlyRate = employee.getHourlyRate();
        System.out.println("Base salary: "+baseSalary);
        System.out.println("Hourly Rate: "+hourlyRate);
    }
}
