package kr.dodie.board.domain.repository;

import kr.dodie.board.domain.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}