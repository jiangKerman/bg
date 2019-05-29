package cqjtu.bg.dal;

import cqjtu.bg.dal.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepo extends JpaRepository<Content,Integer> {
}
