
package revision;

enum Gendre{male,female};
public  abstract class Employee {
    
 private String name;
 private String address;
 private int ssn;
  private Gendre sexe;

    public Employee() {
    }

    public Employee(String name, String address, int ssn, Gendre sexe) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.sexe = sexe;
    }
  
  public abstract double earning();
  {}
  
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gendre getSexe() {
        return sexe;
    }

    public void setSexe(Gendre sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", address=" + address + ", ssn=" + ssn + ", sexe=" + sexe + '}';
    }
  
  
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
