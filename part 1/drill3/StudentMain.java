package lesson1.drill3;

public class StudentMain {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("Or","computer");
        students[1] =  new Student("Pol","teacher");
        students[2] =  new Student("Gal","management");

        for (Student st:students){
            for (int i = 0; i< 10; i++){
                st.addGrade((int)(Math.random()*100));
            }
        }

        for (Student st:students){
            st.print();
        }
        Student best = students[0];
        for (int i = 1; i<students.length; i++){
            if (students[i].compareAvg(best))
                best = students[i];
        }

        System.out.println(students[0].getName()+":"+students[0].computeAvg());
        System.out.println(students[1].getName()+":"+students[1].computeAvg());
        System.out.println(students[2].getName()+":"+students[2].computeAvg());
        best.print();
    }
}
