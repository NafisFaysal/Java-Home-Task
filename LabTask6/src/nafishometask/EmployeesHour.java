package nafishometask;

/**
 * Created by nafis on 09/10/16.
 **/

 public class EmployeesHour extends Employee {
        private double avgeraveWorkingHour;
        private double hourlySalary;


        public EmployeesHour(String name, String address, int age, double hour, double salary){
            super(name,address,age);
            this.avgeraveWorkingHour= hour;
            this.hourlySalary = salary;
        }

        public double getAvgrageWorkingHour() {
            return avgeraveWorkingHour;
        }

        public double getHourlySalary() {
            return hourlySalary;
        }

        public void setAvgrageWorkingHour(double avgWorkingHour) {
            this.avgeraveWorkingHour= avgWorkingHour;
        }

        public void setHourlySalary(double hourlySalary) {
            this.hourlySalary = hourlySalary;
        }

        public double computeAnualSalary(){
            return hourlySalary*avgeraveWorkingHour*5*52;
        }
        public String toString(){
            return super.toString()+"\nAverage Working Hour: "+avgeraveWorkingHour+"\nHourly salary: "+hourlySalary+"\nAnnual salary "+computeAnualSalary();
        }
    }
