package repository;

import java.util.List;

import domain.BoardVO;
import domain.PagingVO;

public interface BoardDAO {

	List<BoardVO> getPageList = null;

	int insert(BoardVO bvo);

	List<BoardVO> selectList();

	BoardVO selectOne(int bno);

	int update(BoardVO bvo);

	int remove(int bno);

	int getTotalCount(PagingVO pgvo);

	List<BoardVO> getPageList(PagingVO pgvo);

}
