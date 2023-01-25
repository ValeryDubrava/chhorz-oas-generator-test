package software.winwin.oastest.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class MainController {
    /**
     * This is a root action HelloWorld.
     * @return 200 Hello world anyway.
     */
    @GetMapping
    public EntityResponse<String> hello() {
        return EntityResponse.fromObject("hello").build();
    }
}
