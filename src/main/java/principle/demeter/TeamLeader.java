package principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 16:17
 * @author: 十一
 */
public class TeamLeader {

    public void checkCourseNum() {
        List<Course> courses = new ArrayList<Course>();
        for(int i=0; i<10; i++) {
            courses.add(new Course());
        }
        System.out.println(String.format("课程数量：%s",courses.size()));
    }
}
