package org.batis.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

/**
 * 获取response request
 * @author joshua
 * @date 2014-8-1
 * @version
 */
public class RequestResponseContext {

	/*private static ThreadLocal<HttpServletRequest> request_threadLocal = new ThreadLocal<HttpServletRequest>();
 
    private static ThreadLocal<HttpServletResponse> reponse_threadLocal = new ThreadLocal<HttpServletResponse>();
    
    public static void setRequest(HttpServletRequest request) {
        request_threadLocal.set(request);
    }
 
    public static HttpServletRequest getRequest() {
        return request_threadLocal.get();
    }
 
    public static void removeRequest() {
        request_threadLocal.remove();
    }
 
    public static void setResponse(HttpServletResponse response) {
        reponse_threadLocal.set(response);
    }
 
    public static HttpServletResponse getResponse() {
        return reponse_threadLocal.get();
    }
 
    public static void removeResponse() {
        reponse_threadLocal.remove();
    }*/
	
	public static HttpServletRequest getRequest() {
		Message message = (Message) PhaseInterceptorChain.getCurrentMessage();
		HttpServletRequest request = (HttpServletRequest)message.get(AbstractHTTPDestination.HTTP_REQUEST);
		return request;
	}
	
	public static HttpServletResponse getResponse() {
		Message message = (Message) PhaseInterceptorChain.getCurrentMessage();
		HttpServletResponse response = (HttpServletResponse)message.get(AbstractHTTPDestination.HTTP_RESPONSE);
		return response;
	}
}
