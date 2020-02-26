package com.cycfc.borrow;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

/**
 * 功能描述: <br>
 * 自动生成实体类功能，通过配置mybatis-generator.xml需要生成的表名字
 * 来生成对应的实体类，会将实体类放在xml指定的文件夹下面
 * 方便实体类的使用
 * @param
 * @return
 * @author shi de tao
 * @date 2019/11/8 21:43
 */
public class CreateMapper {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
       int a = Integer.valueOf(null);
        System.out.println(a);

        /* List<String> warnings = new ArrayList<>();
        //File configFile = new File("D:\\wwt\\cy\\code\\borrow-front\\borrow_generator\\src\\main\\resources\\mybatis-generator.xml");
       File configFile = ResourceUtils.getFile("classpath:mybatis-generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        System.out.println("表对应的mapper和pojo生成完成！23234234");
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("表对应的mapper和pojo生成完成！");*/
    }
}
