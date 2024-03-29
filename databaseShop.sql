USE [master]
GO
/****** Object:  Database [ProjectPRO]    Script Date: 7/18/2022 3:03:44 PM ******/
CREATE DATABASE [ProjectPRO]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dataShopNew', FILENAME = N'D:\SQL\MSSQL15.MSSQLSERVER\MSSQL\DATA\dataShopNew.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'dataShopNew_log', FILENAME = N'D:\SQL\MSSQL15.MSSQLSERVER\MSSQL\DATA\dataShopNew_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
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
/****** Object:  Table [dbo].[Account]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[role] [int] NULL,
 CONSTRAINT [PK__Account__DD771E3CBA19E034] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[AccountID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Amount] [int] NULL,
 CONSTRAINT [PK_Cart] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC,
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
	[quantity] [int] NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[accountId] [int] NOT NULL,
	[totalPrice] [float] NOT NULL,
	[note] [nvarchar](max) NOT NULL,
	[createdDate] [date] NOT NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[order_id] [int] NOT NULL,
	[quantity] [int] NOT NULL,
	[productId] [int] NOT NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderHistory]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderHistory](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[accountId] [int] NOT NULL,
	[totalPrice] [float] NOT NULL,
	[note] [nvarchar](max) NOT NULL,
	[createdDate] [date] NOT NULL,
	[confirmDate] [date] NOT NULL,
	[shippingId] [int] NOT NULL,
	[orderId] [int] NOT NULL,
 CONSTRAINT [PK_OrderHistory] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[image] [nvarchar](max) NOT NULL,
	[price] [money] NOT NULL,
	[description] [nvarchar](max) NULL,
	[quantity] [int] NOT NULL,
	[cateID] [int] NOT NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Shipping]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Shipping](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NOT NULL,
	[phone] [nvarchar](max) NOT NULL,
	[address] [nvarchar](max) NOT NULL,
	[order_id] [int] NULL,
 CONSTRAINT [PK_Shipping] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[UserInfo]    Script Date: 7/18/2022 3:03:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserInfo](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[First_Name] [nvarchar](max) NOT NULL,
	[Last_Name] [nvarchar](max) NOT NULL,
	[Birthday] [date] NULL,
	[Gender] [bit] NULL,
	[Email] [nvarchar](max) NOT NULL,
	[PhoneNumber] [nvarchar](max) NOT NULL,
	[Username] [nvarchar](max) NOT NULL,
	[Password] [nvarchar](max) NOT NULL,
	[Address] [nvarchar](max) NULL,
	[AccountId] [int] NOT NULL,
 CONSTRAINT [PK_registerInfo] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 
GO
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (1, N'Adam', N'1234', 1)
GO
INSERT [dbo].[Account] ([id], [username], [password], [role]) VALUES (28, N'mra', N'12345', 0)
GO
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[Category] ON 
GO
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (1, N'Chair', 15)
GO
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (2, N'Table', 7)
GO
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (3, N'Bed', 5)
GO
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (4, N'Sofa', 6)
GO
INSERT [dbo].[Category] ([cid], [cname], [quantity]) VALUES (5, N'Chair and Table', 6)
GO
SET IDENTITY_INSERT [dbo].[Category] OFF
GO
SET IDENTITY_INSERT [dbo].[Order] ON 
GO
INSERT [dbo].[Order] ([id], [accountId], [totalPrice], [note], [createdDate], [status]) VALUES (24, 1, 40, N'', CAST(N'2022-07-18' AS Date), 1)
GO
SET IDENTITY_INSERT [dbo].[Order] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderDetail] ON 
GO
INSERT [dbo].[OrderDetail] ([id], [order_id], [quantity], [productId]) VALUES (28, 24, 1, 3)
GO
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderHistory] ON 
GO
INSERT [dbo].[OrderHistory] ([id], [accountId], [totalPrice], [note], [createdDate], [confirmDate], [shippingId], [orderId]) VALUES (24, 1, 40, N'', CAST(N'2022-07-18' AS Date), CAST(N'2022-07-18' AS Date), 32, 24)
GO
SET IDENTITY_INSERT [dbo].[OrderHistory] OFF
GO
SET IDENTITY_INSERT [dbo].[product] ON 
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (1, N'Wooden Chair', N'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/beetle-chair-07-1508956886.jpeg?crop=0.793xw:1.00xh;0.123xw,0&resize=980:*', 66.0000, N'abcde', 8, 1, 0)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (2, N'Single Armchair', N'https://i.pinimg.com/564x/54/1d/d4/541dd467d515c5b93a024391eb3f0796.jpg	', 30.0000, NULL, 9, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (3, N'Wooden Airchair', N'https://www.seekpng.com/png/full/6-67645_wooden-chair-png-chair-png.png', 40.0000, NULL, 8, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (4, N'Stylish Chair', N'https://www.seekpng.com/png/full/339-3399322_ikea-poang-armchair-png-ikea-poang-chair.png', 100.0000, NULL, 9, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (5, N'Modern Chair', N'https://cdn.conranshop.co.uk/media/catalog/product/cache/8a394d7302b6f57bd505c0072f6cff11/5/5/558976_e8e8.jpg', 120.0000, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (6, N'Mapple Wood Dinning Table', N'https://m.media-amazon.com/images/I/61mzgMEGJvL.jpg', 140.0000, NULL, 8, 2, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (7, N'Arm Chair', N'https://pngimg.com/uploads/sofa/sofa_PNG6960.png', 90.0000, NULL, 9, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (8, N'Wooden Bed', N'http://img.roomeon.com/img/object/ikea-malm-bed-frame-beds_540222c0c1_c9.png', 140.0000, NULL, 10, 3, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (9, N'Designed Sofa', N'https://static.dezeen.com/uploads/2017/02/john-pawson-interiors-studio-london-houses-residential-roundups_dezeen_sq-1704x1704.jpg', 160.0000, NULL, 10, 4, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (10, N'Dinning Table', N'https://furniture123.co.uk/Images/NTW001A_1_11081929_Supersize.jpg?width=650&height=650&v=56', 200.0000, NULL, 10, 2, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (11, N'Chair and Table', N'https://www1.pictures.lonny.com/mp/W-M9_849Smml.jpg', 100.0000, NULL, 10, 5, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (12, N'Modern Arm Chair', N'https://5.imimg.com/data5/JN/HR/MY-12662993/acrylic-bubble-swing-500x500.jpg', 299.9090, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (13, N'Cloth Covered Accent Chair', N'https://i.pinimg.com/564x/35/47/49/354749e4cd786886620554df1925c343.jpg', 399.9090, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (14, N'Mapple Wood Accent Chair', N'https://purepng.com/public/uploads/large/purepng.com-chair-brown-greyobjectschair-brown-greychair-furniture-decoration-821523987859athd6.png', 199.9090, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (15, N'Valvet Accent Arm Chair	', N'https://www.nicepng.com/png/full/26-268977_armchair-png-image-comfy-chair-png.png', 299.9090, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (16, N'Stoole and Chair	', N'https://i.pinimg.com/564x/1d/5e/6d/1d5e6debdf3b81d754f0c2a23d6b6ac2.jpg', 99.0000, NULL, 10, 5, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (17, N'Hudson Modern Velvet Accent Chair	', N'https://m.media-amazon.com/images/I/911OSzao-SL._AC_SX679_.jpg', 99.0000, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (18, N'Fatstool Chair', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/a/fats01mb0404bl_2_1.jpg', 1230.0000, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (19, N'Micro WingBack Sofa Chair', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/m/i/micro_sofa_hallingdal_190_na_angle_1.jpg	', 5100.0000, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (20, N'Scoop Chair HighBack Wool', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/s/c/scoop_high_front_grey_1.jpg', 1500.0000, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (21, N'Slab Bar Stool Black Chair', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/w/o/wos01bl_slab_bar_stool_black_main.jpg', 486.0000, NULL, 10, 1, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (22, N'Screw Cafe Table Pebble Marble Top 900mm', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/s/c/screw-_-900-pebble_3.jpg', 3060.0000, NULL, 10, 2, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (23, N'Stone Table Circle', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/l/flash-circle-black-angled-side_1.jpg', 1440.0000, NULL, 10, 2, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (24, N'Spun Table Short Brass', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/s/u/sut01b_spun_table_short_brass_main.jpg', 1800.0000, NULL, 10, 2, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (25, N'Flash Table Square Brash', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/l/flash_square_brass_angle_200_1.jpg', 966.0000, NULL, 10, 2, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (26, N'Flash Table Circle Black', N'https://cdn.tomdixon.net/media/catalog/product/cache/9ab373c3da82d144a5b6f9f279186d3f/f/l/flash_circle_black_angle_176.jpg', 696.0000, NULL, 10, 2, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (27, N'Chateauneuf Rustic Rattan French Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/c/h/chateauneuf-rustic-rattan-bed.jpg', 1495.0000, NULL, 10, 3, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (28, N'Love In Idleness Reversible Upholstered Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/l/o/love-in-idleness-stripe-1.jpg', 1605.0000, NULL, 10, 3, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (29, N'Love Story Naturelle Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/b/e/bed-new-main_2.jpg', 1295.0000, NULL, 10, 3, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (30, N'Lit DAmour, Low Footboard Linen Upholstered Bed', N'https://www.frenchbedroomcompany.co.uk/media/catalog/product/cache/22645cf3c63ecad70872d3c84b988aac/l/i/lit-d_amour-low-footboard-bed-1_3.jpg', 1995.0000, NULL, 10, 3, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (31, N'Plaza Sofa', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/bdc3eaf7231b708eff63bddfddcaf059_large.jpg?v=1643019238', 2995.0000, NULL, 10, 4, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (32, N'Suzanna Sofa', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/ce3cffab64ca67d86d5150d94514e9a4_large.jpg?v=1646045647', 2850.0000, NULL, 10, 4, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (33, N'Brigitte Boucle Sectional Sofa, Oatmeal', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/7ec058b0da4bf0e300d9b687e4601345_large.jpg?v=1652263166', 5400.0000, NULL, 10, 4, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (34, N'Malibu Velvet Sofa, Ultramarine', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/9fcde7439aaf729b319a90682104db6a_large.jpg?v=1652200878', 3350.0000, NULL, 10, 4, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (35, N'Ditmar Sofa, Cream', N'https://cdn.shopify.com/s/files/1/0004/4630/0222/products/bf09a834968fd7b31e1f1512ffededcb_large.jpg?v=1641923741', 3000.0000, NULL, 10, 4, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (36, N'LERHAMN', N'https://www.ikea.com/gb/en/images/products/lerhamn-table-and-4-chairs-light-antique-stain-white-stain-vittaryd-beige__0732510_pe738650_s5.jpg?f=s', 249.0000, NULL, 10, 5, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (37, N'INGATORP / INGOLF', N'https://www.ikea.com/gb/en/images/products/ingatorp-ingolf-table-and-6-chairs-white-white__0737452_pe741101_s5.jpg?f=s', 579.0000, NULL, 10, 5, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (38, N'LISABO / LEIFARNE', N'https://www.ikea.com/gb/en/images/products/lisabo-leifarne-table-and-4-chairs-ash-veneer-white__0737981_pe741282_s5.jpg?f=s', 369.0000, NULL, 10, 5, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (39, N'SANDSBERG', N'https://www.ikea.com/gb/en/images/products/sandsberg-table-and-2-chairs-black-black__1074351_pe856166_s5.jpg?f=s', 69.0000, NULL, 10, 5, 1)
GO
INSERT [dbo].[product] ([id], [name], [image], [price], [description], [quantity], [cateID], [status]) VALUES (44, N'Cloth and Wood', N'https://thuonghieuweb.com/templates/banhang/aranoz/img/banner_img.png', 300.0000, NULL, 1, 5, 1)
GO
SET IDENTITY_INSERT [dbo].[product] OFF
GO
SET IDENTITY_INSERT [dbo].[Shipping] ON 
GO
INSERT [dbo].[Shipping] ([id], [name], [phone], [address], [order_id]) VALUES (32, N'Can Nam', N'123456789123', N' Ha Noi', 24)
GO
SET IDENTITY_INSERT [dbo].[Shipping] OFF
GO
SET IDENTITY_INSERT [dbo].[UserInfo] ON 
GO
INSERT [dbo].[UserInfo] ([id], [First_Name], [Last_Name], [Birthday], [Gender], [Email], [PhoneNumber], [Username], [Password], [Address], [AccountId]) VALUES (1, N'Can', N'Nam', CAST(N'2002-12-29' AS Date), 1, N'nampro2k2@gmail.com', N'123456789123', N'Adam', N'1234', N'Ha Noi', 1)
GO
INSERT [dbo].[UserInfo] ([id], [First_Name], [Last_Name], [Birthday], [Gender], [Email], [PhoneNumber], [Username], [Password], [Address], [AccountId]) VALUES (4, N'Nam1', N'Nam', CAST(N'2022-07-04' AS Date), 1, N'nampro2t2@gmail.com', N'123456789123', N'mra', N'12345', N'', 28)
GO
SET IDENTITY_INSERT [dbo].[UserInfo] OFF
GO
ALTER TABLE [dbo].[Order] ADD  CONSTRAINT [DF_Order_createdDate]  DEFAULT (getdate()) FOR [createdDate]
GO
ALTER TABLE [dbo].[OrderHistory] ADD  CONSTRAINT [DF_OrderHistory_confirmDate]  DEFAULT (getdate()) FOR [confirmDate]
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK_Cart_Account] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK_Cart_Account]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Account] FOREIGN KEY([accountId])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Account]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Order] FOREIGN KEY([order_id])
REFERENCES [dbo].[Order] ([id])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Order]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_product] FOREIGN KEY([productId])
REFERENCES [dbo].[product] ([id])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_product]
GO
ALTER TABLE [dbo].[OrderHistory]  WITH CHECK ADD  CONSTRAINT [FK_OrderHistory_Order] FOREIGN KEY([orderId])
REFERENCES [dbo].[Order] ([id])
GO
ALTER TABLE [dbo].[OrderHistory] CHECK CONSTRAINT [FK_OrderHistory_Order]
GO
ALTER TABLE [dbo].[OrderHistory]  WITH CHECK ADD  CONSTRAINT [FK_OrderHistory_Shipping] FOREIGN KEY([shippingId])
REFERENCES [dbo].[Shipping] ([id])
GO
ALTER TABLE [dbo].[OrderHistory] CHECK CONSTRAINT [FK_OrderHistory_Shipping]
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK_product_Category] FOREIGN KEY([cateID])
REFERENCES [dbo].[Category] ([cid])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK_product_Category]
GO
ALTER TABLE [dbo].[Shipping]  WITH CHECK ADD  CONSTRAINT [FK_Shipping_Order1] FOREIGN KEY([order_id])
REFERENCES [dbo].[Order] ([id])
GO
ALTER TABLE [dbo].[Shipping] CHECK CONSTRAINT [FK_Shipping_Order1]
GO
ALTER TABLE [dbo].[UserInfo]  WITH CHECK ADD  CONSTRAINT [FK_UserInfo_Account] FOREIGN KEY([AccountId])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[UserInfo] CHECK CONSTRAINT [FK_UserInfo_Account]
GO
USE [master]
GO
ALTER DATABASE [ProjectPRO] SET  READ_WRITE 
GO
