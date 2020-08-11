package com.example.springmongodbsimple.models;

public enum Role {
  BASIC("Básico"),
  VOLUNTEER("Voluntário"),
  PROFESSIONAL("Profissional");

  private String jobName;

  Role(String jobName) {
    this.jobName = jobName;
  }

  public String getJobName() {
    return jobName;
  }
}
