USE [master]
GO
/****** Object:  Database [ProjectPRO]    Script Date: 7/9/2022 12:26:15 AM ******/
CREATE DATABASE [ProjectPRO]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ProjectPRO', FILENAME = N'D:\SQL\MSSQL15.MSSQLSERVER\MSSQL\DATA\ProjectPRO.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ProjectPRO_log', FILENAME = N'D:\SQL\MSSQL15.MSSQLSERVER\MSSQL\DATA\ProjectPRO_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [ProjectPRO] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ProjectPRO].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ProjectPRO] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ProjectPRO] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ProjectPRO] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ProjectPRO] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ProjectPRO] SET ARITHABORT OFF 
GO
ALTER DATABASE [ProjectPRO] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ProjectPRO] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ProjectPRO] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ProjectPRO] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ProjectPRO] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ProjectPRO] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ProjectPRO] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ProjectPRO] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ProjectPRO] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ProjectPRO] SET  DISABLE_BROKER 
GO
ALTER DATABASE [ProjectPRO] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ProjectPRO] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ProjectPRO] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ProjectPRO] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ProjectPRO] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ProjectPRO] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ProjectPRO] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ProjectPRO] SET RECOVERY FULL 
GO
ALTER DATABASE [ProjectPRO] SET  MULTI_USER 
GO
ALTER DATABASE [ProjectPRO] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ProjectPRO] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ProjectPRO] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ProjectPRO] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ProjectPRO] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [ProjectPRO] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'ProjectPRO', N'ON'
GO
ALTER DATABASE [ProjectPRO] SET QUERY_STORE = OFF
GO
USE [ProjectPRO]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 7/9/2022 12:26:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [numeric](18, 0) IDENTITY(1,1) NOT NULL,
	[username] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[role] [int] NULL,
 CONSTRAINT [PK__Account__DD771E3CBA19E034] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ActiveAcc]    Script Date: 7/9/2022 12:26:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ActiveAcc](
	[AccID] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 7/9/2022 12:26:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[AccountID] [numeric](18, 0) NOT NULL,
	[ProductID] [int] NOT NULL,
	[Amount] [int] NULL,
 CONSTRAINT [PK_Cart] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC,
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 7/9/2022 12:26:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[cid] [int] NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 7/9/2022 12:26:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [int] NOT NULL,
	[name] [nvarchar](max) NULL,
	[image] [nvarchar](max) NULL,
	[price] [money] NULL,
	[description] [nvarchar](max) NULL,
	[quantity] [int] NULL,
	[cateID] [int] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[UserInfo]    Script Date: 7/9/2022 12:26:15 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserInfo](
	[id] [numeric](18, 0) IDENTITY(1,1) NOT NULL,
	[First_Name] [nvarchar](max) NOT NULL,
	[Last_Name] [nvarchar](max) NOT NULL,
	[Birthday] [date] NOT NULL,
	[Gender] [nvarchar](max) NOT NULL,
	[Email] [nvarchar](max) NOT NULL,
	[PhoneNumber] [numeric](18, 0) NOT NULL,
	[Username] [nvarchar](max) NOT NULL,
	[Password] [nvarchar](max) NOT NULL,
	[Address] [nvarchar](max) NOT NULL,
	[AccountId] [numeric](18, 0) NULL,
 CONSTRAINT [PK_registerInfo] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(1 AS Numeric(18, 0)), N'Adam', N'123456', 1)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(2 AS Numeric(18, 0)), N'Anjolie', N'SNZ6HE', 1)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(3 AS Numeric(18, 0)), N'Ferris', N'RXH3XJ', 1)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(4 AS Numeric(18, 0)), N'Katell', N'HWV8ZN', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(5 AS Numeric(18, 0)), N'Zahir', N'NPX7OF', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(6 AS Numeric(18, 0)), N'Conan', N'WIZ5VZ', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(7 AS Numeric(18, 0)), N'Cade', N'ZSW2LU', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(8 AS Numeric(18, 0)), N'Micah', N'RVV5SR', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(9 AS Numeric(18, 0)), N'Rowan', N'VAI6XR', 1)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(10 AS Numeric(18, 0)), N'Kirby', N'DNX6JK', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(11 AS Numeric(18, 0)), N'Tanisha', N'XWU7JP', 1)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(12 AS Numeric(18, 0)), N'ducanh', N'123456', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(13 AS Numeric(18, 0)), N'null', N'null', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(14 AS Numeric(18, 0)), N'', N'', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(15 AS Numeric(18, 0)), N'', N'', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(16 AS Numeric(18, 0)), N'', N'', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(17 AS Numeric(18, 0)), N'Adam', N'12345634535', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(18 AS Numeric(18, 0)), N'', N'', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(19 AS Numeric(18, 0)), N'', N'', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(20 AS Numeric(18, 0)), N'', N'', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(21 AS Numeric(18, 0)), N'', N'', 0)
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (CAST(22 AS Numeric(18, 0)), N'aaa', N'123', 0)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
INSERT [dbo].[Cart] ([AccountID], [ProductID], [Amount]) VALUES (CAST(1 AS Numeric(18, 0)), 1, 1)
INSERT [dbo].[Cart] ([AccountID], [ProductID], [Amount]) VALUES (CAST(1 AS Numeric(18, 0)), 2, 1)
INSERT [dbo].[Cart] ([AccountID], [ProductID], [Amount]) VALUES (CAST(1 AS Numeric(18, 0)), 3, 1)
INSERT [dbo].[Cart] ([AccountID], [ProductID], [Amount]) VALUES (CAST(1 AS Numeric(18, 0)), 15, 1)
INSERT [dbo].[Cart] ([AccountID], [ProductID], [Amount]) VALUES (CAST(1 AS Numeric(18, 0)), 32, 1)
GO
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (1, N'Chair', 15)
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (2, N'Table', 7)
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (3, N'Bed', 5)
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (4, N'Sofa', 6)
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (5, N'Chair and Table', NULL)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (1, N'Wooden Chair', N'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/beetle-chair-07-1508956886.jpeg?crop=0.793xw:1.00xh;0.123xw,0&resize=980:* ', 65.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (2, N'Single Armchair', N'https://i.pinimg.com/564x/54/1d/d4/541dd467d515c5b93a024391eb3f0796.jpg	', 30.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (3, N'Wooden Airchair', N'https://www.seekpng.com/png/full/6-67645_wooden-chair-png-chair-png.png', 40.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (4, N'Stylish Chair', N'https://www.seekpng.com/png/full/339-3399322_ikea-poang-armchair-png-ikea-poang-chair.png', 100.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (5, N'Modern Chair', N'https://cdn.conranshop.co.uk/media/catalog/product/cache/8a394d7302b6f57bd505c0072f6cff11/5/5/558976_e8e8.jpg', 120.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (6, N'Mapple Wood Dinning Table', N'https://m.media-amazon.com/images/I/61mzgMEGJvL.jpg', 140.0000, NULL, 1, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (7, N'Arm Chair', N'https://pngimg.com/uploads/sofa/sofa_PNG6960.png', 90.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (8, N'Wooden Bed', N'http://img.roomeon.com/img/object/ikea-malm-bed-frame-beds_540222c0c1_c9.png', 140.0000, NULL, 1, 3)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (9, N'Designed Sofa', N'https://static.dezeen.com/uploads/2017/02/john-pawson-interiors-studio-london-houses-residential-roundups_dezeen_sq-1704x1704.jpg', 160.0000, NULL, 1, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (10, N'Dinning Table', N'https://furniture123.co.uk/Images/NTW001A_1_11081929_Supersize.jpg?width=650&height=650&v=56', 200.0000, NULL, 1, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (11, N'Chair and Table', N'https://www1.pictures.lonny.com/mp/W-M9_849Smml.jpg', 100.0000, NULL, 1, 5)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (12, N'Modern Arm Chair', N'https://5.imimg.com/data5/JN/HR/MY-12662993/acrylic-bubble-swing-500x500.jpg', 299.9090, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (13, N'Cloth Covered Accent Chair', N'https://i.pinimg.com/564x/35/47/49/354749e4cd786886620554df1925c343.jpg', 399.9090, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (14, N'Mapple Wood Accent Chair', N'https://purepng.com/public/uploads/large/purepng.com-chair-brown-greyobjectschair-brown-greychair-furniture-decoration-821523987859athd6.png', 199.9090, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (15, N'Valvet Accent Arm Chair	', N'https://www.nicepng.com/png/full/26-268977_armchair-png-image-comfy-chair-png.png', 299.9090, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (16, N'Stoole and Chair	', N'https://i.pinimg.com/564x/1d/5e/6d/1d5e6debdf3b81d754f0c2a23d6b6ac2.jpg', 99.0000, NULL, 1, 5)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (17, N'Hudson Modern Velvet Accent Chair	', N'https://m.media-amazon.com/images/I/911OSzao-SL._AC_SX679_.jpg', 99.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (18, N'Fatstool Chair', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/a/fats01mb0404bl_2_1.jpg', 1230.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (19, N'Micro WingBack Sofa Chair', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/m/i/micro_sofa_hallingdal_190_na_angle_1.jpg	', 5100.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (20, N'Scoop Chair HighBack Wool', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/s/c/scoop_high_front_grey_1.jpg', 1500.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (21, N'Slab Bar Stool Black Chair', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/w/o/wos01bl_slab_bar_stool_black_main.jpg', 486.0000, NULL, 1, 1)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (22, N'Screw Cafe Table Pebble Marble Top 900mm', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/s/c/screw-_-900-pebble_3.jpg', 3060.0000, NULL, 1, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (23, N'Stone Table Circle', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/l/flash-circle-black-angled-side_1.jpg', 1440.0000, NULL, 1, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (24, N'Spun Table Short Brass', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/s/u/sut01b_spun_table_short_brass_main.jpg', 1800.0000, NULL, 1, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (25, N'Flash Table Square Brash', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/l/flash_square_brass_angle_200_1.jpg', 966.0000, NULL, 1, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (26, N'Flash Table Circle Black', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/l/flash_circle_black_angle_176.jpg', 696.0000, NULL, 1, 2)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (27, N'Chateauneuf Rustic Rattan French Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/c/h/chateauneuf-rustic-rattan-bed.jpg', 1495.0000, NULL, 1, 3)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (28, N'Love In Idleness Reversible Upholstered Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/l/o/love-in-idleness-stripe-1.jpg', 1605.0000, NULL, 1, 3)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (29, N'Love Story Naturelle Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/b/e/bed-new-main_2.jpg', 1295.0000, NULL, 1, 3)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (30, N'Lit DAmour, Low Footboard Linen Upholstered Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/l/i/lit-d_amour-low-footboard-bed-1_3.jpg', 1995.0000, NULL, 1, 3)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (31, N'Plaza Sofa', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/bdc3eaf7231b708eff63bddfddcaf059_large.jpg?v=1643019238', 2995.0000, NULL, 1, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (32, N'Suzanna Sofa', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/ce3cffab64ca67d86d5150d94514e9a4_large.jpg?v=1646045647', 2850.0000, NULL, 1, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (33, N'Brigitte Boucle Sectional Sofa, Oatmeal', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/7ec058b0da4bf0e300d9b687e4601345_large.jpg?v=1652263166', 5400.0000, NULL, 1, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (34, N'Malibu Velvet Sofa, Ultramarine', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/9fcde7439aaf729b319a90682104db6a_large.jpg?v=1652200878', 3350.0000, NULL, 1, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (35, N'Ditmar Sofa, Cream', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/bf09a834968fd7b31e1f1512ffededcb_large.jpg?v=1641923741', 3000.0000, NULL, 1, 4)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (36, N'LERHAMN', N'https://www.ikea.com/gb/en/images/products/lerhamn-table-and-4-chairs-light-antique-stain-white-stain-vittaryd-beige__0732510_pe738650_s5.jpg?f=s', 249.0000, NULL, 1, 5)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (37, N'INGATORP / INGOLF', N'https://www.ikea.com/gb/en/images/products/ingatorp-ingolf-table-and-6-chairs-white-white__0737452_pe741101_s5.jpg?f=s', 579.0000, NULL, 1, 5)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (38, N'LISABO / LEIFARNE', N'https://www.ikea.com/gb/en/images/products/lisabo-leifarne-table-and-4-chairs-ash-veneer-white__0737981_pe741282_s5.jpg?f=s', 369.0000, NULL, 1, 5)
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID]) VALUES (39, N'SANDSBERG', N'https://www.ikea.com/gb/en/images/products/sandsberg-table-and-2-chairs-black-black__1074351_pe856166_s5.jpg?f=s', 69.0000, NULL, 1, 5)
GO
SET IDENTITY_INSERT [dbo].[UserInfo] ON 

INSERT [dbo].[UserInfo] ([id], [First_Name], [Last_Name], [Birthday], [Gender], [Email], [PhoneNumber], [Username], [Password], [Address], [AccountId]) VALUES (CAST(1 AS Numeric(18, 0)), N'Can', N'Nam', CAST(N'2002-12-29' AS Date), N'true', N'nampro2k2@gmail.com', CAST(123456789 AS Numeric(18, 0)), N'nam', N'123456789', N'Ha Noi', CAST(1 AS Numeric(18, 0)))
SET IDENTITY_INSERT [dbo].[UserInfo] OFF
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK_Cart_Account] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK_Cart_Account]
GO
USE [master]
GO
ALTER DATABASE [ProjectPRO] SET  READ_WRITE 
GO
