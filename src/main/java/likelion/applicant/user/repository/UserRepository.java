package likelion.applicant.user.repository;

import likelion.applicant.user.dto.UserDto;
import likelion.applicant.user.entity.Babylion;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final UserRepositoryInterface userRepositoryInterface;

    public UserRepository(
            @Autowired UserRepositoryInterface userRepositoryInterface
    ) {
        this.userRepositoryInterface= userRepositoryInterface;
    }

    public UserDto userCheck(String name, String phone, String email) {
        Babylion babylion = userRepositoryInterface.findByNameAndEmailAndPhone(name, email, phone);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(babylion, userDto);
        return userDto;
    }
}
