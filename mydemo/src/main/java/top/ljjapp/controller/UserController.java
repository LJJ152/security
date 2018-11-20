package top.ljjapp.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.ljjapp.dto.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @JsonView(User.UserSimpleView.class)
    public List<User> query(@RequestParam String username,
                            @PageableDefault(page = 2, size = 15, sort = "username,desc") Pageable pageable){
        List<User> userList = new ArrayList<>();
        userList.add(new User());
        userList.add(new User());
        userList.add(new User());
        log.info(String.valueOf(pageable.getPageNumber()));
        log.info(String.valueOf(pageable.getPageSize()));
        log.info(String.valueOf(pageable.getSort()));
        return userList;
    }
}
