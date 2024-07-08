import java.util.*;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] empe = new Employee[3];
        for(int i=0;i<3;i++){
            System.out.print("Id: ");
            int emp = Integer.parseInt(sc.nextLine());
            System.out.print("Name: ");
            String nme = sc.nextLine();
            System.out.print("salary: ");
            int sal = Integer.parseInt(sc.nextLine());

            empe[i]=new Employee(emp, nme, sal);



        }
       for (int j = 0; j < empe.length; j++) {
        System.out.println("EmployeeId: "+ empe[j].id);
        System.out.println("EmployeeName: "+ empe[j].name);
        System.out.println("EmployeeSalary: "+ empe[j].salary);
        
       }
        



        
    }
    
}

class Employee{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary){
        this.id =id;
        this.name = name;
        this.salary = salary;
    }
}
