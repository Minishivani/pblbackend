package com.springboot.pbl.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("UserInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	public static void setSequenceName(String sequenceName) {
		SEQUENCE_NAME = sequenceName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	@Transient
    public static String SEQUENCE_NAME = "user_sequence";
    @Id
    private Long id;
    @Indexed(unique = true)
    private String name;
    private String email;
    private String password;
    private String mobile;
    private String roles;
    private Long code;
}
