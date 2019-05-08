package com.omar.poc.protobuf;

import com.omar.poc.protobuf.model.UserProtos.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/proto")
public class ProtoBufController {

    @GetMapping(value = "hello")
    public String hello(){
        return getUserFromProtos().toString();
    }

    private User getUserFromProtos() {
        User.Builder user = User.newBuilder();
        user.setEmail("o@g.com");
        user.setName("Omar G.");
        user.setId(1);

        return user.build();
    }

}


