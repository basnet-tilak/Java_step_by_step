package step_by_step.UsersRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import step_by_step.model.Users;

@Repository
public interface UsersRepository  extends JpaRepository<Users,Long> {
}
