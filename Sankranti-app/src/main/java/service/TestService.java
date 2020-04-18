package service;


import javax.inject.Inject;
import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import domain.UserEntity;
import repositories.UserRepository;

public class TestService {
	private static CdiContainer cdiContainer;
	@Inject
	private static UserRepository userRepository;

	public void show() {
		cdiContainer = CdiContainerLoader.getCdiContainer();
		cdiContainer.boot();
		UserEntity userEntity = new UserEntity("kapil","jaiswal","kap0802","kapil009","kapil@gmail.com","kapil009","8359030051","male","dwarka nagar");
		userRepository.saveAndFlush(userEntity);
		
		/*List<UserEntity> list = userRepository.findAll();
		
		for (UserEntity userEntit : list) {
			System.out.println("userEntity " + userEntit.toString());
		}*/
		//cdiContainer.shutdown();
	}
}
