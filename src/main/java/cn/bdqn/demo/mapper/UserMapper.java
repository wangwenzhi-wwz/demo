package cn.bdqn.demo.mapper;

import cn.bdqn.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-03-05
 */
public interface UserMapper extends BaseMapper<User> {
     List<User> getUser(@Param("userName") String userName);
}
