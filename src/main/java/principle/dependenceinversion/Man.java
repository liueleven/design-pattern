package principle.dependenceinversion;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 14:53
 * @author: 十一
 */
public class Man {

//    public void studyJavaCourse() {
//        System.out.println("study java course");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("study python course");

    /**===========如果要学习新的课程，就要往这个类加，不合理================================*/

    public void studyCourse(ICourse course) {
        course.studyCourse();

    }

}
