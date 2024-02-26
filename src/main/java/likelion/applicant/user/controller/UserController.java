package likelion.applicant.user.controller;


import likelion.applicant.user.dto.UserDto;
import likelion.applicant.user.dto.UesrReqDto;
import likelion.applicant.user.entity.Babylion;
import likelion.applicant.user.repository.UserRepository;
import likelion.applicant.user.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/babylion")
public class UserController {
    private final UserRepository userRepository;

    public UserController (@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("")
    public void userHome() {
        //엥 없네
    }

    @PostMapping("/check")
    public UserDto userCheck(@RequestBody UesrReqDto userReqDto) {
        return userRepository.userCheck(userReqDto.getName(), userReqDto.getPhone(), userReqDto.getEmail());
    }

}
