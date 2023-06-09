USE [AppTraSua]
GO
/****** Object:  Table [dbo].[Chucvu]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Chucvu](
	[IDCV] [nvarchar](20) NOT NULL,
	[Chức vụ] [nvarchar](50) NULL,
 CONSTRAINT [PK_Chucvu] PRIMARY KEY CLUSTERED 
(
	[IDCV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GiaoHang]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GiaoHang](
	[IDHD] [int] IDENTITY(1,1) NOT NULL,
	[sodienthoai] [nvarchar](20) NOT NULL,
	[DCgiaohang] [nvarchar](max) NOT NULL,
	[IDLTT] [nvarchar](10) NOT NULL,
	[NgayDat] [nvarchar](30) NULL,
	[TongTien] [decimal](18, 0) NULL,
	[TinhTrang] [nvarchar](30) NULL,
	[MucKM] [int] NULL,
	[GioDat] [nvarchar](30) NULL,
 CONSTRAINT [PK_GiaoHang] PRIMARY KEY CLUSTERED 
(
	[IDHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GioHang]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioHang](
	[IDGH] [int] IDENTITY(1,1) NOT NULL,
	[sodienthoai] [nvarchar](20) NOT NULL,
	[IDSP] [nvarchar](30) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[Topping] [nvarchar](50) NOT NULL,
	[TongTienSP] [decimal](18, 1) NOT NULL,
	[IDHD] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDGH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GioHangTC]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioHangTC](
	[IDGH] [int] IDENTITY(1,1) NOT NULL,
	[IDSP] [nvarchar](30) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[Topping] [nvarchar](50) NOT NULL,
	[TongTienSP] [decimal](18, 1) NOT NULL,
	[IDHDTC] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDGH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GioiTinh]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GioiTinh](
	[IDGT] [nvarchar](20) NOT NULL,
	[GioiTinh] [nvarchar](20) NULL,
 CONSTRAINT [PK_GioiTinh] PRIMARY KEY CLUSTERED 
(
	[IDGT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuyenMai]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuyenMai](
	[IDKM] [nvarchar](10) NOT NULL,
	[DipKhuyenMai] [nvarchar](max) NOT NULL,
	[MucKM] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[TinhTrangKM] [nvarchar](20) NULL,
 CONSTRAINT [PK_KhuyenMai] PRIMARY KEY CLUSTERED 
(
	[IDKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Loai]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Loai](
	[IDLoai] [nvarchar](20) NOT NULL,
	[TenLoai] [nvarchar](50) NULL,
 CONSTRAINT [PK_Loai] PRIMARY KEY CLUSTERED 
(
	[IDLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiTT]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiTT](
	[IDLTT] [nvarchar](10) NOT NULL,
	[TenLoaiTT] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiTT] PRIMARY KEY CLUSTERED 
(
	[IDLTT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[IDNV] [nvarchar](20) NOT NULL,
	[Username] [nvarchar](50) NULL,
	[SDT] [nvarchar](20) NULL,
	[IDCV] [nvarchar](20) NULL,
	[DiaChi] [nvarchar](50) NULL,
	[IDGT] [nvarchar](20) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[IDNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QLGioHang]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QLGioHang](
	[sodienthoai] [nvarchar](20) NOT NULL,
	[IDSP] [nvarchar](30) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[Topping] [nvarchar](50) NOT NULL,
	[TongTienSP] [decimal](18, 1) NOT NULL,
	[IDHD] [nchar](10) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sanpham]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sanpham](
	[IDSP] [nvarchar](30) NOT NULL,
	[TenSP] [nvarchar](30) NULL,
	[IDLoai] [nvarchar](20) NULL,
	[ChiTiet] [nvarchar](max) NULL,
	[Gia] [decimal](7, 0) NULL,
 CONSTRAINT [PK_Sanpham] PRIMARY KEY CLUSTERED 
(
	[IDSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Taikhoan]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Taikhoan](
	[sodienthoai] [nvarchar](20) NOT NULL,
	[password] [varchar](50) NULL,
	[HoTen] [nvarchar](50) NULL,
	[Email] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[IDGT] [nvarchar](20) NULL,
	[sault] [varchar](100) NULL,
 CONSTRAINT [PK_Taikhoan_1] PRIMARY KEY CLUSTERED 
(
	[sodienthoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaikhoanAD]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaikhoanAD](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NULL,
	[IDNV] [nvarchar](20) NULL,
 CONSTRAINT [PK_TaikhoanAD] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThongKeOderTaiCho]    Script Date: 21/05/2022 10:50:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongKeOderTaiCho](
	[IDHDTC] [int] IDENTITY(1,1) NOT NULL,
	[IDLTT] [nvarchar](10) NOT NULL,
	[NgayDat] [nvarchar](30) NULL,
	[MucKhuyenMai] [int] NULL,
	[TongTien] [decimal](18, 0) NULL,
 CONSTRAINT [PK_ThongKeOderTaiCho] PRIMARY KEY CLUSTERED 
(
	[IDHDTC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Chucvu] ([IDCV], [Chức vụ]) VALUES (N'CV01', N'Nhân viên order')
INSERT [dbo].[Chucvu] ([IDCV], [Chức vụ]) VALUES (N'CV02', N'Tài xế')
INSERT [dbo].[Chucvu] ([IDCV], [Chức vụ]) VALUES (N'CV03', N'Quản lí')
INSERT [dbo].[Chucvu] ([IDCV], [Chức vụ]) VALUES (N'CV04', N'Phục vụ')
INSERT [dbo].[Chucvu] ([IDCV], [Chức vụ]) VALUES (N'CV05', N'Bảo vệ')
GO
SET IDENTITY_INSERT [dbo].[GiaoHang] ON 

INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (1, N'0362581053', N'39 Đường số 13, Phường 14, Quận Thủ Dức, tp.Hồ Chí Minh', N'TT2', N'2022-05-18', CAST(122760 AS Decimal(18, 0)), N'Chưa giao hàng', 7, N'22:16:53')
INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (2, N'0374480751', N'88 Đường số 6, Phường  Linh Xuân, Quận Thủ Dức, tp.Hồ Chí Minh', N'TT3', N'2021-03-22', CAST(100440 AS Decimal(18, 0)), N'Đã giao', 7, N'22:18:30')
INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (3, N'0374480751', N'88 Đường số 6, Phường Linh Xuân, Quận Thủ Dức, tp.Hồ Chí Minh', N'TT1', N'2022-05-19', CAST(106200 AS Decimal(18, 0)), N'Chưa giao hàng', 10, N'22:19:30')
INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (4, N'0762581051', N'43 Dương Văn Dương, Phường Tân Quý, Quận Tân Phú, tp.Hồ Chí Minh', N'TT2', N'2022-02-15', CAST(69300 AS Decimal(18, 0)), N'Đã giao', 10, N'22:21:47')
INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (5, N'0987323613', N'G3/12A ấp 7, Đ. Trần Văn Giàu , Phường  Lê Minh Xuân, Quận Bình Tân, tp.Hồ Chí Minh', N'TT2', N'2022-05-21', CAST(94500 AS Decimal(18, 0)), N'Đã giao', 10, N'22:23:43')
INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (6, N'0762581043', N'16 Đ. Võ Văn Kiệt, Phường Nguyễn Thái Bình, Quận 1, tp.Hồ Chí Minh', N'TT1', N'2022-01-29', CAST(167400 AS Decimal(18, 0)), N'Đã giao', 10, N'22:26:37')
INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (7, N'0762581043', N'16 Đ. Võ Văn Kiệt, Phường Nguyễn Thái Bình, Quận 2, tp.Hồ Chí Minh', N'TT3', N'2022-05-21', CAST(188790 AS Decimal(18, 0)), N'Chưa giao hàng', 7, N'22:29:43')
INSERT [dbo].[GiaoHang] ([IDHD], [sodienthoai], [DCgiaohang], [IDLTT], [NgayDat], [TongTien], [TinhTrang], [MucKM], [GioDat]) VALUES (8, N'0987323613', N'2 Đường 13,An Lợi Đông, Phường An Lợi Đông, Quận 3, tp.Hồ Chí Minh', N'TT1', N'2022-05-23', CAST(94500 AS Decimal(18, 0)), N'Chưa giao hàng', 10, N'22:31:01')
SET IDENTITY_INSERT [dbo].[GiaoHang] OFF
GO
SET IDENTITY_INSERT [dbo].[GioHang] ON 

INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (1, N'0374480751', N'SP04', 1, N'Sương sáo,Trân châu,', CAST(40000.0 AS Decimal(18, 1)), N'3         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (2, N'0374480751', N'SP06', 1, N'Sương sáo,Trân châu,Khúc bạch.', CAST(39000.0 AS Decimal(18, 1)), N'3         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (3, N'0374480751', N'SP13', 1, N'Bánh flan,Phô mai,Sương sáo,', CAST(39000.0 AS Decimal(18, 1)), N'3         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (4, N'0762581051', N'SP10', 1, N'Sương sáo,Khúc bạch.', CAST(38000.0 AS Decimal(18, 1)), N'4         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (5, N'0762581051', N'SP05', 1, N'Thạch,Bánh flan,Trân châu,', CAST(39000.0 AS Decimal(18, 1)), N'4         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (6, N'0987323613', N'SP07', 1, N'Phô mai,Sương sáo,', CAST(33000.0 AS Decimal(18, 1)), N'8         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (7, N'0987323613', N'SP10', 2, N'Thạch,Sương sáo,', CAST(72000.0 AS Decimal(18, 1)), N'8         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (9, N'0762581043', N'SP12', 4, N'Sương sáo,Trân châu,', CAST(128000.0 AS Decimal(18, 1)), N'7         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (10, N'0762581043', N'SP03', 2, N'Trân châu,', CAST(44000.0 AS Decimal(18, 1)), N'7         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (11, N'0762581043', N'SP09', 1, N'Sương sáo,Trân châu,', CAST(31000.0 AS Decimal(18, 1)), N'7         ')
INSERT [dbo].[GioHang] ([IDGH], [sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (26, N'0362581053', N'SP04', 3, N'Sương sáo,Trân châu,Khúc bạch.', CAST(132000.0 AS Decimal(18, 1)), N'1         ')
SET IDENTITY_INSERT [dbo].[GioHang] OFF
GO
SET IDENTITY_INSERT [dbo].[GioHangTC] ON 

INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (1, N'SP04', 2, N'Trân châu,', CAST(74000.0 AS Decimal(18, 1)), N'1         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (2, N'SP10', 2, N'Sương sáo,', CAST(68000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (3, N'SP10', 2, N'Trân châu,', CAST(66000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (4, N'SP05', 1, N'Bánh flan,Phô mai,Sương sáo,', CAST(43000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (5, N'SP10', 1, N'Phô mai,Sương sáo,Trân châu,', CAST(41000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (6, N'SP17', 1, N'Khúc bạch.', CAST(44000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (7, N'SP07', 1, N'Phô mai,Sương sáo,', CAST(33000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (8, N'SP04', 1, N'Trân châu,Khúc bạch.', CAST(41000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (9, N'SP09', 1, N'Thạch,Khúc bạch.', CAST(32000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (10, N'SP04', 1, N'Trân châu,Khúc bạch.', CAST(41000.0 AS Decimal(18, 1)), N'5         ')
INSERT [dbo].[GioHangTC] ([IDGH], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHDTC]) VALUES (11, N'SP07', 1, N'Bánh flan,Phô mai,Sương sáo,', CAST(38000.0 AS Decimal(18, 1)), N'5         ')
SET IDENTITY_INSERT [dbo].[GioHangTC] OFF
GO
INSERT [dbo].[GioiTinh] ([IDGT], [GioiTinh]) VALUES (N'0', N'Nam')
INSERT [dbo].[GioiTinh] ([IDGT], [GioiTinh]) VALUES (N'1', N'Nữ')
GO
INSERT [dbo].[KhuyenMai] ([IDKM], [DipKhuyenMai], [MucKM], [SoLuong], [TinhTrangKM]) VALUES (N'KM01', N'Lễ 30/4, 1/05', 10, 99, N'Mở')
INSERT [dbo].[KhuyenMai] ([IDKM], [DipKhuyenMai], [MucKM], [SoLuong], [TinhTrangKM]) VALUES (N'KM02', N'Quốc khánh 2/9', 10, 80, N'Đóng')
INSERT [dbo].[KhuyenMai] ([IDKM], [DipKhuyenMai], [MucKM], [SoLuong], [TinhTrangKM]) VALUES (N'KM03', N'Quốc tế phụ nữ 8/3', 5, 27, N'Đóng')
INSERT [dbo].[KhuyenMai] ([IDKM], [DipKhuyenMai], [MucKM], [SoLuong], [TinhTrangKM]) VALUES (N'KM04', N'Valentine 14/2', 7, 29, N'Đóng')
GO
INSERT [dbo].[Loai] ([IDLoai], [TenLoai]) VALUES (N'L01', N'Trà sữa')
INSERT [dbo].[Loai] ([IDLoai], [TenLoai]) VALUES (N'L02', N'Trà sữa xanh')
INSERT [dbo].[Loai] ([IDLoai], [TenLoai]) VALUES (N'L03', N'Trà hoa quả')
GO
INSERT [dbo].[LoaiTT] ([IDLTT], [TenLoaiTT]) VALUES (N'TT1', N'Thẻ ATM nội địa')
INSERT [dbo].[LoaiTT] ([IDLTT], [TenLoaiTT]) VALUES (N'TT2', N'Tiền mặt')
INSERT [dbo].[LoaiTT] ([IDLTT], [TenLoaiTT]) VALUES (N'TT3', N'Momo')
GO
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV01', N'Trần Bình Dương', N'0376654310', N'CV01', N'234/08 Bạch Đằng,p.25,q.1, tp.HCM', N'0')
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV02', N'Lê Trần Thành Luân', N'0765432891', N'CV04', N'244/02 Quang Trung, p.1,q.1,tp.HCM', N'1')
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV03', N'Võ Thị Phương Uyên', N'0987234124', N'CV05', N'246/01/02 Trần Nhân Tông , p.1,q.1,tp.HCM', N'0')
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV04', N'Lê Anh Tâm', N'0826213432', N'CV01', N'33/2/1A,Võ Thị Sáu, Quận Gò Vấp,HCM', N'0')
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV06', N'Nguyễn Đình An', N'0937223143', N'CV04', N'244/02 Quang Trung, p.1,q.1,tp.HCM', N'1')
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV07', N'Lê Thanh Trúc', N'0983623424', N'CV02', N'23/12A,Lê Văn Việt,Q9,TP.HCM', N'1')
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV08', N'Phan Công Tiên', N'0779831787', N'CV02', N'22/13,2 baf trung', N'0')
INSERT [dbo].[NhanVien] ([IDNV], [Username], [SDT], [IDCV], [DiaChi], [IDGT]) VALUES (N'NV11', N'Nguyễn Anh Tuấn', N'0762581052', N'CV03', N'23/12A,Lê Văn Việt,Q9,TP.HCM', N'0')
GO
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0374480751', N'SP04', 1, N'Sương sáo,Trân châu,', CAST(40000.0 AS Decimal(18, 1)), N'3         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0374480751', N'SP06', 1, N'Sương sáo,Trân châu,Khúc bạch.', CAST(39000.0 AS Decimal(18, 1)), N'3         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0374480751', N'SP13', 1, N'Bánh flan,Phô mai,Sương sáo,', CAST(39000.0 AS Decimal(18, 1)), N'3         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581043', N'SP10', 1, N'Sương sáo,Trân châu,', CAST(36000.0 AS Decimal(18, 1)), N'6         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581043', N'SP12', 4, N'Sương sáo,Trân châu,', CAST(128000.0 AS Decimal(18, 1)), N'6         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581043', N'SP03', 1, N'Trân châu,', CAST(22000.0 AS Decimal(18, 1)), N'6         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0362581053', N'SP04', 1, N'Sương sáo,Trân châu,', CAST(40000.0 AS Decimal(18, 1)), N'1         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0362581053', N'SP04', 3, N'Sương sáo,Trân châu,Khúc bạch.', CAST(132000.0 AS Decimal(18, 1)), N'1         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0374480751', N'SP04', 1, N'Sương sáo,Trân châu,', CAST(40000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0374480751', N'SP06', 2, N'Khúc bạch.', CAST(68000.0 AS Decimal(18, 1)), N'2         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581051', N'SP10', 1, N'Sương sáo,Khúc bạch.', CAST(38000.0 AS Decimal(18, 1)), N'4         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581051', N'SP05', 1, N'Thạch,Bánh flan,Trân châu,', CAST(39000.0 AS Decimal(18, 1)), N'4         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0987323613', N'SP07', 1, N'Phô mai,Sương sáo,', CAST(33000.0 AS Decimal(18, 1)), N'5         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0987323613', N'SP10', 2, N'Thạch,Sương sáo,', CAST(72000.0 AS Decimal(18, 1)), N'5         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581043', N'SP12', 4, N'Sương sáo,Trân châu,', CAST(128000.0 AS Decimal(18, 1)), N'7         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581043', N'SP03', 2, N'Trân châu,', CAST(44000.0 AS Decimal(18, 1)), N'7         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0762581043', N'SP09', 1, N'Sương sáo,Trân châu,', CAST(31000.0 AS Decimal(18, 1)), N'7         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0987323613', N'SP07', 1, N'Phô mai,Sương sáo,', CAST(33000.0 AS Decimal(18, 1)), N'8         ')
INSERT [dbo].[QLGioHang] ([sodienthoai], [IDSP], [SoLuong], [Topping], [TongTienSP], [IDHD]) VALUES (N'0987323613', N'SP10', 2, N'Thạch,Sương sáo,', CAST(72000.0 AS Decimal(18, 1)), N'8         ')
GO
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP01', N'Trà sữa Việt Quốc', N'L01', N'Ngon , Bổ ', CAST(20000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP02', N'Trà Ðào', N'L03', N'Ngon , Bổ', CAST(25000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP03', N'Trà sữa chân châu trắng', N'L01', N'Trân châu trắng sẽ có vị ngọt và giòn khi bạn cắn vào miếng đầu tiên chứ không dẻo và dai như trân châu đen.', CAST(20000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP04', N'Trà sữa Oreo Cake Cream', N'L01', N'Trà sữa Oreo Cake Cream là các loại trà sữa đặt biệt dành cho những người ưu thích sự béo ngậy và đam mê hương vị Oreo Cake Cream. Bạn sẽ cảm nhận được 3 lớp hương vị độc đáo khi hòa quyện vào với nhau đó là vị ngọt của trà sữa, tiếp theo là vị béo ngậy của lớp cream cheese và cuối cùng là vị đắng nhẹ của bánh oreo thật là hấp dẫn.', CAST(35000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP05', N'Trà rau má', N'L02', N'100 % rau má', CAST(30000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP06', N'Trà sữa dâu tây', N'L01', N'Hương vị chua dịu hòa với vị trà sữa ngọt ngào, mùi thơm của dâu tây đem đến sự yêu thích từ người thưởng thức. Bạn có thể dùng siro dâu, tuy nhiên, siro dâu thường có vị hơi gắt. ', CAST(30000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP07', N'Trà sữa hoa đậu biếc', N'L01', N'Trà sữa hoa đậu biếc là một loại đồ uống độc đáo, mới mẻ hàng đầu. Nó là một sự kết hợp màu xanh tím đẹp mắt kết hợp trà sữa hoa đậu biếc có thể khiến mọi thực khách say mê ngay từ cái nhìn đầu tiên từ ly trà sữa hoa đậu biếc.', CAST(25000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP08', N'Trà sữa khoai môn', N'L01', N'Trà sữa khoai môn có vị béo béo của sữa, mùi thơm của khoai môn cùng với chút vị chát nhẹ của trà. Thức uống này không quá ngọt và ngậy như những loại trà sữa có kem cheese, vị ngọt thanh mà vẫn có chút béo bùi là điểm cộng lớn nhất của trà sữa khoai môn. ', CAST(27000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP09', N'Trà sữa matcha đậu đỏ', N'L02', N'Trà sữa Matcha đậu đỏ về cơ bản vẫn là trà sữa trà xanh với vị chát nhẹ của trà, vị thơm mát của matcha cùng với chút ngọt nhẹ của sữa tươi.', CAST(26000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP10', N'Trà sữa sương sáo', N'L01', N'Sương sáo là loại thạch có tính mát, giải nhiệt cơ thể vào những ngày hè.', CAST(31000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP11', N'Trà sữa than tre', N'L02', N'Trà sữa than tre có rất nhiều công dụng tốt cho sức khỏe như thanh lọc, giải nhiệt cho cơ thể, trà sữa than tre còn được biến tấu thành các món như trà sữa than tre trứng muối', CAST(35000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP12', N'Trà sữa Cà phê', N'L02', N'Hương vị của cà phê có chút đắng, khác với vị đắng của chocolate. Đặc biệt thì cà phê cũng có mùi thơm quyến rũ mà chỉ cần ngửi cũng muốn được uống thử. Trà sữa cà phê hẳn là sự kết hợp khá độc đáo giữa 2 nguyên liệu tưởng chừng có ít sự liên quan này với nhau.', CAST(27000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP13', N'Ca cao dầm', N'L03', N'Hương vị chua dịu hòa với vị trà sữa ngọt ngào, mùi thơm của dâu tây đem đến sự yêu thích từ người thưởng thức. Bạn có thể dùng siro dâu, tuy nhiên, siro dâu thường có vị hơi gắt. ', CAST(26000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP14', N'Trà sữa cheese milk foam', N'L03', N'Điểm đặc trưng so với các loại trà sữa khác: lớp kem sữa này nay còn có cả cheese, tạo nên một món đồ uống trà kem sữa vị phô mai mặn mặn, béo ngậy pha chút chát nhẹ và ngọt dịu của sữa và trà.', CAST(25000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP15', N'Trà trái cây nhiệt đới', N'L03', N'Hương vị trà ô long, thanh nhẹ hấp dẫn hòa cùng với vị chua ngọt từ mứt chanh dây ăn kèm cùng các loại trái cây giòn giòn, giúp giải nhiệt cực kỳ hiệu quả.', CAST(22000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP16', N'Trà thanh long đỏ', N'L03', N'Khi uống ta sẽ cảm nhận vị ngọt của thanh long hòa cùng vị thơm của trà đen, phủ thêm 1 lớp kem cheese nữa sẽ khiến thức uống thêm đẹp mắt và tăng thêm hương vị.', CAST(30000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP17', N'Trà sữa thái giải nhiệt', N'L02', N'Với hương vị thơm mát của trà xanh, sự béo ngậy của sữa hòa quyện với thạch, trân châu. Đây quả là thức uống giải nhiệt tuyệt vời giúp xua tan cái oi ả, nắng gắt của ngày hè.', CAST(40000 AS Decimal(7, 0)))
INSERT [dbo].[Sanpham] ([IDSP], [TenSP], [IDLoai], [ChiTiet], [Gia]) VALUES (N'SP18', N'Trà sữa trân châu đen', N'L01', N'Trà sữa trân châu đen luôn là sự kết hợp hoàn hảo giữa trà đen, sữa tươi cùng hạt trân châu mềm, dai và có chút vị ngọt nhẹ. Uống và cảm nhận vị chát của trà, vị ngọt lẫn chút thơm của sữa cùng với những hạt trân châu đen dai dai hẳn là một lựa chọn khá hoàn hảo cho không chỉ riêng mùa hè.', CAST(22000 AS Decimal(7, 0)))
GO
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0123456789', N'oD+S3kJOgcddpMNiipSCHc2tZ45zr8aiYNRVK/OEonk=', N'Lê Thị Huyền', N'dat@gmail.com', N'HCM', N'1', N'039lNTqKDthaSbV28Wp5bA9YxVkQha')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0362581053', N'Baouyen@12', N'Bùi Ngọc Bảo Uyên', N'uyen@gmail.com', N'23/12a,Q.Thủ Đức,tp.HCM', N'0', N'XAw8IMgjeOsvfRk2JpipfbKV6d7onS')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0374480751', N'Tai@2345', N'Văn Thế Tài', N'tai@gmail.com', N'16/12/ER4,Nguyễn Gia Trí,q.Gò Vấp,tp.HCM', N'0', N'zcvxz')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0374480752', N'tvFmY1gTVuxCSD2cNsfel7kzelQdjsMOi98hdAvqBGY=', N'Lê Trần Thành Luân', N'luan@gmail.com', N'16/12/ER4,Nguyễn Gia Trí,q.Gò Vấp,tp.HCM', N'1', N'YCGC0qp75yfexqnxJ9oz468GZrKFMa')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0374480753', N'nQcmnEnyZcDPirLyitUPev7TyjCJTKhvdpb7S+YNYSw=', N'Trần Nhân Đức', N'duc2@gmail.com', N'2h/23,Ung văn Bứu,q.Gò Vấp,tp.HCM', N'1', N'mwpGsIrYUwrFNqtX3CKU6HJxHm1uJW')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0762581043', N'Ngan%%22', N'Nguyễn Khánh Ngân', N'ngan12@gmail.com', N'26/12AB,Nguyễn Gia Trí,p.25,q.Bình Thạnh,tp.HCM', N'0', N'3R8vNTculWN6GlpNHW7qy7xL2eQYWO')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0762581051', N'Hoang@12', N'Huỳnh Minh Hoàng', N'hoang@gmail.com', N'28/38A,Nguyễn Gia Trí,q.Bình Thạnh,tp.HCM', N'0', N'adfafasadasfd')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0762581052', N'Tuan#a12', N'Nguyễn Anh Tuấn', N'tuan@gmail.com', N'26/12AB,Nguyễn Gia Trí,p.25,q.Bình Thạnh,tp.HCM', N'0', N'KXYsKuHZZPaA0QTIAuOwlBGM6LJjHv')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0762581054', N'Datngao#', N'Nguyễn Trường Đạt', N'dat@gmail.com', N'16/12/ER4,Nguyễn Gia Trí,q.Gò Vấp,tp.HCM', N'1', N'jf9NbSC0YByhXSHmoC2LC5LpfJUXeO')
INSERT [dbo].[Taikhoan] ([sodienthoai], [password], [HoTen], [Email], [DiaChi], [IDGT], [sault]) VALUES (N'0987323613', N'Hau@123', N'Phan Công Hậu', N'hau@gmail.com', N'23/22a,Trần Duy Hưng,p.12,q.Thủ Đức,tp.HCM', N'1', N'XjYMhlxiqrthd52QM4jqmsJmUbxSxR')
GO
INSERT [dbo].[TaikhoanAD] ([username], [password], [IDNV]) VALUES (N'dat123', N'123f', N'NV01')
INSERT [dbo].[TaikhoanAD] ([username], [password], [IDNV]) VALUES (N'hoang12', N'123s', N'NV07')
INSERT [dbo].[TaikhoanAD] ([username], [password], [IDNV]) VALUES (N'luanga', N'123ga', N'NV02')
INSERT [dbo].[TaikhoanAD] ([username], [password], [IDNV]) VALUES (N'tai@n', N'123d', N'NV04')
INSERT [dbo].[TaikhoanAD] ([username], [password], [IDNV]) VALUES (N'tuan12', N'123a', N'NV11')
GO
SET IDENTITY_INSERT [dbo].[ThongKeOderTaiCho] ON 

INSERT [dbo].[ThongKeOderTaiCho] ([IDHDTC], [IDLTT], [NgayDat], [MucKhuyenMai], [TongTien]) VALUES (1, N'TT2', N'06:32:37,14/05/2022', 10, CAST(74000 AS Decimal(18, 0)))
INSERT [dbo].[ThongKeOderTaiCho] ([IDHDTC], [IDLTT], [NgayDat], [MucKhuyenMai], [TongTien]) VALUES (2, N'TT2', N'09:12:13,17/05/2022', 10, CAST(262000 AS Decimal(18, 0)))
INSERT [dbo].[ThongKeOderTaiCho] ([IDHDTC], [IDLTT], [NgayDat], [MucKhuyenMai], [TongTien]) VALUES (5, N'TT3', N'09:51:49,21/05/2022', 7, CAST(79000 AS Decimal(18, 0)))
SET IDENTITY_INSERT [dbo].[ThongKeOderTaiCho] OFF
GO
ALTER TABLE [dbo].[GiaoHang]  WITH CHECK ADD  CONSTRAINT [FK_GiaoHang_LoaiTT] FOREIGN KEY([IDLTT])
REFERENCES [dbo].[LoaiTT] ([IDLTT])
GO
ALTER TABLE [dbo].[GiaoHang] CHECK CONSTRAINT [FK_GiaoHang_LoaiTT]
GO
ALTER TABLE [dbo].[GiaoHang]  WITH CHECK ADD  CONSTRAINT [FK_GiaoHang_Taikhoan] FOREIGN KEY([sodienthoai])
REFERENCES [dbo].[Taikhoan] ([sodienthoai])
GO
ALTER TABLE [dbo].[GiaoHang] CHECK CONSTRAINT [FK_GiaoHang_Taikhoan]
GO
ALTER TABLE [dbo].[GioHangTC]  WITH CHECK ADD  CONSTRAINT [FK_GioHangTC_Sanpham] FOREIGN KEY([IDSP])
REFERENCES [dbo].[Sanpham] ([IDSP])
GO
ALTER TABLE [dbo].[GioHangTC] CHECK CONSTRAINT [FK_GioHangTC_Sanpham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_Chucvu] FOREIGN KEY([IDCV])
REFERENCES [dbo].[Chucvu] ([IDCV])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_Chucvu]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_GioiTinh] FOREIGN KEY([IDGT])
REFERENCES [dbo].[GioiTinh] ([IDGT])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_GioiTinh]
GO
ALTER TABLE [dbo].[QLGioHang]  WITH CHECK ADD  CONSTRAINT [FK_QLGioHang_Sanpham] FOREIGN KEY([IDSP])
REFERENCES [dbo].[Sanpham] ([IDSP])
GO
ALTER TABLE [dbo].[QLGioHang] CHECK CONSTRAINT [FK_QLGioHang_Sanpham]
GO
ALTER TABLE [dbo].[QLGioHang]  WITH CHECK ADD  CONSTRAINT [FK_QLGioHang_Taikhoan] FOREIGN KEY([sodienthoai])
REFERENCES [dbo].[Taikhoan] ([sodienthoai])
GO
ALTER TABLE [dbo].[QLGioHang] CHECK CONSTRAINT [FK_QLGioHang_Taikhoan]
GO
ALTER TABLE [dbo].[Sanpham]  WITH CHECK ADD  CONSTRAINT [FK_Sanpham_Loai] FOREIGN KEY([IDLoai])
REFERENCES [dbo].[Loai] ([IDLoai])
GO
ALTER TABLE [dbo].[Sanpham] CHECK CONSTRAINT [FK_Sanpham_Loai]
GO
ALTER TABLE [dbo].[TaikhoanAD]  WITH CHECK ADD  CONSTRAINT [FK_TaikhoanAD_NhanVien] FOREIGN KEY([IDNV])
REFERENCES [dbo].[NhanVien] ([IDNV])
GO
ALTER TABLE [dbo].[TaikhoanAD] CHECK CONSTRAINT [FK_TaikhoanAD_NhanVien]
GO
ALTER TABLE [dbo].[ThongKeOderTaiCho]  WITH CHECK ADD  CONSTRAINT [FK_ThongKeOderTaiCho_LoaiTT] FOREIGN KEY([IDLTT])
REFERENCES [dbo].[LoaiTT] ([IDLTT])
GO
ALTER TABLE [dbo].[ThongKeOderTaiCho] CHECK CONSTRAINT [FK_ThongKeOderTaiCho_LoaiTT]
GO
