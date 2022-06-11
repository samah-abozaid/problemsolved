
package revision;


public class SalariedEmployee  extends Employee implements Displayable {
    
    double salary,bonus,deductions;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public SalariedEmployee() {
    }
  

    public SalariedEmployee(double salary, double bonus, double deductions, String name, String address, int ssn, Gendre sexe) {
        super(name, address, ssn, sexe);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

@Override
  public  double earning(){
    return (salary+bonus) - deductions; 
  }  
  
  public void Displayalldetails(){
     
      
      System.out.println("super.toString()");
      System.out.println(toString());
  }
  
 public void displayearnning(){
     
 } 

    @Override
    public String toString() {
        return "SalaredEmployee{" + "salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + '}';
    }
    
    
    
    
    }
    
    
    

