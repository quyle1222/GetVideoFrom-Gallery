Create database ThueNha
use ThueNha

create table CanHo(
	MaCanHo    char(5) not null primary key, 
	DiaChi varchar ( 500)  ,
	LoaiCanHo varchar (500)  ,
	DienTich int ,
	DonGiaThue int 
);
create table KhachThue ( 
	MaKhach char (5)  not null primary key , 
	HoTen varchar(500)  ,
	DiaChi  varchar (500) , 
	DienThoai  varchar(10) , 
	GioiTinh bit 
);
create table HopDong (
	SoHopDong  char(5) not null primary key ,
	MaCanHo  char(5) not null,
	MaKhach  char (5) not null,
	NgayThue  date not null,
	NgayTra  date not null,
	ThoiGianThue datetime not null,
	GiaTriHopDong int not null
	);

