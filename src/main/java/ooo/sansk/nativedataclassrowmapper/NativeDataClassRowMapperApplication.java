package ooo.sansk.nativedataclassrowmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.DataClassRowMapper;

@SpringBootApplication
public class NativeDataClassRowMapperApplication {
    public static void main(String[] args) {
        DataClassRowMapper.newInstance(Example.class);
        SpringApplication.run(NativeDataClassRowMapperApplication.class, args);
    }

    public record Example(String foo) {

    }
}
