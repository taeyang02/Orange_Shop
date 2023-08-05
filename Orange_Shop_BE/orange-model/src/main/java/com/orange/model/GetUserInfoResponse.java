package com.orange.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class GetUserInfoResponse {
    private String username;
    private String fullName;
    private String siteCode;
    private List<String> rights;
    private List<String> roles;
    private List<String> groups;
    private String userT24;
//    private String email;
//    private String phone;
//    private String ips;
//    private String department;
//    private String status;
//    private Date loginDate;
//    private Boolean isRoot;
//    private String address;
//    private String position;
//    private String title;
//    private String notes;
//    private String isDebug;
//    private String emailOther;
//    private String tempLogin;
//    private String code;
}
