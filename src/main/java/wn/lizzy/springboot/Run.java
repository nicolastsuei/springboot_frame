package wn.lizzy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.nicolas.spring.SpringUtil;

import wn.lizzy.springboot.servlet.MyServlet1;
/**
 * 
 * Run.java
 * @author cuilj  2017年3月6日--下午2:37:26
 * -java agent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify   ---hot deploy
 * 
 * @SpringBootApplication申明让spring boot自动给程序进行必要的配置，
 * 等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
 */
@SpringBootApplication
//spring能够扫描到我们自己编写的servlet和filter,不然是404。
@ServletComponentScan
//不在Spring Boot的扫描包 方式二
@Import(value={SpringUtil.class})
public class Run 
{
	/**
	 * 不在Spring Boot的扫描包 方式一
	 * 注册Spring Util
     * 这里为了和上一个冲突，所以方面名为：springUtil2
     * 实际中使用springUtil
     */
//    @Bean
//    public SpringUtil springUtil2(){return new SpringUtil();}
    
	/**
     * 注册Servlet.不需要添加注解：@ServletComponentScan
     * @return
     */
    @Bean
    public ServletRegistrationBean MyServlet1(){
           return new ServletRegistrationBean(new MyServlet1(),"/myServlet1/*");
    }
    
    public static void main( String[] args )
    {
    	SpringApplication.run(Run.class, args);
    }
}
