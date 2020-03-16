package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.entity.User;
import cn.bdqn.demo.mapper.UserMapper;
import cn.bdqn.demo.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findUser(String userName) {
        if(userName!=null && !userName.isEmpty()){
            return  userMapper.getUser(userName);
        }
        return null;
    }
}
