package FinalReview;

import java.util.ArrayList;
import java.util.Collections;

public class CollegeStudentTester {
    public static void main(String[] args) {
        CollegeStudent stan = new CollegeStudent(900121212,"Stan", "Soft-Dev", 19);
        CollegeStudent connor = stan.clone();

        connor.setName("Connor");
        connor.setStuID(1);

        CollegeStudent terrance = connor.clone();
        terrance.setName("Terrance");
        terrance.setStuID(5);


        ArrayList<CollegeStudent> list = new ArrayList<>();
        list.add(terrance);
        list.add(stan);
        list.add(connor);

        for(CollegeStudent student : list){
            System.out.println(student);
        }

        Collections.sort(list);
        System.out.println();
        for(CollegeStudent student : list){
            System.out.println(student);
        }
    }

}
