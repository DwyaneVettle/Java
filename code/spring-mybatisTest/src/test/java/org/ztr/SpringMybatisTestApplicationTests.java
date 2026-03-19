package org.ztr;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.ztr.mapper.UserMapper;
import org.ztr.pojo.User;

import java.util.List;

@SpringBootTest
class SpringMybatisTestApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
       float f1 = 0.1f;
       float f2 = 0.2f;
       float result = f1 * f2;
        System.out.println(result);
    }

}
