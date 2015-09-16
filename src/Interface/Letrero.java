package Interface;

import Transporte.Chofer;
import Transporte.Controlador;
import Transporte.Coordinates;
import Transporte.velocimetro;
import bd.transporte.recorrido.BDRuta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.Timer;
import transporte.recorrido.ControladorDeRecorrido;
import transporte.recorrido.Punto;

public class Letrero extends javax.swing.JPanel {

    public String hora;
    public Controlador cont;
    velocimetro veloc;

    private Punto este_bus;
    private String nombre_de_parada_anterior;
    private String nombre_de_parada_siguiente;
    private ControladorDeRecorrido unControladorDeRecorrido;
    private Coordinates coordenadas_de_este_bus;

    /**
     * Ruta
     */
    public final void ruta() {
	double una_latitud = -1.00000;
	double una_longitud = -1.00000;
	double una_tolerancia_en_latitud_norte = 0.0;
	double una_tolerancia_en_latitud_sur = 0.0;
	double una_tolerancia_en_longitud_este = 0.0;
	double una_tolerancia_en_longitud_oeste = 0.0;
	este_bus = new Punto("este_bus", una_latitud, una_longitud, una_tolerancia_en_latitud_norte, una_tolerancia_en_latitud_sur, una_tolerancia_en_longitud_este, una_tolerancia_en_longitud_oeste);

	unControladorDeRecorrido = new ControladorDeRecorrido(este_bus);
	BDRuta la_ruta = new BDRuta("A");
	la_ruta.consultar();

	while (la_ruta.tenga_mas_paradas()) {
	    unControladorDeRecorrido.agregarUnPunto(la_ruta.siguiente_parada());
	}
    }

    public void actualizar_la_posicion_de_este_bus() {
	este_bus.latitud = coordenadas_de_este_bus.getLatitude();
	este_bus.longitud = coordenadas_de_este_bus.getLongitude();

	if (unControladorDeRecorrido.estaElBusEnElRadioDeAlcanceDeAlgunPunto()) {
	    nombre_de_parada_anterior = nombre_de_parada_siguiente;
	    nombre_de_parada_siguiente = unControladorDeRecorrido.nombre_del_punto_al_que_el_bus_se_dirije();
	    
	    jTextActual.setText(nombre_de_parada_anterior);
	    jTextProximo.setText(nombre_de_parada_siguiente);
	}
    }

    public Letrero() {

	initComponents();
	Hora();
	cont = new Controlador();
	veloc = new velocimetro();

	ruta();
	coordenadas_de_este_bus = new Coordinates(0, 0);
	nombre_de_parada_anterior = "";
	nombre_de_parada_siguiente = "";
	iniciar_componentes_de_la_ruta();

	init();
    }

    private void iniciar_componentes_de_la_ruta() {
	jTextActual.setText(nombre_de_parada_anterior);
	jTextProximo.setText(nombre_de_parada_siguiente);
    }

    private void init() {
	new Timer(1000, actualizarPanel).start();
    }

    public void Hora() {
	Calendar calcular = Calendar.getInstance();
	hora = calcular.get(Calendar.HOUR_OF_DAY) + ":" + calcular.get(Calendar.MINUTE) + ":" + calcular.get(Calendar.SECOND);
	jTextHora.setText(hora);
	System.out.println("Hora: " + hora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextActual = new javax.swing.JTextField();
        jTextProximo = new javax.swing.JTextField();
        jTextVelocidad = new javax.swing.JTextField();
        jTextConductor = new javax.swing.JTextField();
        jTextActivo = new javax.swing.JTextField();
        jTextBus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextHora = new javax.swing.JTextField();
        jTextPasajeros = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(900, 255));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ACTUAL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PROXIMO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("VELOCIDAD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CONDUCTOR");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BUS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("HORA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ACTIVO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("PASAJEROS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Km/h");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Hrs.");

        jTextActual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextActual.setText("TORO TORO");
        jTextActual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextActualActionPerformed(evt);
            }
        });

        jTextProximo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextProximo.setText("CAPINOTA");
        jTextProximo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProximoActionPerformed(evt);
            }
        });

        jTextVelocidad.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextVelocidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextVelocidad.setText("100");
        jTextVelocidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVelocidadActionPerformed(evt);
            }
        });

        jTextConductor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextConductor.setText("Irvin Monte Rosa");
        jTextConductor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextConductorActionPerformed(evt);
            }
        });

        jTextActivo.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextActivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextActivo.setText("04:30");
        jTextActivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextActivoActionPerformed(evt);
            }
        });

        jTextBus.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextBus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextBus.setText("225");
        jTextBus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Hrs.");

        jTextHora.setBackground(new java.awt.Color(204, 204, 204));
        jTextHora.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextHora.setText("00:00:00");
        jTextHora.setBorder(null);
        jTextHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHoraActionPerformed(evt);
            }
        });

        jTextPasajeros.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextPasajeros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPasajeros.setText("25");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextBus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextActual, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel1)
                                    .addGap(274, 274, 274)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel4)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel3))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addGap(9, 9, 9))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextActual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jTextPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProximoActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jTextProximoActionPerformed

    private void jTextActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextActualActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jTextActualActionPerformed

    private void jTextVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVelocidadActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jTextVelocidadActionPerformed

    private void jTextHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHoraActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jTextHoraActionPerformed

    private void jTextConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextConductorActionPerformed

    }//GEN-LAST:event_jTextConductorActionPerformed

    private void jTextActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextActivoActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jTextActivoActionPerformed

    private ActionListener actualizarPanel = new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
	    Hora();
	    Activo();
	    velocidad();
	    actualizar_la_posicion_de_este_bus();
	}

    };

    private void Activo() {
	jTextActivo.setText(cont.getHora());
	String[] list = cont.getHora().split(":");
	jTextActivo.setBackground(cont.getColor());

    }

    private void velocidad() {

	jTextVelocidad.setText("" + veloc.getVel());
	jTextVelocidad.setBackground(veloc.getcolor());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextActivo;
    private javax.swing.JTextField jTextActual;
    private javax.swing.JTextField jTextBus;
    private javax.swing.JTextField jTextConductor;
    private javax.swing.JTextField jTextHora;
    private javax.swing.JTextField jTextPasajeros;
    private javax.swing.JTextField jTextProximo;
    private javax.swing.JTextField jTextVelocidad;
    // End of variables declaration//GEN-END:variables
}
