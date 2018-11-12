package principle.singleresponsibiliy;

/**
 * @description: java 课程实现课程接口，可以实现不同的接口
 * @date: 2018-11-11 15:29
 * @author: 十一
 */
public class JavaCourse implements ICourceContent,ICourceOperation{


    public String getName() {
        return "Java 课程";
    }

    public Integer getId() {
        return 232;
    }

    public void buy() {
        System.out.println("购买课程");
    }

    public void study() {
        System.out.println("学习课程");
    }
}
