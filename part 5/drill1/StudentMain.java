package lesson5.drill1;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Mark",4,"Engineer");

        try {
        student.findJob();
        }
        catch (WorkException ex){
            System.out.println(ex.getMessage());
        }

        try {
            student.takeVacation();
        }
        catch (VacationException ex){
            System.out.println(ex.getMessage());
        }

        try {
            student.takeYearBreak();
        }
        catch (YearBreakException ex){
            System.out.println(ex.getMessage()+" "+ ex.getCause().getMessage());
        }
    }
}
