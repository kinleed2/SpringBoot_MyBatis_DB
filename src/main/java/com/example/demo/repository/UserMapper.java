package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
    User search(UserSearchRequest user);
    List<User> searchAll();
}