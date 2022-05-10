package io.github.yyd.cloud.licensingservice;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;

/**
 * @author yangyidian
 * @date 2022/04/30
 **/
public class AutoGenerator {

    public static void main(String[] args) {
        String modulePath = "./licensingservice";
        String parentPackageName = "io.github.yyd.cloud.licensingservice";

        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/hippo?characterEncoding=UTF-8", "root", "mysqlmysql")
            .globalConfig(builder -> {
                builder
                    .outputDir(modulePath + "/src/main/java")
                    .author("yyd")
                    .dateType(DateType.TIME_PACK)
                    .commentDate("yyyy-MM-dd");
            })
            .packageConfig(builder -> {
                builder.parent(parentPackageName)
                    .entity("entity")
                    .service("service")
                    .serviceImpl("service.impl")
                    .mapper("mapper")
                    .controller("controller")
                    .pathInfo(Collections.singletonMap(OutputFile.xml, modulePath + "/src/main/resources/mapper"));
            })
            .strategyConfig(builder -> {
                builder.addInclude("user")
                    .controllerBuilder()
                    .enableRestStyle()
                    .entityBuilder()
                    .enableLombok()
                    .fileOverride();
            })
            .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
            .execute();
    }

}
