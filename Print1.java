import java.util.Scanner;

public class Print1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student[] re = new Student[3];
        for(int i=0;i<3;i++){
            System.out.print("Name:");
            String name = sc.nextLine();

           

            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("classe: ");
            int classe= Integer.parseInt(sc.nextLine());

            Student sfr = new Student(name, age, classe);
            re[i]=sfr;

            System.out.println("___________________________________________");


        }

        for(int i=0;i<3;i++){
            System.out.println("Name: "+ re[i].name);
            System.out.println("Age: "+ re[i].age);
            System.out.println("class: "+ re[i].classe);
            System.out.println("___________________________________________");
        }
        
    }
}

class Student{
    String name;
    int age;
    int classe;

    Student(String name,int age,int classe){
        this.name = name;
        this.age= age;
        this.classe=classe;

    }
}