package com.bankalfalah.app.employeeportal.payload.request;

import java.util.Set;

import jakarta.validation.constraints.*;

public class SignupRequest {

  @NotBlank
  @Size(min = 3, max = 20)
  private String fullName;

  @NotBlank
  @Size(max = 50)
  @Email
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  private Set<String> role;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
