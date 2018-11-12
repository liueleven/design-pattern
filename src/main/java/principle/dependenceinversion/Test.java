package principle.dependenceinversion;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 14:53
 * @author: 十一
 */
public class Test {

    // 方式1
//    public static void main(String[] args) {
//        Man man = new Man();
//        man.studyJavaCourse();
//        man.studyPythonCourse();
//    }

    //方式2
    public static void main(String[] args) {
        Man man = new Man();
        man.studyCourse(new JavaCourse());
        man.studyCourse(new PythonCourse());
    }
}
