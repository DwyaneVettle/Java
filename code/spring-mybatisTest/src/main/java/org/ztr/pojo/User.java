package org.ztr.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description
 * @Author Michealzou@126.com
 * @Date 2026/3/17 17:25
 **/
@Data
@TableName("user")
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
