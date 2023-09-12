package orm;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DatabaseBuilder {
	
	private static SqlSessionFactory factory;
	private static final String config = "orm/mybaitsConfig.xml";
	
	static {
		try {
			//factory 연결하는 방법
			factory = new SqlSessionFactoryBuilder().build(
					Resources.getResourceAsReader(config));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static SqlSessionFactory getFactory() {
		// TODO Auto-generated method stub
		return factory;
	}
}
