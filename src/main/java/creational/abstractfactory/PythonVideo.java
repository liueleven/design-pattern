package creational.abstractfactory;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 16:40
 * @author: 十一
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
