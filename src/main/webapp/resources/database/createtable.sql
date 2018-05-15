drop table if exists User;
create table User(
	Id int not null auto_increment,
	UserName nvarchar(200) NULL,
	Password nvarchar(256) NULL,
	PasswordHash nvarchar(256) NULL,
	Email nvarchar(100) NOT NULL,
	EmailConfirmed bit NOT NULL,
	Hometown nvarchar(100) NULL,
	HomeTel nvarchar(20) NULL,
	HomePhone nvarchar(20) NULL,
	HomeAddress nvarchar(4000) NULL,
	OfficePhone nvarchar(20) NULL,
	OfficeTel1 nvarchar(20) NULL,
	OfficeTel2 nvarchar(20) NULL,
	OfficeAddress nvarchar(4000) NULL,
	LockoutEndDateUtc datetime NULL,
	AccessFailedCount int NOT NULL,
	LockoutEnabled bit NOT NULL,
	TwoFactorEnabled bit NOT NULL,
	Code nvarchar(50) NOT NULL,
	Name nvarchar(200) NULL,
	CreateBy int NOT NULL,
	CreateTime datetime NOT NULL,
	LastUpdateBy int NULL,
	LastUpdateTime datetime NULL,
	primary key(id)
)ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
insert into User(Email,EmailConfirmed,AccessFailedCount,LockoutEnabled,TwoFactorEnabled,
Code,CreateBy,CreateTime)
values('zhangjg.net@163.com',true,5,true,true,'zhangjg',1,now()),
('512862114@qq.com',true,5,true,true,'renshengwuhui',2,now());






