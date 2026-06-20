-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2024 at 11:18 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `librarymanagementsystemdata`
--

-- --------------------------------------------------------

--
-- Table structure for table `booksdata`
--

CREATE TABLE `booksdata` (
  `id` int(11) NOT NULL,
  `NameBook` varchar(127) NOT NULL,
  `author` varchar(127) NOT NULL,
  `ISBN` varchar(127) NOT NULL,
  `genre` varchar(127) NOT NULL,
  `year` int(11) NOT NULL,
  `language` varchar(127) NOT NULL DEFAULT 'English',
  `photobook` varchar(900) DEFAULT NULL,
  `bookfile` varchar(900) NOT NULL,
  `loanID` int(50) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booksdata`
--

INSERT INTO `booksdata` (`id`, `NameBook`, `author`, `ISBN`, `genre`, `year`, `language`, `photobook`, `bookfile`, `loanID`) VALUES
(1, 'Mastermind', 'Helen Goltz', '95236', 'null', 2009, 'English', 'C:UsersabdogDocumentsNetBeansProjectsLoginAndSingUpsrcLogin Icon3.png', 'C:\\Users\\abdog\\Desktop\\bookfile\\Mastermind.pdf', 0),
(4, 'A2', 'abdo', '123', 'lol', 2005, 'English', 'lol.png', 'file.pdf', 12),
(7, 'From Newton to Einstein ', 'Benjamin Harrow', '564', 'Changing Conceptions of the Universe', 2005, 'English', 'a', 'C:\\Users\\abdog\\Desktop\\bookfile\\From-Newton-to-Einstein.pdf', 0),
(11, 'لم يعد رجلا', 'Os', '9789933429448', 'null', 2016, 'العربية', 'C:\\Users\\abdog\\Desktop\\imagebook\\1_1.jpg', 'C:\\Users\\abdog\\Desktop\\bookfile\\لم يعد رجلا.pdf', 24),
(13, 'احببت وغدا', 'ahmed', '50', 'lol', 2005, 'العربيه', 'lol.png', 'C:UsersabdogDesktopookfileأحببت وغدا.pdf', 0);

-- --------------------------------------------------------

--
-- Table structure for table `loan`
--

CREATE TABLE `loan` (
  `ID` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_book` int(11) NOT NULL,
  `Date_of_receipt` date NOT NULL,
  `Return_Date` date NOT NULL,
  `Debit` double NOT NULL DEFAULT 0,
  `isReturned` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loan`
--

INSERT INTO `loan` (`ID`, `id_user`, `id_book`, `Date_of_receipt`, `Return_Date`, `Debit`, `isReturned`) VALUES
(1, 12, 13, '2024-05-12', '2024-05-17', 0, 1),
(2, 12, 1, '2024-05-12', '2024-05-14', 0, 1),
(3, 12, 4, '2024-05-12', '2024-05-18', 0, 0),
(4, 12, 12, '2024-05-13', '2024-05-20', 0, 1),
(5, 12, 1, '2024-05-13', '2024-05-15', 0, 1),
(6, 8, 13, '2024-05-13', '2024-05-18', 0, 1),
(7, 24, 11, '2024-05-13', '2024-05-16', 0, 0),
(8, 25, 1, '2024-05-13', '2024-05-17', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `fullName` varchar(127) NOT NULL,
  `email` varchar(127) NOT NULL,
  `password` varchar(127) NOT NULL,
  `Book_Loan_ID_1` int(11) DEFAULT NULL,
  `Book_Loan_ID_2` int(11) DEFAULT NULL,
  `Book_Loan_ID_3` int(11) DEFAULT NULL,
  `Debit` double NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `fullName`, `email`, `password`, `Book_Loan_ID_1`, `Book_Loan_ID_2`, `Book_Loan_ID_3`, `Debit`) VALUES
(5, 'Abdo', 'Abdo@gmail.com', '123456789', NULL, NULL, NULL, 0),
(6, 'Ahmed', 'Ahmed@gmail.com', '9517536842', NULL, NULL, NULL, 0),
(8, 'Sandy 123', 'sandy@gmail.com', 'sandy', NULL, NULL, NULL, 0),
(9, 'qwww', 'eeeeeeeeeeeeee', 'eeeeeeeeeeee', NULL, NULL, NULL, 0),
(10, 'SaSa', 'mostafa@gmail.com', '012356464', NULL, NULL, NULL, 0),
(11, 'lol', 'lol@gmail.com', 'lol', NULL, NULL, NULL, 0),
(12, 'Temsa7', 'x', 'x', NULL, 1, 4, 0),
(14, 'k', 'k', 'k', NULL, NULL, NULL, 0),
(15, 'w', 'w', 'w', NULL, NULL, NULL, 0),
(16, 'a', 'a', 'a', NULL, NULL, NULL, 0),
(19, 't', 't', 't', NULL, NULL, NULL, 0),
(20, 'k', '5', 'k', NULL, NULL, NULL, 0),
(21, 'ffffffff', 'ffffffffffff', 'fffffffffffff', NULL, NULL, NULL, 0),
(22, 'ragab', 'ragab@gmail.com', 'ragab', NULL, NULL, NULL, 0),
(24, 'saif', '123', '123', 11, NULL, NULL, 0),
(25, 'Temsa7', '1234', '1234', NULL, NULL, NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booksdata`
--
ALTER TABLE `booksdata`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `ISBN` (`ISBN`),
  ADD UNIQUE KEY `bookfile` (`bookfile`) USING HASH,
  ADD UNIQUE KEY `bookfile_2` (`bookfile`) USING HASH;

--
-- Indexes for table `loan`
--
ALTER TABLE `loan`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email_3` (`email`),
  ADD UNIQUE KEY `Book_Loan_ID` (`Book_Loan_ID_1`),
  ADD UNIQUE KEY `Book_Loan_ID_2` (`Book_Loan_ID_2`),
  ADD UNIQUE KEY `Book_Loan_ID_3` (`Book_Loan_ID_3`),
  ADD KEY `email` (`email`),
  ADD KEY `email_2` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booksdata`
--
ALTER TABLE `booksdata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `loan`
--
ALTER TABLE `loan`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
