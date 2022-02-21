public class Employee_Wage_Caluculator {
    public static void main(String[] args) {
        int IS_PRESENCE = 1 ;
        Double Emp_Check = Math.floor(Math.random() * 10) % 2;
        if (Emp_Check == IS_PRESENCE)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
        
    }
}
