package mybatis;

import java.util.List;

public interface UserMapper {
    public List<User> getALLUser();
    
    public List<User> getALLUserByUsername(String name);
}
