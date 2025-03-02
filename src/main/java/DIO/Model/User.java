package DIO.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_user")
@Inheritance(strategy = InheritanceType.JOINED) // Herança no JPA
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}

enum UserRole {
    USER, ADMIN
}

