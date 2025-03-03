package DIO.Config;

import DIO.Model.User;
import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.util.Date;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "seuSegredoSuperSecreto1234567890123456"; // Chave com pelo menos 32 caracteres

    private final SecretKey key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes()); // Não decodifica em Base64

    public String generateToken(User user) {
        return Jwts.builder()
                .subject(user.getEmail()) // `.subject()` substitui `setSubject()`
                .issuedAt(new Date()) // `.issuedAt()` substitui `setIssuedAt()`
                .expiration(new Date(System.currentTimeMillis() + 86400000)) // `.expiration()` substitui `setExpiration()`
                .signWith(key) // `.signWith(SecretKey)` agora é obrigatório
                .compact();
    }
}
