create database sisbdxp;
use sisbdxp;

-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-09-2015 a las 21:58:22
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sis 2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion_bus_conductor`
--

CREATE TABLE IF NOT EXISTS `asignacion_bus_conductor` (
  `ID_LINEA` int(11) NOT NULL,
  `ID_BUS` int(11) NOT NULL,
  `ID_CONDUCTOR` int(11) NOT NULL,
  `ID_ASIGNACIONBC` int(11) NOT NULL,
  `FECHA_ASIGNACIONBC` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus`
--

CREATE TABLE IF NOT EXISTS `bus` (
  `ID_LINEA` int(11) NOT NULL,
  `ID_BUS` int(11) NOT NULL,
  `PLACA` varchar(9) DEFAULT NULL,
  `LINEA` varchar(9) DEFAULT NULL,
  `CAPACIDAD` int(11) DEFAULT NULL,
  `ESTADO` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

CREATE TABLE IF NOT EXISTS `conductor` (
  `ID_CONDUCTOR` int(11) NOT NULL,
  `NOMBRE_CONDUCTOR` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `linea`
--

CREATE TABLE IF NOT EXISTS `linea` (
  `ID_LINEA` int(11) NOT NULL,
  `NOMBRE_LINEA` char(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paradas`
--

CREATE TABLE IF NOT EXISTS `paradas` (
  `ID_PARADA` int(11) NOT NULL,
  `NOMBRE_PARADA` varchar(50) DEFAULT NULL,
  `LONGITUD_PARADA` decimal(10,7) DEFAULT NULL,
  `LATITUD_PARADA` decimal(10,7) DEFAULT NULL,
  `TNORTE_PARADA` decimal(10,7) DEFAULT NULL,
  `TSUR_PARADA` decimal(10,7) DEFAULT NULL,
  `TOESTE_PARADA` decimal(10,7) DEFAULT NULL,
  `TESTE_PARADA` decimal(10,7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pasajero`
--

CREATE TABLE IF NOT EXISTS `pasajero` (
  `ID_PASAJERO` int(11) NOT NULL,
  `NOMBRE_PASAJERO` varchar(50) DEFAULT NULL,
  `APELLIDO_PASAJERO` varchar(50) DEFAULT NULL,
  `EDAD_PASAJERO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE IF NOT EXISTS `ruta` (
  `ID_PARADA` int(11) NOT NULL,
  `ID_LINEA` int(11) NOT NULL,
  `ID_RUTA` int(11) NOT NULL,
  `FECHA_RUTA` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `ID_PASAJERO` int(11) NOT NULL,
  `ID_LINEA` int(11) NOT NULL,
  `ID_BUS` int(11) NOT NULL,
  `ID_VENTA` int(11) NOT NULL,
  `FECHA_VENTA` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `COSTO` int(11) DEFAULT NULL,
  `PARTIDA` varchar(50) DEFAULT NULL,
  `DESTINO` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asignacion_bus_conductor`
--
ALTER TABLE `asignacion_bus_conductor`
 ADD PRIMARY KEY (`ID_LINEA`,`ID_BUS`,`ID_CONDUCTOR`,`ID_ASIGNACIONBC`), ADD KEY `FK_RELATIONSHIP_7` (`ID_CONDUCTOR`);

--
-- Indices de la tabla `bus`
--
ALTER TABLE `bus`
 ADD PRIMARY KEY (`ID_LINEA`,`ID_BUS`);

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
 ADD PRIMARY KEY (`ID_CONDUCTOR`);

--
-- Indices de la tabla `linea`
--
ALTER TABLE `linea`
 ADD PRIMARY KEY (`ID_LINEA`);

--
-- Indices de la tabla `paradas`
--
ALTER TABLE `paradas`
 ADD PRIMARY KEY (`ID_PARADA`);

--
-- Indices de la tabla `pasajero`
--
ALTER TABLE `pasajero`
 ADD PRIMARY KEY (`ID_PASAJERO`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
 ADD PRIMARY KEY (`ID_PARADA`,`ID_LINEA`,`ID_RUTA`), ADD KEY `FK_RELATIONSHIP_9` (`ID_LINEA`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
 ADD PRIMARY KEY (`ID_PASAJERO`,`ID_LINEA`,`ID_BUS`,`ID_VENTA`), ADD KEY `FK_RELATIONSHIP_2` (`ID_LINEA`,`ID_BUS`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignacion_bus_conductor`
--
ALTER TABLE `asignacion_bus_conductor`
ADD CONSTRAINT `FK_RELATIONSHIP_6` FOREIGN KEY (`ID_LINEA`, `ID_BUS`) REFERENCES `bus` (`ID_LINEA`, `ID_BUS`),
ADD CONSTRAINT `FK_RELATIONSHIP_7` FOREIGN KEY (`ID_CONDUCTOR`) REFERENCES `conductor` (`ID_CONDUCTOR`);

--
-- Filtros para la tabla `bus`
--
ALTER TABLE `bus`
ADD CONSTRAINT `FK_RELATIONSHIP_3` FOREIGN KEY (`ID_LINEA`) REFERENCES `linea` (`ID_LINEA`);

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
ADD CONSTRAINT `FK_RELATIONSHIP_8` FOREIGN KEY (`ID_PARADA`) REFERENCES `paradas` (`ID_PARADA`),
ADD CONSTRAINT `FK_RELATIONSHIP_9` FOREIGN KEY (`ID_LINEA`) REFERENCES `linea` (`ID_LINEA`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
ADD CONSTRAINT `FK_RELATIONSHIP_1` FOREIGN KEY (`ID_PASAJERO`) REFERENCES `pasajero` (`ID_PASAJERO`),
ADD CONSTRAINT `FK_RELATIONSHIP_2` FOREIGN KEY (`ID_LINEA`, `ID_BUS`) REFERENCES `bus` (`ID_LINEA`, `ID_BUS`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
