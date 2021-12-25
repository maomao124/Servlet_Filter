package mao.servlet_filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Project name(项目名称)：Servlet_Filter
 * Package(包名): mao.servlet_filter
 * Class(类名): MyFilter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/25
 * Time(创建时间)： 12:40
 * Version(版本): 1.0
 * Description(描述)： 返回值类型	方法	功能描述
 * void	init (FilterConfig filterConfig)	该方法用于初始化过滤器。
 * void	doFilter(ServletRequest request,SeivletResponse response, FilterChain chain)	该方法完成实际的过滤操作，
 * 当客户端请求的 URL 与过滤器映射的 URL 匹配时，容器会先调用该方法对请求进行拦截。
 * 参数 request 和 response 表示请求和响应对象。
 * 参数 chain 代表当前 Filter 链对象，在该方法内部，调用 chain.doFilter() 方法，才能把请求交付给 Filter 链中的下一个 Filter 或者 Web 资源。
 * void	destroy()	该方法在销毁 Filter 对象之前被调用，用于释放被 Filter 对象占用的资源。
 * Filter 的生命周期
 * Filter 的生命周期分为 3 个阶段：
 * 初始化阶段
 * 拦截和过滤阶段
 * 销毁阶段
 * 1. 初始化阶段
 * Servlet 容器负责加载和实例化 Filter。容器启动时，读取 web.xml 或 @WebFilter 的配置信息对所有的过滤器进行加载和实例化。
 *
 * 加载和实例化完成后，Servlet 容器调用 init() 方法初始化 Filter 实例。在 Filter 的生命周期内， init() 方法只执行一次。
 * 2. 拦截和过滤阶段
 * 该阶段是 Filter 生命周期中最重要的阶段。当客户端请求访问 Web 资源时，Servlet 容器会根据 web.xml 或 @WebFilter 的过滤规则进行检查。
 * 当客户端请求的 URL 与过滤器映射匹配时，容器将该请求的request对象、response对象以及FilterChain对象以参数的形式传递给Filter的doFilter()方法，
 * 并调用该方法对请求/响应进行拦截和过滤。
 * 3. 销毁阶段
 * Filter 对象创建后会驻留在内存中，直到容器关闭或应用被移除时销毁。销毁 Filter 对象之前，容器会先调用 destory() 方法，释放过滤器占用的资源。
 * 在 Filter 的生命周期内，destory() 只执行一次。
 * 属性名	类型	描述
 * filterName	String	指定过滤器的 name 属性，等价于 <filter-name>。
 * urlPatterns	String[]	指定过滤器的 URL 匹配模式。等价于 <url-pattern> 标签。
 * value	String[]	该属性等价于 urlPatterns 属性，但是两者不能同时使用。
 * servletNames	String[]	指定过滤器将应用于哪些 Servlet。取值是 @WebServlet 中 filterName 属性的取值，或者 web.xml 中 <servlet-name> 的取值。
 * dispatcherTypes	DispatcherType	指定过滤器拦截的资源被 Servlet 容器调用的方式。具体取值包括： ASYNC、ERROR、FORWARD、INCLUDE、REQUEST。
 * initParams	WebInitParam[]	指定一组过滤器初始化参数，等价于 <init-param> 标签。
 * asyncSupported	boolean	声明过滤器是否支持异步操作模式，等价于 <async-supported> 标签。
 * description	String	指定过滤器的描述信息，等价于 <description> 标签。
 * displayName	String	指定过滤器的显示名，等价于 <display-name> 标签。
 */

@WebFilter(
        dispatcherTypes = {
                DispatcherType.REQUEST,
                DispatcherType.FORWARD,
                DispatcherType.INCLUDE,
                DispatcherType.ERROR
        },
        asyncSupported = true,
        description = "过滤器4",
        urlPatterns = {"/login"},
        initParams = {
                @WebInitParam(name = "name", value = "1", description = "name的描述")
        },
        servletNames = {"SuccessServlet"})
public class MyFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException
    {

    }


}
