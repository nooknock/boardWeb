package com.springbook.biz.board;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

//DAO(data access object)
@Repository
public class BoardDAOSpring extends JdbcDaoSupport{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	//sql ��ɾ��
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from board),?,?,?)";
//	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values(?,?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";

	//getJdbcTemplate() �޼ҵ尡 JdbcTemplate ��ü�� �����Ϸ��� �����ͼҽ� ��ü�� �־�� �ϹǷ� JdbcDaoSupport�� �θ� �޼ҵ带 ȣ���Ͽ� ������ �ҽ� ��ü�� ������ ����
	//�ַ� �������� �����Ͽ��µ� �޼��� ���� �����ص� �����Ѵ�. �޼ҵ� ���� ���̸� �ش� �޼ҵ带 ������ �����̳ʰ� �ڵ����� ȣ��, �� �� �޼ҵ� �Ű����� Ÿ��(�����ͼҽ�)�� Ȯ���ϰ� �ش� Ÿ���� ��ü�� �޸𸮿� �����ϸ� �� ��ü�� ���ڷ� �Ѱ��ش�.
	@Autowired
	public void setSuperDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	// CRUD ����� �޼ҵ� ����
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC�� insertBoard() ��� ó��");
		jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
	}

	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC�� updateBoard() ��� ó��");
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}

	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC�� deleteBoard() ��� ó��");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}

	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC�� getBoard() ��� ó��");
		Object[] args = { vo.getSeq() };
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}

	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Spring JDBC�� getBoardList() ��� ó��");
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	}

}
