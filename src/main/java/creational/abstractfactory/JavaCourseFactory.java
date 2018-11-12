package creational.abstractfactory;


/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 16:39
 * @author: 十一
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }


}
