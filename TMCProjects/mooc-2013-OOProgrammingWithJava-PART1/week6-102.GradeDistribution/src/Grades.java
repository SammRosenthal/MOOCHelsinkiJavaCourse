import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> grades;
    private int accepted;
    private int count0;
    private int count1;
    private int count2;
    private int count3;
    private int count4;
    private int count5;

    public Grades () {
        this.grades = new ArrayList<Integer>();
        this.count5 = 0;
        this.count4 = 0;
        this.count3 = 0;
        this.count2 = 0;
        this.count1 = 0;
        this.count0 = 0;
    }

    public void addGrade(int grade) {
        if(grade>0 && grade<30) {
            this.grades.add(grade);
            count0++;
        }
        if(grade>=30 && grade<35) {
            this.grades.add(grade);
            count1++;
            accepted++;
        }
        if(grade>=35 && grade<40) {
            this.grades.add(grade);
            count2++;
            accepted++;
        }
        if(grade>=40 && grade<45) {
            this.grades.add(grade);
            count3++;
            accepted++;
        }
        if(grade>=45 && grade<50) {
            this.grades.add(grade);
            count4++;
            accepted++;
        }
        if(grade>=50 && grade<=60) {
            this.grades.add(grade);
            count5++;
            accepted++;
        }
    }

    public void distribute() {
        String count5return = "5: ";

        for (int i = 0; i < count5; i++) {
            count5return += "*";
        }
        System.out.println(count5return);
        String count4return = "4: ";
        for (int i = 0; i < count4; i++) {
            count4return += "*";
        }

        System.out.println(count4return);
        String count3return = "3: ";
        for (int i = 0; i < count3; i++) {
            count3return += "*";
        }

        System.out.println(count3return);
        String count2return = "2: ";
        for (int i = 0; i < count2; i++) {
            count2return += "*";
        }

        System.out.println(count2return);
        String count1return = "1: ";
        for (int i = 0; i < count1; i++) {
            count1return += "*";
        }

        System.out.println(count1return);
        String count0return = "0: ";
        for (int i = 0; i < count0; i++) {
            count0return += "*";
        }

        System.out.println(count0return);
        System.out.println("!!!!!!!!!!!!!!!!" + this.count5);
    }

    public double acceptance () {
        return (double) 100*this.accepted/(this.accepted + this.count0);
    }
}
