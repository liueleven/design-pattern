package creational.simplefactory;

/**
 * @description: 简单工厂，缺点，如果现在要加php，node...就要不断的加if判断才可以完成功能
 * @date: 2018-11-11 10:18
 * @author: 十一
 */
public class VideoFactory {

    /**
     * 方式2 利用反射弥补简单工厂的不足
     * @param clazz
     * @return
     */
    public Video produce(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
    /**
     * 方式1
     */
    public Video produce(String type) {

        if("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
