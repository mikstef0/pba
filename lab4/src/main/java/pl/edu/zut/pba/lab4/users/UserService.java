package pl.edu.zut.pba.lab4.users;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService
{
    private final UserRepository userRepository;

    public UserT createOrUpdate(UserT userT)
    {
        return userRepository.save(userT);
    }

    public UserT createOrUpdate(UUID id, UserT userT)
    {
        userT.setId(id);
        return userRepository.save(userT);
    }

    public void remove(UUID id)
    {
        userRepository.deleteById(id);
    }
    public List<UserT> getAll()
    {
        return userRepository.findAll();
    }
    public UserT getOne(UUID id)
    {
        return userRepository.getReferenceById(id);
    }
}
