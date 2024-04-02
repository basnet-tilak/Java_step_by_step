package step_by_step.UsersRepository;

import step_by_step.model.Users;

public interface UserDetails {
    public Users getUsersByUsername(String username);
}
