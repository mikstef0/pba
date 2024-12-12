package pl.edu.zut.pba.lab4.users;

import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.Valid;
import pl.edu.zut.pba.lab04.users.api.model.User;

@Mapper(componentModel ="spring")
public interface UserMapper
{
    UserT toModel(@NotNull @Valid User user);
    User toApi(UserT save);

    default List<User> toApi(List<UserT> users)
    {
        return users.stream().map(this::toApi).collect(Collectors.toList());
    }
}
