package com.integration.infrastructure.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import com.integration.domain.SysUser;

/**
 * 
 * 功能描述：扩展JpaRepository:写一个与接口(SysUserRepository)同名的类，加上后缀为Impl，这个在前面xml里面配置过，可以自动被扫描到。
 * 这个类不需要实现任何接口; (可以(JPQL)补充spring data jpa 动态查询不是很方便的缺点);
 * ps:实际开发中可以封装一些JPQL的常用操作(在此不详细介绍)
 * <p>
 * 版权所有：野狼团队
 * <p>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * 
 * @author DevinYang 新增日期：2015年6月18日
 * @author DevinYang 修改日期：2015年6月18日
 *
 */
public class SysUserRepositoryImpl {

	@PersistenceContext
	private EntityManager em;

	
	public Page<SysUser> getByCondition(SysUser sysUser) {
		StringBuffer hql = new StringBuffer("select u from SysUser u where 1=1");
		//此为测试，一般写好封装
		if (StringUtils.isNotBlank(sysUser.getAccount())) {
			hql.append(" and u.account=:account");
		}
		Query q = em.createQuery(hql.toString());
		if (StringUtils.isNotBlank(sysUser.getAccount())) {
			q.setParameter("account", sysUser.getAccount());
		}
		q.setFirstResult(0);
		q.setMaxResults(2);
		Page<SysUser> page = new PageImpl<SysUser>(q.getResultList(),new PageRequest(0, 2), 3);
		return page;
	}
}
