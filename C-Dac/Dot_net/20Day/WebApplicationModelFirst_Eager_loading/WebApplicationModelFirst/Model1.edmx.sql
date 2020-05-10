
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, and Azure
-- --------------------------------------------------
-- Date Created: 12/22/2016 23:13:53
-- Generated from EDMX file: D:\dot_net\Day_wise\day13asp\02Application state\WebApplicationModelFirst\WebApplicationModelFirst\Model1.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [Sample];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[FK_MyDeptMyEmployeeData]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[MyEmployeeDatas] DROP CONSTRAINT [FK_MyDeptMyEmployeeData];
GO

-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[MyEmployeeDatas]', 'U') IS NOT NULL
    DROP TABLE [dbo].[MyEmployeeDatas];
GO
IF OBJECT_ID(N'[dbo].[MyDepts]', 'U') IS NOT NULL
    DROP TABLE [dbo].[MyDepts];
GO

-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'MyEmployeeDatas'
CREATE TABLE [dbo].[MyEmployeeDatas] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Name] nvarchar(max)  NOT NULL,
    [Salary] decimal(18,0)  NOT NULL,
    [MyDeptId] int  NOT NULL
);
GO

-- Creating table 'MyDepts'
CREATE TABLE [dbo].[MyDepts] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Name] nvarchar(max)  NOT NULL,
    [Number] smallint  NOT NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [Id] in table 'MyEmployeeDatas'
ALTER TABLE [dbo].[MyEmployeeDatas]
ADD CONSTRAINT [PK_MyEmployeeDatas]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'MyDepts'
ALTER TABLE [dbo].[MyDepts]
ADD CONSTRAINT [PK_MyDepts]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- Creating foreign key on [MyDeptId] in table 'MyEmployeeDatas'
ALTER TABLE [dbo].[MyEmployeeDatas]
ADD CONSTRAINT [FK_MyDeptMyEmployeeData]
    FOREIGN KEY ([MyDeptId])
    REFERENCES [dbo].[MyDepts]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;

-- Creating non-clustered index for FOREIGN KEY 'FK_MyDeptMyEmployeeData'
CREATE INDEX [IX_FK_MyDeptMyEmployeeData]
ON [dbo].[MyEmployeeDatas]
    ([MyDeptId]);
GO

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------