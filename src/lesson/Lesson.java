package lesson;

public class Lesson {

    String lessonName;
    int lessonTime;

    public Lesson (String lessonName, int lessonTime){
        this.lessonName = lessonName;
        this.lessonTime = lessonTime;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", lessonTime=" + lessonTime +
                '}';
    }
}
