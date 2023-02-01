package com.sou.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.sou.conn.MyConn;
import com.sou.model.Publication;

public class PublicationDaoImpl implements PublicationDao {
    private MyConn myconn;
    
	public PublicationDaoImpl() {
		myconn=new MyConn();
	}

	@Override
	public void add(Publication pb) {
		// TODO Auto-generated method stub
		try {
			Connection conn=myconn.getconn();
			PreparedStatement ps=conn.prepareStatement("insert into Publication values(?,?,?,?)");
			ps.setInt(1, pb.getId());
			ps.setString(2, pb.getPtitle());
			ps.setString(3, pb.getPtype());
			ps.setString(4, pb.getContent());
			int i=ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Publication> selectall() {
		// TODO Auto-generated method stub
		List<Publication> list=new ArrayList<>();
		try {
			Connection conn=myconn.getconn();
			PreparedStatement ps=conn.prepareStatement("select * from Publication order by id");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Publication pb=new Publication();
				pb.setId(rs.getInt(1));
				pb.setPtitle(rs.getString(2));
				pb.setPtype(rs.getString(3));
				pb.setContent(rs.getString(4));
				list.add(pb);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public void delete(int id) {
		try {
			Connection conn=myconn.getconn();
			PreparedStatement ps=conn.prepareStatement("delete from Publication where id=?");
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Publication selectbyId(int id) {
		List<Publication> list=new ArrayList<>();
		try {
			Connection conn=myconn.getconn();
			PreparedStatement ps=conn.prepareStatement("select * from Publication where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Publication pb=new Publication();
				pb.setId(rs.getInt(1));
				pb.setPtitle(rs.getString(2));
				pb.setPtype(rs.getString(3));
				pb.setContent(rs.getString(4));
				list.add(pb);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list.get(0);
	}

	@Override
	public void update(Publication p) {
		try {
			Connection conn=myconn.getconn();
			PreparedStatement ps=conn.prepareStatement("update Publication set id=?,ptitle=?,ptype=?,content=? where id=?");
			ps.setInt(1, p.getId());
			ps.setString(2, p.getPtitle());
			ps.setString(3, p.getPtype());
			ps.setString(4, p.getContent());
			ps.setInt(5, p.getId());
			int i=ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
