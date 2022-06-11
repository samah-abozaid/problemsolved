
package revision;


public class Comission_Employee extends Employee implements Displayable{
    private double gross_sales;
    private double comission_rate;

    public Comission_Employee() {
    }

    public Comission_Employee(double gross_sales, double comission_rate) {
        this.gross_sales = gross_sales;
        this.comission_rate = comission_rate;
    }

    public Comission_Employee(double gross_sales, double comission_rate, String name, String address, int ssn, Gendre sexe) {
        super(name, address, ssn, sexe);
        this.gross_sales = gross_sales;
        this.comission_rate = comission_rate;
    }

   

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getComission_rate() {
        return comission_rate;
    }

    public void setComission_rate(double comission_rate) {
        this.comission_rate = comission_rate;
    }

    @Override
    public String toString() {
        return "Comission_Employee{" + "gross_sales=" + gross_sales + ", comission_rate=" + comission_rate + '}';
    }
    
 
     @Override
    public double earning(){
        return gross_sales*comission_rate;
  
    }
     public void Displayalldetails(){
     
      
      System.out.println("super.toString()");
      System.out.println(toString());
  }
    public void displayearnning(){
       System.out.println(earning()); 
     
 } 
    
     
}
