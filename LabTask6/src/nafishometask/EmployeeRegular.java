package nafishometask;

/**
 * Created by nafis on 09/10/16.
 */
public class EmployeeRegular extends Employee {
    private double baseSalary;
    private double conveyances;
    private double deduction;

    public EmployeeRegular(String name, String address, int age, double baseSalary, double conveyances, double deduction){
        super(name, address , age);
        this.baseSalary=baseSalary;
        this.conveyances=conveyances;
        this.deduction=deduction;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getConveyances() {
        return conveyances;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setConveyances(double conveyances) {
        this.conveyances = conveyances;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double computeAnualSalary(){
        return (baseSalary+conveyances-deduction)*12;
    }
    public String toString(){
        return super.toString()+"\n BaseSalary: "+baseSalary+"\nConveyance: "+conveyances+"\nDeduction: "+deduction+"\nAnnual salary "+computeAnualSalary();
    }
}