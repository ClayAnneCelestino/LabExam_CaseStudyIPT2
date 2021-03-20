class Employee { 
    public static int base = 35000; 
    int salary() 
    { 
        return base; 
    } 
} 
// Inherited class 
class Manager extends Employee { 
    
    @Override
    int salary() 
    { 
        return base + 45000; 
    } 
} 

class Utility  extends Employee { 
    public static int base = 15000; 
    int salary() 
    { 
        return base; 
    } 
} 
  
  class Maintenance extends Employee { 
    public static int base = 35000; 
    int salary() 
    { 
        return base; 
    } 
} 

  
// Inherited class 
class Clerk extends Employee { 
    // This method overrides salary() of Parent 
    @Override
    int salary() 
    { 
        return base + 10000; 
    } 
} 
  
// Driver class 
class Main { 
    
    static void printSalary(Employee e) 
    { 
        System.out.println(e.salary()); 
    } 
  
    public static void main(String[] args) 
    { 
        Employee obj1 = new Manager(); 
  
        
        System.out.print("Manager's salary : "); 
        printSalary(obj1); 
  
        Employee obj2 = new Clerk(); 
        System.out.print("Clerk's salary : "); 
        printSalary(obj2); 
        
        Employee obj3 = new Utility
        (); 
        System.out.print("Utility salary : "); 
        printSalary(obj2); 
        
        Employee obj4 = new Maintenance
        (); 
        System.out.print("Maintenance salary : "); 
        printSalary(obj2); 
    } 
}
