package mybatis;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {
	
	@Test
	public void testGetUserById(){
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		//��ȡ�����û�
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> l = userMapper.getALLUser();
		
		for(User u:l){
			System.out.println(u);
		}
		sqlSession.close();
	}
	

}
