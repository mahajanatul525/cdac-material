package mypack;

// Generated 8 Nov, 2016 7:43:35 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Dept generated by hbm2java
 */
@Entity
@Table(name = "dept", catalog = "mydb")
public class Dept implements java.io.Serializable {

	private int deptno;
	private String dname;
	private String loc;

	public Dept() {
	}

	public Dept(int deptno) {
		this.deptno = deptno;
	}

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	@Id
	@Column(name = "deptno", unique = true, nullable = false)
	public int getDeptno() {
		return this.deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Column(name = "dname", length = 30)
	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Column(name = "loc", length = 30)
	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
