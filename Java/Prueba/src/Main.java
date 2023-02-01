import java.util.List;
import java.util.Scanner;

public class Main {
    private int num1;
    private int num2;
    private static int quantity = 10;
    private static List<Student> data;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        menu();
    }

    private static void menu(){
        String opc = "";

//        !opc.equals("1") || !opc.equals("2") || !opc.equals("3") || !opc.equals("4")

        while(true) {
            System.out.println("---------------> CRUD Java <--------------- ");

            System.out.println("1.- Create\n" +
                               "2.- Read\n" +
                               "3.- Update\n" +
                               "4.- Delete");
            do{
                System.out.print("Option: ");
                opc = sc.next();
            }while(!(opc.equals("1") || opc.equals("2") ||
                     opc.equals("3") || opc.equals("4")));
            System.out.println("------------------------------------------- ");

              /*****************************************/
             /*          IF STRUCTURE CONTROL         */
            /*****************************************/

/*            IF STRUCTURE CONTROL
            if(opc.equalsIgnoreCase("1")){
                System.out.println("\n\n---------------> Create <---------------");
                create();
                break;
            }else if(opc.equalsIgnoreCase("2")){
                System.out.println("\n\n---------------> Read <---------------");
                break;
            }else if(opc.equalsIgnoreCase("3")){
                System.out.println("\n\n---------------> Update <---------------");
                break;
            }else if(opc.equalsIgnoreCase("4")){
                System.out.println("\n\n---------------> Delete <---------------");
                break;
            }
*/

  /*********************************************/
 /*          SWITCH STRUCTURE CONTROL         */
/*********************************************/
            switch (opc){
                case "1": {
                    create();
                    break;
                }
                case "2": {
                    read();
                    break;
                }
                case "3": {
                    System.out.println("\n\n---------------> Update <---------------");
                    break;
                }
                case "4": {
                    System.out.println("\n\n---------------> Delete <---------------");
                    break;
                }
                default:{
                    System.out.println("Invalid option.");
                }
            }
        }
    }

    private static void create(){
        String name = "";
        int note = 0;

        System.out.println("\n\n---------------> Create <---------------");
        System.out.print("Insert name of student: ");
        name = sc.next();

        System.out.print("Insert note of student: ");

        try{
            note = sc.nextInt();
        }catch(Exception e){
            System.out.println("Something went wrong. Coming back to menu.\n\n");
        }

        Student new_student = new Student(name, note);

        System.out.println("Student to insert\n" +
                           "Name: " + new_student.getName() + "\n" +
                           "Note: " + new_student.getNote());
        String opc = "";

        do{
            System.out.print("Are you sure to add student ? [Y/N]\nOption: ");
            opc = sc.next();
        }while(!(opc.equalsIgnoreCase("Y") || opc.equalsIgnoreCase("n")));

        if(opc.equalsIgnoreCase("Y")){
            data.add(new_student);
            System.out.println("Student has been added.\n\n");
        }else {
            System.out.println("Student hasn't been added.");
        }

        System.out.println("----------------------------------------\n\n");
        menu();
    }

    private static void read(){
        System.out.println("\n\n---------------> Read <---------------");

        if(data == null){
            System.out.println("Insert data before try to read it.");
        }else{
            System.out.println(data.toString());
        }

        System.out.println("--------------------------------------\n\n");
    }
}