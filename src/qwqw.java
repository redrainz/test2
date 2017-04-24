import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.User;

public class qwqw {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream in = Resources.getResourceAsStream("sqlconfig.xml");

		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);

		SqlSession session = sf.openSession();

		User u = new User();
		u.setName("bbb");
		u=session.selectOne("selectbyid",10);
		//session.insert("insertbyuser", u);
		//session.commit();
		 System.out.println(u);

		session.close();
		in.close();
	session = sf.openSession();
		
		 u = new User();
		
		u=session.selectOne("selectbyid",10);
		//session.insert("insertbyuser", u);
		//session.commit();
		System.out.println(u);
		
		session.close();
		
		in.close();
	}

}
