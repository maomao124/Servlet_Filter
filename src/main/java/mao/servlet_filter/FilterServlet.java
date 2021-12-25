package mao.servlet_filter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project name(项目名称)：Servlet_Filter
 * Package(包名): mao.servlet_filter
 * Class(类名): FilterServlet
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/25
 * Time(创建时间)： 12:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@WebServlet("/FilterServlet")
public class FilterServlet extends HttpServlet
{
    public FilterServlet()
    {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //设置向页面输出的格式与编码
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("<h3>FilterServlet访问成功</h3>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }
}
