package com.deliveryserviceclone.utility;

public interface RegexConstants {
	String PHONE = "^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$";
	String PASSWORD = "(?=.*[a-zA-Zㄱ-ㅎㅏ-ㅣ가-힣])(?=.*[0-9])(?=.*[^\\w\\s]).{8,20}";
}
