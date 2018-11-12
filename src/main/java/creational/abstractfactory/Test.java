package creational.abstractfactory;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 17:00
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        video.produce();
        article.produce();
    }
}
