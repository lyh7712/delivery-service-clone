package com.deliveryserviceclone.user;

import com.deliveryserviceclone.utility.RegexConstants;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class UserRegisterDto {

	@Email(message = "이메일 형식이여야 합니다.")
	@NotNull(message = "must not null")
	private String email;

	@NotBlank(message = "닉네임은 공백이 될 수 없습니다.")
	private String nickName;

	@NotNull(message = "must not null")
	@Pattern(regexp = RegexConstants.PHONE,
			message = "01로 시작하는 10-11자리 숫자여야 합니다.")
	private String phone;

	@NotNull(message = "must not null")
	@Pattern(regexp = RegexConstants.PASSWORD,
			message = "알파벳, 숫자, 특수문자가 각 1개이상 포함된 8~20 글자여야 합니다.")
	private String password;

	@NotNull(message = "must not null")
	@Pattern(regexp = RegexConstants.PASSWORD,
			message = "알파벳, 숫자, 특수문자가 각 1개이상 포함된 8~20 글자여야 합니다.")
	private String confirmedPassword;

	@NotNull(message = "must not null")
	@Past(message = "올바르지 않은 생년월일 입니다.")
	private LocalDate dateOfBirth;

	public UserRegisterDto(String email, String nickName, String phone, String password, String confirmedPassword, LocalDate dateOfBirth) {
		this.email = email;
		this.nickName = nickName;
		this.phone = phone;
		this.password = password;
		this.confirmedPassword = confirmedPassword;
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmedPassword() {
		return confirmedPassword;
	}

	public void setConfirmedPassword(String confirmedPassword) {
		this.confirmedPassword = confirmedPassword;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
