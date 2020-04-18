package repositories;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.Repository;
import domain.UserEntity;

@Repository(forEntity = UserEntity.class)
public abstract class UserRepository extends AbstractEntityRepository<UserEntity, Long> {

}
