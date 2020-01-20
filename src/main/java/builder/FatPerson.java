package builder;

/**
 * @decription:胖人类
 * @version:1.0
 * @date: 2016年11月7日上午10:15:47
 * @author: lfq
 */
public class FatPerson extends PersonBuilder {

    private Person person = new Person();

    @Override
    public void buildHead() {
        person.add("头");
    }

    @Override
    public void buildBody() {
        person.add("身体1.0");
    }

    @Override
    public void buildArmLeft() {
        person.add("左臂");
    }

    @Override
    public void buildArmRight() {
        person.add("右臂");
    }

    @Override
    public void buildLegLeft() {
        person.add("左腿");
    }

    @Override
    public void buildLegRight() {
        person.add("右腿");
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
