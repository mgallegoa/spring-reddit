package com.manuel.reddit.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
public class PostTest {
    static Validator validator;

    @BeforeTestClass
    public static void setUpValidatorInstance() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void validateThePostName() {
        Post post = new Post();
        post.setPostName(null);
        Set<ConstraintViolation<Post>> violations = validator.validate(post);

        //assertThat(violations.size()).isEqualTo(1);
    }
}
