package lesson5.drill1;

public class Student {
    private String name;
    private int schoolYear;
    private String topic;

    public Student(String name, int schoolYear, String topic) {
        this.name = name;
        this.schoolYear = schoolYear;
        this.topic = topic;
    }

    private final int SCHOOL_YEAR_PERMISSION_WORK =  3;
    private final String CAN_NOT_TAKE_BREAK = "Engineer";

    public void findJob() throws WorkException{
        if (this.schoolYear>=SCHOOL_YEAR_PERMISSION_WORK){
            System.out.println("Yhh, "+this.name+" found a job");
        }
        else {
            throw new WorkException(this.name+ " is in year "+this.schoolYear+" to school");
        }
    }

    public void takeVacation() throws VacationException{
        if (!this.topic.equals(CAN_NOT_TAKE_BREAK)){
            System.out.println(this.name +" in vacation");
        }
        else {
            throw new VacationException(this.name+" study "+this.topic+" and can't take a vacation");
        }
    }

    public void takeYearBreak() throws YearBreakException{
        try{
            takeVacation();
            System.out.println(this.name+" take one year break in addition");
        }
        catch (VacationException ex){
            throw new YearBreakException(this.topic + " don't have long vacation",ex);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolYear=" + schoolYear +
                ", topic='" + topic + '\'' +
                '}';
    }
}
