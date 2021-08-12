package com.czj;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 自定义后置处理器
 *
 * @author Zhongjie.Cai
 * @date 2021/8/12 1:09
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用MyBeanFactoryPostProcessor的postProcessBeanFactory");
		BeanDefinition bd = beanFactory.getBeanDefinition("user");
		System.out.println("----------属性名称---------");
		System.out.println(System.getProperty("file.encoding"));
		MutablePropertyValues pv = bd.getPropertyValues();
		pv.addPropertyValue("id", 2);
		pv.addPropertyValue("name", "modify");
		bd.setScope(BeanDefinition.SCOPE_SINGLETON);
	}
}
