package testprojects.apps;

public class Validator{
	
	String name="";
	String password="";
	
	public void setNamePassword(){
		name = "soumyaranjan";
		password = "dash";
	}
	
	public boolean validateUser(String nameParam, String passwdParam){
		boolean authFlag = false;
		if(name.equals(nameParam) && password.equals(passwdParam)){
			authFlag=true;
		}
		else{
			authFlag=false;
		}
		return authFlag;
	}


} 
