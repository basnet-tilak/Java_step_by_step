package step_by_step.UsersRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import step_by_step.model.Users;

public interface UsersRepository  extends JpaRepository<Users,Long> {

}
