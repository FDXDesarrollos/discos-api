package net.fdxdesarrollos.albums.security.dto;


public class JwtDto {
	private String token;
	
	public JwtDto() {
    }
	
	public JwtDto(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
