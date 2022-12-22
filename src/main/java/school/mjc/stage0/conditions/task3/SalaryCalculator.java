package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int sum = salary;
        if (salary <= 0 ){
            System.out.println("wrong input!");
            return;
        }else if (salary <= 10000) {
            sum -= (salary * 0.15);
        } else if (salary <= 20000) {
            sum -= (salary * 0.18);
        } else {
            sum -= (salary * 0.2);
        }
        System.out.println(sum);
    }
}
