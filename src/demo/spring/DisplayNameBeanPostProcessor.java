package demo.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String name)
			throws BeansException {
		System.out.println("In postProcessAfterInitialization method. Bean: " + name);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name)
			throws BeansException {
		System.out.println("In postProcessBeforeInitialization method. Bean: " + name);
		return bean;
	}

}
