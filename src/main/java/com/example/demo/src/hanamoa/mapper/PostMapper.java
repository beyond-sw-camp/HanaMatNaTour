package com.example.demo.src.hanamoa.mapper;

import com.example.demo.src.hanamoa.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    /** 게시글 목록 조회 */
    List<Post> getAllPosts();

    /** 게시글 상세 조회 */
    Post getPostById(int id);

    /** 게시글 작성 */
    void addPost(Post post);

    /** 게시글 수정 */
    int updatePost(Post post);

    /** 게시글 삭제 */
    int deletePost(int id);

    /** 게시글 조회수 증가 */
    void incrementViewCount(int id);

    /** 게시글 키워드 검색 */
    List<Post> searchPostsByKeyword(String keyword);
}
