package sandipchitale.twowaytlsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TwowaytlsserverApplication {

	@RestController
	public static class IndexController {
		@GetMapping("/")
		public String index() {
			return "Hello from Server!";
		}
	}

//	@Component
//	public static class CPPP extends ConfigurationPropertiesBindingPostProcessor {
//
//		private ApplicationContext applicationContext;
//
//		@Override
//		public void setApplicationContext(ApplicationContext applicationContext) {
//			super.setApplicationContext(applicationContext);
//			this.applicationContext = applicationContext;
//		}
//
//		@Override
//		public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//			// Only if this is ConfigurationProperties bean
//			if (ConfigurationPropertiesBean.get(applicationContext, bean, beanName) != null) {
//				if (bean instanceof ServerProperties serverProperties) {
//					return bean;
//				}
//			}
//			return super.postProcessAfterInitialization(bean, beanName);
//		}
//	}

	public static void main(String[] args) {
		SpringApplication.run(TwowaytlsserverApplication.class, args);
	}

}
