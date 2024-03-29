package com.cinema.dto;

public class User extends Person{
	private String userName;
	private String userPassword;
	
	
	
	public User(String userName, String userPassword, String nom) {
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	/**
	 * @return the id
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param id the id to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null) {
				return false;
			}
		} else if (!userName.equals(other.userName)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + userName + ", nom=" + nom + "]";
	}

}
