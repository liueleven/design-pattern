package principle.openclose;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 11:53
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
//        ICourse iCourse = new JavaCourse(1,"设计模式",299d);
//        System.out.println(iCourse.toString());

        ICourse iCourse = new JavaDiscountCourse(1,"设计模式",299d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) iCourse;
        System.out.println(String.format("ID: %s,名称：%s, 折扣价格：%s, 原价：%s",discountCourse.getId(),
                discountCourse.getName(),discountCourse.getDiscountPrice(),discountCourse.getPrice()));


    }
}
