package principle.openclose;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 12:11
 * @author: 十一
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }


}
