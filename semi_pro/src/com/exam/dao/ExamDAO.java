package com.exam.dao;

import java.sql.ResultSet;

import com.conn.db.DBConn;
import com.exam.vo.ExamVO;

public class ExamDAO {
	private DBConn db;
	
	public ExamDAO() {
		try {
			db = new DBConn("localhost", "1521", "XEPDB1", "puser1", "puser1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원가입
	public boolean register(ExamVO data) {
		String query = String.format(
				"INSERT INTO exam_scores VALUES('%s', '%s', '%s', %d, null, null, null, null, null, null, null, null, null)"
				, data.getUserid()
				, data.getUserpw()
				, data.getName()
				, data.getAge()
				, data.getTestcode()
				, data.getLocation()
				, data.getSchool()
				, data.getSwdesign()
				, data.getSwdev()
				, data.getDbutil()
				, data.getPlutil()
				, data.getInfomgt()
				, data.getAvgscore()
				);
		try {
			int rs = db.sendInsertQuery(query);
			if(rs == 1) {
				db.commit();
				return true;
			}
			db.rollback();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 비밀번호 변경
	public boolean update(ExamVO data) {
		String query = String.format(
				"UPDATE exam_scores SET USERPW = '%s' WHERE USERID = '%s'"
				, data.getUserpw()
				, data.getUserid());
		try {
			int rs = db.sendUpdateQuery(query);
			if(rs == 1) {
				db.commit();
				return true;
			}
			db.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 회원탈퇴
	public boolean signout(ExamVO data) {
		String query = String.format(
				"DELETE FROM exam_scores WHERE USERID = '%s'"
				, data.getUserid());
		try {
			int rs = db.sendDeleteQuery(query);
			if(rs == 1) {
				db.commit();
				return true;
			}
			db.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 아이디 중복검사
	public ExamVO get(String userid) {
		String query = String.format("SELECT * FROM exam_scores WHERE USERID = '%s'", userid);
		try {
			ResultSet rs = db.sendSelectQuery(query);
			if(rs.next()) {
				ExamVO data = new ExamVO();
				data.setUserid(rs.getString("userid"));
				data.setUserpw(rs.getString("userpw"));
				data.setName(rs.getString("name"));
				data.setAge(rs.getInt("age"));
				data.setTestcode(rs.getInt("testcode"));
				data.setLocation(rs.getString("location"));
				data.setSchool(rs.getString("school"));
				data.setSwdesign(rs.getInt("swdesign"));
				data.setSwdev(rs.getInt("swdev"));
				data.setDbutil(rs.getInt("dbutil"));
				data.setPlutil(rs.getInt("plutil"));
				data.setInfomgt(rs.getInt("infomgt"));
				data.setAvgscore(rs.getInt("avgscore"));
				return data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 점수 입력
	public boolean scoreupdate(ExamVO score) {
		String query = String.format(
				"UPDATE exam_scores SET SWDESIGN = %d, SWDEV = %d, DBUTIL = %d, PLUTIL = %d, INFOMGT = %d, AVGSCORE = %d WHERE USERID = '%s'"
				, score.getSwdesign()
				, score.getSwdev()
				, score.getDbutil()
				, score.getPlutil()
				, score.getInfomgt()
				, score.getAvgscore()
				, score.getUserid());
		try {
			int rs = db.sendUpdateQuery(query);
			if(rs == 1) {
				db.commit();
				return true;
			}
			db.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 장소 입력
	public boolean locationupdate(ExamVO location) {
		String query = String.format(
				"UPDATE exam_scores SET LOCATION = '%s' WHERE USERID = '%s'"
				, location.getLocation()
				, location.getUserid());
		try {
			int rs = db.sendUpdateQuery(query);
			if(rs == 1) {
				db.commit();
				return true;
			}
			db.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 학교 입력
	public boolean schoolnupdate(ExamVO location) {
		String query = String.format(
				"UPDATE exam_scores SET SCHOOL = '%s' WHERE USERID = '%s'"
				, location.getSchool()
				, location.getUserid());
		try {
			int rs = db.sendUpdateQuery(query);
			if(rs == 1) {
				db.commit();
				return true;
			}
			db.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 수험번호 입력
	public boolean testcode(ExamVO code) {
		String query = String.format(
				"UPDATE exam_scores SET TESTCODE = %d WHERE USERID = '%s'"
				, code.getTestcode()
				, code.getUserid());
		try {
			int rs = db.sendUpdateQuery(query);
			if(rs == 1) {
				db.commit();
				return true;
			}
			db.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
