package com.christine.model;

import lombok.Data;

@Data
public class Roster {
    private Long id;
    private String projectCode;
    private String function;
    private String role;
    private String scrumRole;
    private String email;
    private String memberUserId;
}
