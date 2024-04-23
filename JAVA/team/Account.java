package team;

public class Account {
   
	String ano;
	String owner; 
	int balance;
	   
	public Account(String ano, String owner, int balance) { 
	  super();
      this.ano=ano;
      this.owner=owner;
      this.balance=balance;
   } 
   
   // Setter와 Getter 메소드 완성
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
