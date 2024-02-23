package likelion.applicant.user.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name="Babylion")
public class Babylion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lion_id")
    private Integer lionId;

    @Column(name = "name")//, nullable = false) //일단 빼둠
    private String name; // 이름

    @Column(name = "phone")//, nullable = false)
    private String phone; // 휴대폰 번호

    @Column(name = "email")//, nullable = false)
    private String email; // 이메일

    @Column(name = "part")
    private String part; // 지원 분야

    @Column(name = "pass")
    private boolean pass; //합 불합 여부

}
