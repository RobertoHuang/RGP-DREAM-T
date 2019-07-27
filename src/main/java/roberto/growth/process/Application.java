/**
 * FileName: Application
 * Author:   HuangTaiHong
 * Date:     2019/7/26 16:28
 * Description: Application.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process;

/**
 * 〈Application.〉
 *
 * @author HuangTaiHong
 * @create 2019/7/26
 * @since 1.0.0
 */
public class Application {
    private Student student;

    public void sayHello() {
        System.out.println("Hello %s.");
    }

    public static class Student {
        public String name;
        public String password;

        public Student() {

        }

        public Student(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}