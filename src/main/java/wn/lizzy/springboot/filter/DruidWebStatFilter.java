package wn.lizzy.springboot.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid过滤器.
 * WebStatFilter.java
 * @author cuilj  2017年3月6日--下午5:13:22
 *
 */
public class DruidWebStatFilter {
	@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",initParams={
			@WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
	})

	public class DruidStatFilter extends DruidWebStatFilter{
	}
}
