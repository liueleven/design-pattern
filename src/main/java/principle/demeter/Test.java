package principle.demeter;

/**
 * @description: 一定要写注释啊
 * @date: 2018-11-11 16:19
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandCheckCourseNum(new TeamLeader());
    }
}
