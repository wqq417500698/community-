package cn.huarun.decoration.mcb.realms;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerRealm extends AuthorizingRealm{
	
    /**
     * 授权
     */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
	
		//权限
		//通过数据库查询得到用户的角色 权限
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRole("角色");
		info.addStringPermission("权限");
		
		return info;
	}
    /**
     * 认证
     */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//得到用户的账号
		String userName = (String) token.getPrincipal();
		//通过查询 得到 用户 密码
		
		SimpleAuthenticationInfo info =new SimpleAuthenticationInfo("username","password","打印日志");
		
		return info;
	}
	
	

}
