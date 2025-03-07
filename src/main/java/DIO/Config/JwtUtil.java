package DIO.Config;

import DIO.Model.User;
import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.security.Keys;

import java.util.Date;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "seuSegredoSuperSecreto1234567890123456";

    private final SecretKey key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public String generateToken(User user) {
        return Jwts.builder()
                .subject(user.getName())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(key)
                .compact();
    }
}
