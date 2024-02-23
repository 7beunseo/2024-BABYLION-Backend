package likelion.applicant.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer lionId;
    private String name;
    private String phone;
    private String email;
    private String part;
    private boolean pass;
}
