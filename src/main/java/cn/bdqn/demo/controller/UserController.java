package cn.bdqn.demo.controller;


import cn.bdqn.demo.entity.User;
import cn.bdqn.demo.service.IUserService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-03-05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/list")
    public String list(String userName){
        List<User>  userList=iUserService.findUser(userName);
        return JSONArray.toJSONString(userList);
    }

    @RequestMapping("/page/{size}/{curr}")
    public String page(@PathVariable Integer size,@PathVariable Integer curr){
        IPage<User> page=new Page<>();
        page.setSize(size);
        page.setCurrent(curr);
        IPage<User> userIPage =iUserService.page(page);
        return JSONObject.toJSONString(userIPage.getRecords());
    }

















}
