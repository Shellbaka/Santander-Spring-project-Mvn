package DIO.Services;

import DIO.Model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import DIO.Repository.UserRepository;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User salvarUsuario(User user) {
        return userRepository.save(user);
    }

    public Optional<User> buscarPorEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
