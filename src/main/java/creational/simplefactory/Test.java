package creational.simplefactory;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 10:17
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {

        //方式1
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.produce("java");
//        video.produce();

        // 方式2
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.produce(JavaVideo.class);
        video.produce();
    }
}
