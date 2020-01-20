package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @decription:产品类，人类，组装
 * @version:1.0
 * @date: 2016年11月7日上午10:13:53
 * @author: lfq
 */
public class Person {

    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println(parts);
    }
}
