package x.mvmn.permock.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import x.mvmn.permock.persistence.entity.RuleEntity;

@Repository
public interface RuleRepository extends JpaRepository<RuleEntity, Long> {

}
