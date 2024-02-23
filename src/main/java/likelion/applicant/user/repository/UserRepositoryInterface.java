package likelion.applicant.user.repository;

import likelion.applicant.user.entity.Babylion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepositoryInterface extends CrudRepository<Babylion, Integer> {
 public Babylion findByNameAndEmailAndPhone(String name, String email, String phone);
}
