package top.ljjapp.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
public class User {

    public interface UserSimpleView {};
    public interface UserDetailView extends UserSimpleView {};

    private String username;

    private String password;

    @JsonView(UserSimpleView.class)
    public String getUsename(){
        return username;
    }
}
