package emp_mais.emp_spring_boot_api.service;

import emp_mais.emp_spring_boot_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
