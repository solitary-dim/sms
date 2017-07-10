package com.xingtai.sms.domain.config;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Solitary.Wang
 * Date: 2017/7/10
 * Time: 20:38
 */
public class EncodingFilter implements Filter {

	

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
			HttpServletRequest request=(HttpServletRequest)req;
			HttpServletResponse response=(HttpServletResponse)resp;
			//处理post请求乱码
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			//处理get请求乱码
			chain.doFilter(new MyRequest(request), response);
			
	}
	
	class MyRequest extends HttpServletRequestWrapper{
		// 装饰设计模式
		HttpServletRequest request;
		public MyRequest(HttpServletRequest request) {
			super(request);
			this.request=request;
		}
		@Override
		public String getParameter(String name) {
			String value=this.request.getParameter(name);
			if(value==null){
				return null;
			}
			//如果是post请求上面已经处理直接返回
			if(!this.request.getMethod().equalsIgnoreCase("get")){
				return value;
			}
			//进行get请求的乱码处理
			try {
				value=new String(value.getBytes("iso-8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
			return value;
		}
		
		
		
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
