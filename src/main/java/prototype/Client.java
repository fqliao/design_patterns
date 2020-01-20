package prototype;

/**
 * @decription:原型设计模式：获得对象，功能类似于工厂模式 客户端只要创建一份对象，而后的可以不断复制，不用在 new了（new的工作交给服务端了）
 *     引用类型要重写clone方法，并且创建新对象，设置旧对象数据给新对象（复制），然后返回
 *     只new一个简历类即可，简历类中的引用，引用的引用对象，一般不可改变对象等，都直接更改数据即可，不用new
 * @version:1.0
 * @date: 2016年10月25日上午10:41:20
 * @author: lfq
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 简历原型
        Resume resume =
                new Resume(
                        "bob", 24, new Experience("2000-2004", new Company("alibaba", "HangZhou")));

        // 复制一份简历，修改下名字和工作经历
        Resume resumea = (Resume) resume.clone(); // 复制一份简历
        resumea.setName("alice"); // 修改名字
        Experience exp = resumea.getExp(); // 获得工作经历对象
        exp.setCompany("alibaba", "Beijing"); // 修改公司
        resumea.setExp("2001-2005", exp.getCompany()); // 修改时间，完成工作经历修改

        // 复制一份简历，修改下年龄和工作经历
        Resume resumeb = (Resume) resume.clone(); // 复制一份简历
        resumeb.setAge(25); // 修改年龄
        Experience expb = resumeb.getExp(); // 获得工作经历对象
        expb.setCompany("alibaba", "TaiWang");
        resumeb.setExp("2002-2006", expb.getCompany()); // 修改时间，完成工作工作经历修改

        // 复制一份简历，不修改
        Resume resumec = (Resume) resume.clone();

        System.out.println(resume.getName() + " " + resume.getAge() + " " + resume.getExp());
        System.out.println(resumea.getName() + " " + resumea.getAge() + " " + resumea.getExp());
        System.out.println(resumeb.getName() + " " + resumeb.getAge() + " " + resumeb.getExp());
        System.out.println(resumec.getName() + " " + resumec.getAge() + " " + resumec.getExp());
    }
}
