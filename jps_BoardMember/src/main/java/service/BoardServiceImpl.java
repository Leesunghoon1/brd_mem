package service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import domain.PagingVO;
import repository.BoardDAO;
import repository.BoardDAOIml;

public class BoardServiceImpl implements Service {
	 
	
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	//DAO 객체 생성
	private BoardDAO bdao; //repository -> interface
	
	public BoardServiceImpl() {
		bdao = new BoardDAOIml(); //repository -> class
	}

	@Override
	public int register(BoardVO bvo) {
		log.info("service register check2");
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> getList() {
		log.info("list check 2");
		return bdao.selectList();
	}

	@Override
	public BoardVO getDetail(int bno) {
		log.info("list check 2");
		return bdao.selectOne(bno);
	}

	@Override
	public int modify(BoardVO bvo) {
		log.info("edit check 2");
		return bdao.update(bvo);
	}

	@Override
	public int remove(int bno) {
		log.info("remove check 2");
		return bdao.remove(bno);
	}

	
//	public int getTotalCount() {
//		// TODO Auto-generated method stub
//		return bdao.getTotalCount();
//	}

	@Override
	public List<BoardVO> getPageList(PagingVO pgvo) {
		log.info("pageList check 2");
		return bdao.getPageList(pgvo);
	}

	@Override
	public int getTotalCount(PagingVO pgvo) {
		return bdao.getTotalCount(pgvo);
	}


	
	
}
