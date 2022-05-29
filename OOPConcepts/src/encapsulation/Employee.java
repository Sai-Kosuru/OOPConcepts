package encapsulation;
//Encapsulation and Constructor overloading were implemented
public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public Employee(){
        setBaseSalary(0);
        setHourlyRate(0);
        //this(0,0); // call to parameterized constructor
    }

    public int calculateWage(int extraHours){
        return getBaseSalary()+(getHourlyRate()*extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Salary must be greater than zero");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
}
