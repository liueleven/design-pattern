package principle.demeter;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 16:16
 * @author: 十一
 */
public class Boss {

    public void commandCheckCourseNum(TeamLeader teamLeader) {
        teamLeader.checkCourseNum();
    }
}
