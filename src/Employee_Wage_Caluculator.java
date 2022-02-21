public class Employee_Wage_Caluculator {
    public static void main(String[] args) {
        int IS_PRESENCE = 1;
        int WAGE_PER_HOUR = 20;
        int FULLDAY_HOUR = 8;
        int WAGE_PER_FULLDAY = 160;

        Double Emp_Check = Math.floor(Math.random() * 10) % 2;

        if (Emp_Check == IS_PRESENCE)
            System.out.println("Employee is present and He is getting the wage per day is " +WAGE_PER_FULLDAY);
        else
            System.out.println("Employee is absent");

    }
}
