package decorator;

/**
 * @decription:具体装饰类 要装饰的类Person 增加装饰只需要该类提供一个接口（show）,面向接口装饰 增加装饰不会给要装饰的类修改或增加代码
 * @version: 1.1
 * @date: 2016年10月20日下午8:12:05
 * @author: lfq
 */
public class Person implements PersonShow {

    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(this.name + "的装扮：");
    }
}
