package lh.h.repository;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lh.h.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    /* 게시글 작성 title 필수 작성 */
    Page<Board> findByTitleContaining(@NotBlank(message = "제목은 필수 항목입니다.")  String searchKeyword, Pageable pageable);

}
