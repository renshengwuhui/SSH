package sshtest.sshtest1.bo;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User {
	 @Id
	 @Column(name="Id")
    @GeneratedValue
    private Integer id;
	 @Column(name = "UserName")
    private String username;
	 @Column(name = "Password")
    private String password;
	 @Column(name = "PasswordHash")
    private String passwordhash;
	 @Column(name = "Email")
    private String email;
	 @Column(name = "EmailConfirmed")
    private Boolean emailconfirmed;
	 @Column(name = "Hometown")
    private String hometown;
	 @Column(name = "HomeTel")
    private String hometel;
	 @Column(name = "HomePhone")
    private String homephone;
	 @Column(name = "HomeAddress")
    private String homeaddress;
	 @Column(name = "OfficePhone")
    private String officephone;
	 @Column(name = "OfficeTel1")
    private String officetel1;
	 @Column(name = "OfficeTel2")
    private String officetel2;
	 @Column(name = "OfficeAddress")
    private String officeaddress;
	 @Column(name = "LockoutEndDateUtc")
    private Date lockoutenddateutc;
	 @Column(name = "AccessFailedCount")
    private Integer accessfailedcount;
	 @Column(name = "LockoutEnabled")
    private Boolean lockoutenabled;
	 @Column(name = "TwoFactorEnabled")
    private Boolean twofactorenabled;
	 @Column(name = "Code")
    private String code;
	 @Column(name = "Name")
    private String name;
	 @Column(name = "CreateBy")
    private Integer createby;
	 @Column(name = "CreateTime")
    private Date createtime;
	 @Column(name = "LastUpdateBy")
    private Integer lastupdateby;
	 @Column(name = "LastUpdateTime")
    private Date lastupdatetime;
}