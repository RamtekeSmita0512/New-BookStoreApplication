package com.bridgelabz.bookstoreapplication.user.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	 private String firstName;
	    private String lastName;
	    private String emailId;
	    private String password;
	    private Boolean verify=true;
	    @JsonFormat(pattern = "dd-MM-yyyy")
	    private LocalDate dob;
	    @JsonFormat(pattern = "dd-MM-yyyy")
	    private LocalDate registerDate = LocalDate.now();
	    @JsonFormat(pattern = "dd-MM-yyyy")
	    private LocalDate updatedDate = LocalDate.now();

}
