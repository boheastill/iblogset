package cn.i623.iblogset.modle.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

import cn.i623.iblogset.modle.entity.Blog;

import java.util.List;

//托管类、关联属性dataSource
@Repository

public interface BlogDao extends JpaRepository<Blog, Long> {


    void setDataSource(DataSource dataSource);

    //增加博客
    void addBlog(Blog blog);

    //列表查询
    List<Blog> listBlogs(int minIndex, int maxRow);

    //查询
    Blog queryBlogbyid(int id);

    //更新
    void updateBlog(Blog blog);

    //删除
    int deleteBlog(int id);
}