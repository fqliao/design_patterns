package builder;

/**
 * @decription:建造者指挥类
 * @version:1.0
 * @date: 2016年11月7日上午10:21:08
 * @author: lfq
 */
public class DirectPerson {

    public static void build(PersonBuilder builder) {
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegRight();
        builder.buildLegRight();
    }
}
