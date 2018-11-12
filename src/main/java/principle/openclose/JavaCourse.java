package principle.openclose;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 11:51
 * @author: 十一
 */
public class JavaCourse implements ICourse {

    private Integer id;

    private String name;

    private Double price;


    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "ID=" + id +
                ", 名称='" + name + '\'' +
                ", 价格=" + price +
                '}';
    }
}
