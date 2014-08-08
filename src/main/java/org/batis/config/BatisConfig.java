package org.batis.config;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.cxf.jaxrs.provider.RequestDispatcherProvider;
import org.batis.entity.User;
import org.batis.resource.PetsResource;
import org.batis.util.fb.FBConnectFactory;
import org.batis.util.fb.FBSimpleConnectionSignUp;
import org.batis.util.fb.SecurityContext;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

/**
 * 配置文件
 * @author joshua
 * @date 2014-7-29
 * @version
 */
@Configuration
public class BatisConfig {

	@Inject
	private Environment environment;
	
	@Inject
	private DataSource dataSource;
	
	/**
	 * 返回json(注:bean的名字是根据方法名生成的)
	 * @return
	 */
	@Bean
	public JacksonJsonProvider jacksonJsonProvider() {
		return new JacksonJsonProvider();
	}
	
	/**
	 * 宠物API
	 * @return
	 */
	@Bean
	public PetsResource petsResource() {
		return new PetsResource();
	}
	
	/**
	 * 宠物列表视图
	 * @return
	 */
	@Bean
	public RequestDispatcherProvider petViewDispatchProvider() { 
		RequestDispatcherProvider dispatcherProvider = new RequestDispatcherProvider();
		dispatcherProvider.setResourcePath("/pet_list.jsp");
		return dispatcherProvider;
	}
	
	/**
	 * facebook connectionFactory
	 * @return
	 */
	@Bean
	public FBConnectFactory fbConnectFactory() {
		return new FBConnectFactory();
	}

	@Bean
	public ConnectionFactoryLocator connectionFactoryLocator() {
	    ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
	    registry.addConnectionFactory(new FacebookConnectionFactory("315997611908699",
	        "b82fe20b01317e7ff21106bfe789239d"));
	    return registry;
	}
	
	@Bean
	public UsersConnectionRepository usersConnectionRepository() {
	    JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource, 
	        connectionFactoryLocator(), Encryptors.noOpText());
	    repository.setTablePrefix("t_social");
	    repository.setConnectionSignUp(new FBSimpleConnectionSignUp());
	    return repository;
	}
	
	@Bean
	/*@Scope(value="request", proxyMode=ScopedProxyMode.INTERFACES)*/
	public ConnectionRepository connectionRepository() {
	    User user = SecurityContext.getCurrentUser();
	    return usersConnectionRepository().createConnectionRepository(String.valueOf(user.getId()));
	}
	
	@Bean
	/*@Scope(value="request", proxyMode=ScopedProxyMode.INTERFACES)   */
	public Facebook facebook() {
	    return connectionRepository().getPrimaryConnection(Facebook.class).getApi();
	}
}
