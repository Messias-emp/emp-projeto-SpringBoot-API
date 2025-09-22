package emp_mais.emp_spring_boot_api.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import emp_mais.emp_spring_boot_api.domain.model.User;
import emp_mais.emp_spring_boot_api.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // Injeção de dependência pelo construtor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET /users/{id} -> busca usuário pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    // POST /users -> cria novo usuário
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User userToCreate) {
        var userCreated = userService.create(userToCreate);

        // Cria URI do recurso criado: /users/{id}
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();

        return ResponseEntity.created(location).body(userCreated);
    }
}