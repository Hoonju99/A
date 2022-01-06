package com.yedam.java.Fexample2;

public class Account {
	//필드
	private String name;
	private long balance;
	
	
	//생성자
	public Account(String name) {
		this.name = name;
	}
	
	public Account(String name, long balance) {
		this.name = name;
		this.balance = balance;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	//메서드
	
	
	public void deposit(int money) {
		
		this.balance += 10000;		
	}

	public void withdraw(int money) {
		this.balance -= 4800;	
	}
	
}
	
	
	
	
