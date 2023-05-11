
public class Account {
	private int account_number;
	private String name;
	
	
	public Account(int account_number, String name) {
		this.account_number = account_number;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", name=" + name + "]";
	}




	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account_number;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (account_number != other.account_number)
			return false;
		/*
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		*/
		return true;
	}
	


}
