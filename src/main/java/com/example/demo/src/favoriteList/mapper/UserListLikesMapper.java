package com.example.demo.src.favoriteList.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserListLikesMapper {
    // 좋아요 추가
    void addLike(@Param("userId") String userId, @Param("listId") int listId);

    // 좋아요 삭제
    void removeLike(@Param("userId") String userId, @Param("listId") int listId);

    // 특정 가게에 대한 좋아요 수 가져오기
    int getLikesCount(@Param("listId") int listId);

    // 사용자가 특정 가게를 좋아요 눌렀는지 확인
    boolean isLikedByUser(@Param("userId") String userId, @Param("listId") int listId);

}
