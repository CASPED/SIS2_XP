-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-09-2015 a las 12:19:49
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `transporte`
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
  `LONGITUD_PARADA` double DEFAULT NULL,
  `LATITUD_PARADA` double DEFAULT NULL,
  `TNORTE_PARADA` double DEFAULT NULL,
  `TSUR_PARADA` double DEFAULT NULL,
  `TOESTE_PARADA` double DEFAULT NULL,
  `TESTE_PARADA` double DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `paradas`
--

INSERT INTO `paradas` (`ID_PARADA`, `NOMBRE_PARADA`, `LONGITUD_PARADA`, `LATITUD_PARADA`, `TNORTE_PARADA`, `TSUR_PARADA`, `TOESTE_PARADA`, `TESTE_PARADA`) VALUES
(1, 'colomi', 123123, 234234, 345345, 456456, 678678, 567567),
(2, 'sacaba', 12123, 23345, 45456, 56345, 45567, 56234),
(3, 'quillacollo', 23, 34, 45567, 23234, 21234, 34456),
(4, 'parada01', 123123, 234234, 345345, 456456, 678678, 567567),
(5, 'parada03', 23, 12, 345, 234, 123, 234),
(6, 'parada05', 12.123, 234, 345, 123, 234, 23),
(7, 'joda01', 123.12342345345, 123123, 123, 23, 214, 345),
(8, 'parada07', 123.12323, 234234.234234, 123.235435, 123345.546457, 23.23, 123.23);

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
 ADD PRIMARY KEY (`ID_ASIGNACIONBC`), ADD KEY `ID_LINEA` (`ID_LINEA`), ADD KEY `ID_BUS` (`ID_BUS`), ADD KEY `ID_CONDUCTOR` (`ID_CONDUCTOR`);

--
-- Indices de la tabla `bus`
--
ALTER TABLE `bus`
 ADD PRIMARY KEY (`ID_BUS`), ADD KEY `ID_LINEA` (`ID_LINEA`);

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
 ADD PRIMARY KEY (`ID_RUTA`), ADD KEY `ID_LINEA` (`ID_LINEA`), ADD KEY `ID_PARADA` (`ID_PARADA`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
 ADD PRIMARY KEY (`ID_VENTA`), ADD KEY `ID_PASAJERO` (`ID_PASAJERO`), ADD KEY `ID_LINEA` (`ID_LINEA`), ADD KEY `ID_BUS` (`ID_BUS`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asignacion_bus_conductor`
--
ALTER TABLE `asignacion_bus_conductor`
MODIFY `ID_ASIGNACIONBC` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `bus`
--
ALTER TABLE `bus`
MODIFY `ID_BUS` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `conductor`
--
ALTER TABLE `conductor`
MODIFY `ID_CONDUCTOR` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `linea`
--
ALTER TABLE `linea`
MODIFY `ID_LINEA` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `paradas`
--
ALTER TABLE `paradas`
MODIFY `ID_PARADA` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `pasajero`
--
ALTER TABLE `pasajero`
MODIFY `ID_PASAJERO` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
MODIFY `ID_VENTA` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignacion_bus_conductor`
--
ALTER TABLE `asignacion_bus_conductor`
ADD CONSTRAINT `fk_bus_tiene_asignaciones` FOREIGN KEY (`ID_BUS`) REFERENCES `bus` (`ID_BUS`),
ADD CONSTRAINT `fk_conductor_tiene_asignaciones` FOREIGN KEY (`ID_CONDUCTOR`) REFERENCES `conductor` (`ID_CONDUCTOR`),
ADD CONSTRAINT `fk_linea_tiene_asignaciones` FOREIGN KEY (`ID_LINEA`) REFERENCES `linea` (`ID_LINEA`);

--
-- Filtros para la tabla `bus`
--
ALTER TABLE `bus`
ADD CONSTRAINT `fk_linea_tiene_buses` FOREIGN KEY (`ID_LINEA`) REFERENCES `linea` (`ID_LINEA`);

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
ADD CONSTRAINT `fk_linea_paradas` FOREIGN KEY (`ID_LINEA`) REFERENCES `linea` (`ID_LINEA`),
ADD CONSTRAINT `fk_parada_rutas` FOREIGN KEY (`ID_PARADA`) REFERENCES `paradas` (`ID_PARADA`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
ADD CONSTRAINT `fk_bus_tiene_ventas` FOREIGN KEY (`ID_BUS`) REFERENCES `bus` (`ID_BUS`),
ADD CONSTRAINT `fk_linea_tiene_ventas` FOREIGN KEY (`ID_LINEA`) REFERENCES `linea` (`ID_LINEA`),
ADD CONSTRAINT `fk_pasajeros_tiene_ventas` FOREIGN KEY (`ID_PASAJERO`) REFERENCES `pasajero` (`ID_PASAJERO`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
