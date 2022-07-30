package per.wsk.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import per.wsk.bean.Person;
import per.wsk.service.BookService;

//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类

@ComponentScans(
        value = {
                @ComponentScan(value="per.wsk",includeFilters = {
					@ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
						@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class})
//                        ,@ComponentScan.Filter(type= FilterType.CUSTOM,classes={MyTypeFilter.class})
                },useDefaultFilters = false) //需要把useDefaultFilters是否用默认的过滤规则改为false,includeFilters和excludeFilters才能生效
        }
)
//@ComponentScan("per.wsk")  //value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

    //给容器中注册一个Bean;类型为返回值的类型，bean的id默认是用方法名作为bean的id，也可以在@Bean后面的value属性中指定bean的id
    @Bean("person")
    public Person person01(){
        return new Person("lisi", 20);
    }

}
