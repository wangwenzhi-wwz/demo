package cn.bdqn.demo.service;

import cn.bdqn.demo.entity.User;
import cn.bdqn.demo.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-03-05
 */
public interface IUserService extends IService<User> {

    List<User> findUser(String userName);
}
