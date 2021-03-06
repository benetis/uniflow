package dev.zygimantas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final UserRepository repository;

    @Autowired
    public DatabaseLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new User("admin@ktu.mail"));
        this.repository.save(new User("zygis@ktu.admin"));
        this.repository.save(new User("admin@google.lt"));
        this.repository.save(new User("google@admin.lt"));
    }
}
