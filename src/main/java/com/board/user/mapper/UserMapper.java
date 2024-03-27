package com.board.user.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.user.domain.UserVo;

@Mapper
public interface UserMapper {

	 List<UserVo> getUserLiswt();
	 void insertUser(UserVo userVo);
	 HashMap<String, Object> getUswer(UserVo userVo);
	 void updateUser(UserVo uservo);
     void deleteUser(UserVo userVo);

}
