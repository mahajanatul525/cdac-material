package mypack;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

        private String username;
        private String password;

        //business logic
        public String execute() {
                return "SUCCESS";
        }

        public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		//simple validation
        public void validate(){
                if("".equals(getUsername())){
                        addFieldError("username", getText("username.required"));
                }
                if("".equals(getPassword())){
                        addFieldError("password", getText("password.required"));
                }
        }
}