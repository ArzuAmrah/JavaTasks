package lesson39;

public class Main {

    String lessonName;
    int lessonTime;

    public Main(String lessonName, int lessonTime){
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
