insert into paradas ( ID_PARADA, NOMBRE_PARADA, LONGITUD_PARADA, 
LATITUD_PARADA, TNORTE_PARADA, TSUR_PARADA, TOESTE_PARADA, TESTE_PARADA )
values ( 0, "Sacaba", -17.4073214, -66.03781, 0.0, 0.0, 0.0, 0.0), 
( 1, "Cochabamba", -17.39404, -66.1638756, 0.0, 0.0132814, 0.0, 0.1260656), 
( 2, "Quillacollo", -17.4024704, -66.2554848, 0.0084304, 0.0, 0.0, 0.0916092), 
( 3, "Vinto", -17.4222139, -66.3140902, 0.0197435, 0.0, 0.0, 0.0586054), 
(4, "Sipe Sipe", -17.4232373,-66.3267879, 0.0010234, 0.0, 0.0, 0.0126977);

insert into linea (ID_LINEA, NOMBRE_LINEA) values (0, "A");

insert into ruta (ID_PARADA, ID_LINEA, ID_RUTA) 
values (0, 0, 0), (1, 0, 0), (2, 0, 0), (3, 0, 0), (4, 0, 0);
