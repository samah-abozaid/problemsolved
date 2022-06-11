
package revision;


public class EmployeeMain {
  public static void main(String[]args){
  
  Departement d1= new Departement(1,"information system");
  SalariedEmployee se = new SalariedEmployee(2000, 500, 50, "toto", "egypte",1200, Gendre.male ) ;
  d1.Addemployee(se);
  
  HourlyEmployee he = new HourlyEmployee(100, 6, "momo", "france", 1200, Gendre.female);
  d1.Addemployee(he);
  
  Comission_Employee ce = new Comission_Employee(15000,0.25, "soso", "bordeux",1200,Gendre.male);
  d1.Addemployee(ce);
  
  System.out.print(d1.getemployeecount());
  
  d1.Printalldetails();
  
  
  
  
  
  
  
  

  
    
    
    }  
    
}
