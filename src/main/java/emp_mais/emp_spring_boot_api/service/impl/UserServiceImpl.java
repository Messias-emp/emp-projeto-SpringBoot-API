package emp_mais.emp_spring_boot_api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import emp_mais.emp_spring_boot_api.domain.model.User;
import emp_mais.emp_spring_boot_api.domain.repository.UserRepository;
import emp_mais.emp_spring_boot_api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Injeção via construtor
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Busca usuário pelo ID ou lança exceção 404
    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    // Cria novo usuário, valida se já existe
    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("This user already exists");
        }
        return userRepository.save(userToCreate);
    }
}
