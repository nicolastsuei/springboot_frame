package wn.lizzy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/**
 * 
 * Run.java
 * @author cuilj  2017年3月6日--下午2:37:26
 *
 */
//spring能够扫描到我们自己编写的servlet和filter,不然是404。
@ServletComponentScan
@SpringBootApplication
public class Run 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Run.class, args);
    }
}
