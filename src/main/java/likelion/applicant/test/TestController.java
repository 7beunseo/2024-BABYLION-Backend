package likelion.applicant.test;

import likelion.applicant.util.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    @GetMapping("/get")
    public ResponseEntity<ApiResponse<?>> getTestController() {
        ApiResponse<Object> successWithoutData = ApiResponse.createSuccessWithoutData(HttpStatus.OK.value(), "GET 요청 테스트 성공");
        return ResponseEntity.status(HttpStatus.OK).body(successWithoutData);
    }
}
