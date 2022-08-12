package per.wsk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//Spring的容器不扫描controller;父容器
@ComponentScan(value="per.wsk",excludeFilters={
        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class})
})
public class RootConfig {

}