package mypack;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface LoginDAO 
{
	void addLogin(Login login);
}
