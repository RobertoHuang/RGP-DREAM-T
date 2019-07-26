/**
 * FileName: ApplicationMockTest
 * Author:   HuangTaiHong
 * Date:     2019/7/26 16:53
 * Description: 
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.growth.process;

import mockit.Injectable;
import mockit.Tested;
import org.junit.Test;

/**
 * 〈〉
 *
 * @author HuangTaiHong
 * @create 2019/7/26
 * @since 1.0.0
 */
public class ApplicationMockTest {
    @Tested
    private Application application;

    @Injectable
    private Application.Student student;

    @Test
    public void testSayHello() {
        application.sayHello();
    }
}