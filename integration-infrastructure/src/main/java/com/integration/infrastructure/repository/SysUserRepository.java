package com.integration.infrastructure.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.integration.domain.SysUser;
@Repository
public interface SysUserRepository extends JpaRepository<SysUser, Integer> ,JpaSpecificationExecutor<SysUser>{
	//JpaRepository自定义查询：直接在接口中定义查询方法，如果是符合规范的，可以不用写实现，目前支持的关键字写法如下
	//更多自定义规则见：http://zhc3191012.blog.163.com/blog/static/1855533762014010102132984/
	
	/**
     * 实体account属性查询(条件属性以首字母大写)，作为查询条件的属性一定要遵守驼峰命名规范
     * JPQL:from SysUser u where u.account=?1
     */
    SysUser findByAccount(String account);
    
    /**
     * 实体account属性模糊查询(条件属性以首字母大写)，作为查询条件的属性一定要遵守驼峰命名规范
     * JPQL:from SysUser u where u.account like ?1
     */
    SysUser findByAccountLike(String account);
    
    /**
     * 实体account属性查询(条件属性以首字母大写)，作为查询条件的属性一定要遵守驼峰命名规范
     * JPQL:from SysUser u where u.account in ?1
     */
    List<SysUser> findByAccountIn(List<String> accounts);
    
    /**
     * 实体account,password属性查询(条件属性以首字母大写)，作为查询条件的属性一定要遵守驼峰命名规范
     * JPQL:from SysUser u where u.account=?1 and u.password=?2
     */
    SysUser findByAccountAndPassword(String account,String password);
    
    /**
     * 实体account属性分页查询(条件属性以首字母大写)，作为查询条件的属性一定要遵守驼峰命名规范
     * page对象含有List<T> getContent()方法，可以去除对应数据
     */
    Page<SysUser>findByAccount(String account,Pageable pageable);
    
    //使用@Query自定义查询(Spring Data提供的) :可以在自定义的查询方法上使用@Query来指定该方法要执行的查询语句
    //更多注解查询见：http://zhc3191012.blog.163.com/blog/static/1855533762014010105037704/
    /**
     * 方法的参数个数必须和@Query里面需要的参数个数一致 
     */
    @Query(" select o from SysUser o where o.account=?1")
    SysUser findUserByQuery(String account);
    
    /**
     * 方法的参数个数必须和@Query里面需要的参数个数一致(指定别名) 
     */
    @Query(" select o from SysUser o where o.account=:acc")
    SysUser findUserByQueryParam(@Param("acc")String account);
}
