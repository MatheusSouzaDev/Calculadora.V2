package calculadora_avancada;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* Matheus de Souza */
public class calculos_esp extends javax.swing.JFrame {

    public calculos_esp() {
        initComponents();
    }

    public void exibir_bkr(double x1, double x2, double delta) {
        DecimalFormat formatar = new DecimalFormat("#");
        if (x1 % 1 == 0) {
            Lbl_x12.setText(formatar.format(x1));
        } else {
            Lbl_x12.setText(Double.toString(x1));
        }
        if (x2 % 1 == 0) {
            Lbl_x22.setText(formatar.format(x2));
        } else {
            Lbl_x22.setText(Double.toString(x2));
        }
        if (delta % 1 == 0) {
            Lbl_delta2.setText(formatar.format(delta));
        } else {
            Lbl_delta2.setText(Double.toString(delta));
        }
    }

    public void limpar_todos() {
        limpar_bkr();
        limpar_mdc();
        limpar_mmc();
        limpar_primo();
        limpar_ip();
        
    }
    public void limpar_bkr() {
        Txt_a.setText("");
        Txt_b.setText("");
        Txt_c.setText("");
        Lbl_delta2.setText("0");
        Lbl_x12.setText("0");
        Lbl_x22.setText("0");
    }
   
    public void limpar_primo() {
        Txt_numero_primo.setText("");
        Lbl_resultado_primo.setText("É primo (Sim/Não)?: ");
    }

    public void limpar_mmc() {
        Txt_numero1_mmc.setText("");
        Txt_numero2_mmc.setText("");
        Lbl_resultado_mmc.setText("MMC: ");
    }

    public void limpar_mdc() {
        Txt_numero1_mdc.setText("");
        Txt_numero2_mdc.setText("");
        Lbl_resultado_mdc.setText("MDC: ");
    }

    public void limpar_ip() {
        Txt_numero_ip.setText("");
        Lbl_resultado_ip.setText("Número (Par / Ímpar): ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_mdc = new javax.swing.JPanel();
        Lbl_numero1_mdc = new javax.swing.JLabel();
        Txt_numero1_mdc = new javax.swing.JTextField();
        Lbl_numero2_mdc = new javax.swing.JLabel();
        Txt_numero2_mdc = new javax.swing.JTextField();
        Btn_limpar_mdc = new javax.swing.JButton();
        Btn_verificar_mdc = new javax.swing.JButton();
        Lbl_resultado_mdc = new javax.swing.JLabel();
        Pnl_mmc = new javax.swing.JPanel();
        Lbl_numero1_mmc = new javax.swing.JLabel();
        Txt_numero1_mmc = new javax.swing.JTextField();
        Lbl_numero2_mmc = new javax.swing.JLabel();
        Txt_numero2_mmc = new javax.swing.JTextField();
        Btn_limpar_mmc = new javax.swing.JButton();
        Btn_verificar_mmc = new javax.swing.JButton();
        Lbl_resultado_mmc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Lbl_numero_primo = new javax.swing.JLabel();
        Txt_numero_primo = new javax.swing.JTextField();
        Btn_verificar_primo = new javax.swing.JButton();
        Btn_limpar_primo = new javax.swing.JButton();
        Lbl_resultado_primo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Txt_numero_ip = new javax.swing.JTextField();
        Lbl_numero_ip = new javax.swing.JLabel();
        Btn_verificar_ip = new javax.swing.JButton();
        Btn_limpar_ip = new javax.swing.JButton();
        Lbl_resultado_ip = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Lbl_numero1_bkr = new javax.swing.JLabel();
        Txt_a = new javax.swing.JTextField();
        Lbl_numero2_bkr = new javax.swing.JLabel();
        Txt_b = new javax.swing.JTextField();
        Txt_c = new javax.swing.JTextField();
        Lbl_numero3_bkr = new javax.swing.JLabel();
        Lbl_resultado_bkr = new javax.swing.JLabel();
        Lbl_x2 = new javax.swing.JLabel();
        Lbl_x22 = new javax.swing.JLabel();
        Lbl_x1 = new javax.swing.JLabel();
        Lbl_delta = new javax.swing.JLabel();
        Lbl_delta2 = new javax.swing.JLabel();
        Lbl_x12 = new javax.swing.JLabel();
        Btn_verificar_bkr = new javax.swing.JButton();
        Btn_limpar_bkr = new javax.swing.JButton();
        Btn_limpar_todos_esp = new javax.swing.JButton();
        Btn_fechar_formulario_esp = new javax.swing.JButton();
        Barra_de_menu = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        TELA_INICIAL = new javax.swing.JMenuItem();
        LIMPAR_TODOS = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();
        SOBRE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculos Especiais");
        setMaximumSize(new java.awt.Dimension(800, 410));
        setMinimumSize(new java.awt.Dimension(800, 410));
        setResizable(false);
        getContentPane().setLayout(null);

        Pnl_mdc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "MDC (Maior Divisor Comum):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        Pnl_mdc.setLayout(null);

        Lbl_numero1_mdc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero1_mdc.setText("Número 1:");
        Lbl_numero1_mdc.setToolTipText("");
        Pnl_mdc.add(Lbl_numero1_mdc);
        Lbl_numero1_mdc.setBounds(20, 50, 58, 15);

        Txt_numero1_mdc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pnl_mdc.add(Txt_numero1_mdc);
        Txt_numero1_mdc.setBounds(80, 50, 50, 20);

        Lbl_numero2_mdc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero2_mdc.setText("Número 2:");
        Lbl_numero2_mdc.setToolTipText("");
        Pnl_mdc.add(Lbl_numero2_mdc);
        Lbl_numero2_mdc.setBounds(20, 80, 58, 15);

        Txt_numero2_mdc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pnl_mdc.add(Txt_numero2_mdc);
        Txt_numero2_mdc.setBounds(80, 80, 50, 20);

        Btn_limpar_mdc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_limpar_mdc.setText("Limpar");
        Btn_limpar_mdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_limpar_mdcActionPerformed(evt);
            }
        });
        Pnl_mdc.add(Btn_limpar_mdc);
        Btn_limpar_mdc.setBounds(150, 80, 90, 23);

        Btn_verificar_mdc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_verificar_mdc.setText("Verificar");
        Btn_verificar_mdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_verificar_mdcActionPerformed(evt);
            }
        });
        Pnl_mdc.add(Btn_verificar_mdc);
        Btn_verificar_mdc.setBounds(150, 50, 90, 23);

        Lbl_resultado_mdc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_resultado_mdc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lbl_resultado_mdc.setText("MDC:");
        Pnl_mdc.add(Lbl_resultado_mdc);
        Lbl_resultado_mdc.setBounds(20, 120, 220, 30);

        getContentPane().add(Pnl_mdc);
        Pnl_mdc.setBounds(10, 10, 260, 170);

        Pnl_mmc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "MMC (Mínimo Múltiplo Comum):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        Pnl_mmc.setLayout(null);

        Lbl_numero1_mmc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero1_mmc.setText("Número 1:");
        Lbl_numero1_mmc.setToolTipText("");
        Pnl_mmc.add(Lbl_numero1_mmc);
        Lbl_numero1_mmc.setBounds(20, 50, 58, 15);

        Txt_numero1_mmc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pnl_mmc.add(Txt_numero1_mmc);
        Txt_numero1_mmc.setBounds(80, 50, 50, 20);

        Lbl_numero2_mmc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero2_mmc.setText("Número 2:");
        Lbl_numero2_mmc.setToolTipText("");
        Pnl_mmc.add(Lbl_numero2_mmc);
        Lbl_numero2_mmc.setBounds(20, 80, 58, 15);

        Txt_numero2_mmc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pnl_mmc.add(Txt_numero2_mmc);
        Txt_numero2_mmc.setBounds(80, 80, 50, 20);

        Btn_limpar_mmc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_limpar_mmc.setText("Limpar");
        Btn_limpar_mmc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_limpar_mmcActionPerformed(evt);
            }
        });
        Pnl_mmc.add(Btn_limpar_mmc);
        Btn_limpar_mmc.setBounds(150, 80, 90, 23);

        Btn_verificar_mmc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_verificar_mmc.setText("Verificar");
        Btn_verificar_mmc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_verificar_mmcActionPerformed(evt);
            }
        });
        Pnl_mmc.add(Btn_verificar_mmc);
        Btn_verificar_mmc.setBounds(150, 50, 90, 23);

        Lbl_resultado_mmc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_resultado_mmc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lbl_resultado_mmc.setText("MMC:");
        Pnl_mmc.add(Lbl_resultado_mmc);
        Lbl_resultado_mmc.setBounds(20, 120, 220, 30);

        getContentPane().add(Pnl_mmc);
        Pnl_mmc.setBounds(270, 10, 260, 170);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Número Primo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        Lbl_numero_primo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero_primo.setText("Número:");
        Lbl_numero_primo.setToolTipText("");
        jPanel1.add(Lbl_numero_primo);
        Lbl_numero_primo.setBounds(20, 40, 48, 15);

        Txt_numero_primo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(Txt_numero_primo);
        Txt_numero_primo.setBounds(70, 40, 50, 20);

        Btn_verificar_primo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_verificar_primo.setText("Verificar");
        Btn_verificar_primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_verificar_primoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_verificar_primo);
        Btn_verificar_primo.setBounds(150, 30, 90, 23);

        Btn_limpar_primo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_limpar_primo.setText("Limpar");
        Btn_limpar_primo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_limpar_primoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_limpar_primo);
        Btn_limpar_primo.setBounds(150, 60, 90, 23);

        Lbl_resultado_primo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_resultado_primo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lbl_resultado_primo.setText("É primo (Sim/Não)?: ");
        jPanel1.add(Lbl_resultado_primo);
        Lbl_resultado_primo.setBounds(20, 110, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 190, 260, 160);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Número Par/Ímpar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel2.setLayout(null);

        Txt_numero_ip.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(Txt_numero_ip);
        Txt_numero_ip.setBounds(70, 40, 50, 20);

        Lbl_numero_ip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero_ip.setText("Número:");
        Lbl_numero_ip.setToolTipText("");
        jPanel2.add(Lbl_numero_ip);
        Lbl_numero_ip.setBounds(20, 40, 48, 15);

        Btn_verificar_ip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_verificar_ip.setText("Verificar");
        Btn_verificar_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_verificar_ipActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_verificar_ip);
        Btn_verificar_ip.setBounds(150, 30, 90, 23);

        Btn_limpar_ip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_limpar_ip.setText("Limpar");
        Btn_limpar_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_limpar_ipActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_limpar_ip);
        Btn_limpar_ip.setBounds(150, 60, 90, 23);

        Lbl_resultado_ip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_resultado_ip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lbl_resultado_ip.setText("Número (Par / Ímpar): ");
        jPanel2.add(Lbl_resultado_ip);
        Lbl_resultado_ip.setBounds(20, 110, 220, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(270, 190, 260, 160);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Bhaskara:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel3.setLayout(null);

        Lbl_numero1_bkr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero1_bkr.setText("Número 1:");
        Lbl_numero1_bkr.setToolTipText("");
        jPanel3.add(Lbl_numero1_bkr);
        Lbl_numero1_bkr.setBounds(20, 40, 58, 15);

        Txt_a.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(Txt_a);
        Txt_a.setBounds(80, 40, 50, 20);

        Lbl_numero2_bkr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero2_bkr.setText("Número 2:");
        Lbl_numero2_bkr.setToolTipText("");
        jPanel3.add(Lbl_numero2_bkr);
        Lbl_numero2_bkr.setBounds(20, 70, 58, 15);

        Txt_b.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(Txt_b);
        Txt_b.setBounds(80, 70, 50, 20);

        Txt_c.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(Txt_c);
        Txt_c.setBounds(80, 100, 50, 20);

        Lbl_numero3_bkr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_numero3_bkr.setText("Número 3:");
        Lbl_numero3_bkr.setToolTipText("");
        jPanel3.add(Lbl_numero3_bkr);
        Lbl_numero3_bkr.setBounds(20, 100, 58, 15);

        Lbl_resultado_bkr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_resultado_bkr.setText("Resultados:");
        Lbl_resultado_bkr.setToolTipText("");
        jPanel3.add(Lbl_resultado_bkr);
        Lbl_resultado_bkr.setBounds(20, 140, 70, 15);

        Lbl_x2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_x2.setText("X2:");
        Lbl_x2.setToolTipText("");
        jPanel3.add(Lbl_x2);
        Lbl_x2.setBounds(90, 180, 20, 15);

        Lbl_x22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_x22.setText("0");
        Lbl_x22.setToolTipText("");
        jPanel3.add(Lbl_x22);
        Lbl_x22.setBounds(130, 180, 70, 15);

        Lbl_x1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_x1.setText("X1:");
        Lbl_x1.setToolTipText("");
        jPanel3.add(Lbl_x1);
        Lbl_x1.setBounds(90, 160, 20, 15);

        Lbl_delta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_delta.setText("Delta:");
        Lbl_delta.setToolTipText("");
        jPanel3.add(Lbl_delta);
        Lbl_delta.setBounds(90, 140, 40, 15);

        Lbl_delta2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_delta2.setText("0");
        Lbl_delta2.setToolTipText("");
        jPanel3.add(Lbl_delta2);
        Lbl_delta2.setBounds(130, 140, 70, 15);

        Lbl_x12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Lbl_x12.setText("0");
        Lbl_x12.setToolTipText("");
        jPanel3.add(Lbl_x12);
        Lbl_x12.setBounds(130, 160, 70, 15);

        Btn_verificar_bkr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_verificar_bkr.setText("Verificar");
        Btn_verificar_bkr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_verificar_bkrActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_verificar_bkr);
        Btn_verificar_bkr.setBounds(150, 30, 90, 23);

        Btn_limpar_bkr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_limpar_bkr.setText("Limpar");
        Btn_limpar_bkr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_limpar_bkrActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_limpar_bkr);
        Btn_limpar_bkr.setBounds(150, 60, 90, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(530, 10, 260, 210);

        Btn_limpar_todos_esp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_limpar_todos_esp.setText("<html><center>Limpar<br>Todos");
        Btn_limpar_todos_esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_limpar_todos_espActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_limpar_todos_esp);
        Btn_limpar_todos_esp.setBounds(550, 230, 110, 43);

        Btn_fechar_formulario_esp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_fechar_formulario_esp.setText("<html><center>Fechar<br>Formulário");
        Btn_fechar_formulario_esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_fechar_formulario_espActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_fechar_formulario_esp);
        Btn_fechar_formulario_esp.setBounds(670, 230, 109, 43);

        Menu.setText("Menu");

        TELA_INICIAL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        TELA_INICIAL.setText("Tela Inicial");
        TELA_INICIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELA_INICIALActionPerformed(evt);
            }
        });
        Menu.add(TELA_INICIAL);

        LIMPAR_TODOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.ALT_MASK));
        LIMPAR_TODOS.setText("Limpar Todos");
        LIMPAR_TODOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPAR_TODOSActionPerformed(evt);
            }
        });
        Menu.add(LIMPAR_TODOS);

        Barra_de_menu.add(Menu);

        Sobre.setText("Sobre");

        SOBRE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        SOBRE.setText("Sobre");
        SOBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOBREActionPerformed(evt);
            }
        });
        Sobre.add(SOBRE);

        Barra_de_menu.add(Sobre);

        setJMenuBar(Barra_de_menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TELA_INICIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELA_INICIALActionPerformed
        // Tela Inicial:
        new tela_inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_TELA_INICIALActionPerformed

    private void LIMPAR_TODOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPAR_TODOSActionPerformed
        // Limpar Tdos:
        limpar_todos();
    }//GEN-LAST:event_LIMPAR_TODOSActionPerformed

    private void SOBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOBREActionPerformed
        // Sobre:
        new about().setVisible(true);
    }//GEN-LAST:event_SOBREActionPerformed

    private void Btn_verificar_mdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_verificar_mdcActionPerformed
        // Verificar MDC:
        try {
            int n1 = Integer.parseInt(Txt_numero1_mdc.getText());
            int n2 = Integer.parseInt(Txt_numero2_mdc.getText());
            int mdc;
            if (n1 == 0 || n2 == 0) {
                JOptionPane.showMessageDialog(null, "Substitua '0' por um número inteiro maior!");
            } else {
                while (n2 != 0) {
                    mdc = n1 % n2;
                    n1 = n2;
                    n2 = mdc;
                }
            }
            Lbl_resultado_mdc.setText("MDC: " + n1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apenas valores numéricos inteiros!");
        }
    }//GEN-LAST:event_Btn_verificar_mdcActionPerformed

    private void Btn_limpar_mdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_limpar_mdcActionPerformed
        // Limpar MDC:
        limpar_mdc();
    }//GEN-LAST:event_Btn_limpar_mdcActionPerformed

    private void Btn_verificar_mmcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_verificar_mmcActionPerformed
        // Verificar MMC:
        try {
            int n1 = Integer.parseInt(Txt_numero1_mmc.getText());
            int n2 = Integer.parseInt(Txt_numero2_mmc.getText());
            int aux;

            if (n1 > n2) {
                aux = n1;
            } else {
                aux = n2;
            }

            while (aux % n1 != 0 || aux % n2 != 0) {
                aux++;
            }
            Lbl_resultado_mmc.setText("MMC: " + aux);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apenas valores numéricos inteiros!");
        }
    }//GEN-LAST:event_Btn_verificar_mmcActionPerformed

    private void Btn_verificar_primoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_verificar_primoActionPerformed
        // Verificar Primo:
        try {
            int n = Integer.parseInt(Txt_numero_primo.getText());
            int contador = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                Lbl_resultado_primo.setText("É primo (Sim/Não)?: Sim");
            } else {
                Lbl_resultado_primo.setText("É primo (Sim/Não)?: Não");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Apenas valores numéricos inteiros!");
        }
    }//GEN-LAST:event_Btn_verificar_primoActionPerformed

    private void Btn_limpar_primoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_limpar_primoActionPerformed
        // Limpar Primo:
        limpar_primo();
    }//GEN-LAST:event_Btn_limpar_primoActionPerformed

    private void Btn_limpar_mmcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_limpar_mmcActionPerformed
        // Limpar MMC:
        limpar_mmc();
    }//GEN-LAST:event_Btn_limpar_mmcActionPerformed

    private void Btn_verificar_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_verificar_ipActionPerformed
        // Verificar número par / ímpar:
        try {
            int n = Integer.parseInt(Txt_numero_ip.getText());
            if (n % 2 == 0) {
                Lbl_resultado_ip.setText("Número (Par / Ímpar): Par");
            } else {
                Lbl_resultado_ip.setText("Número (Par / Ímpar): Ímpar");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Apenas valores numéricos inteiros!");
        }
    }//GEN-LAST:event_Btn_verificar_ipActionPerformed

    private void Btn_limpar_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_limpar_ipActionPerformed
        // Limpar número par / ímpar:
        limpar_ip();
    }//GEN-LAST:event_Btn_limpar_ipActionPerformed

    private void Btn_verificar_bkrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_verificar_bkrActionPerformed
        // Verificar Bhaskara:
        try {
            int a, b, c;
            double x1, x2, delta;

            a = Integer.parseInt(Txt_a.getText());
            b = Integer.parseInt(Txt_b.getText());
            c = Integer.parseInt(Txt_c.getText());

            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta >= 0) {
                
                x1 = ((-(b)) + Math.sqrt(delta)) / (2 * a);
                x2 = ((-(b)) - Math.sqrt(delta)) / (2 * a);
                
                exibir_bkr(x1, x2, delta);
            } else {
                JOptionPane.showMessageDialog(null, "Delta não possui raiz!");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Apenas valores numéricos inteiros!");
        }
    }//GEN-LAST:event_Btn_verificar_bkrActionPerformed

    private void Btn_limpar_bkrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_limpar_bkrActionPerformed
        // Limpar Bhaskara:
        limpar_bkr();
    }//GEN-LAST:event_Btn_limpar_bkrActionPerformed

    private void Btn_limpar_todos_espActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_limpar_todos_espActionPerformed
        // limpar Todos:
        limpar_todos();
    }//GEN-LAST:event_Btn_limpar_todos_espActionPerformed

    private void Btn_fechar_formulario_espActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_fechar_formulario_espActionPerformed
        // Fechar Formulário:
        new tela_inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_fechar_formulario_espActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculos_esp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculos_esp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculos_esp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculos_esp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_de_menu;
    private javax.swing.JButton Btn_fechar_formulario_esp;
    private javax.swing.JButton Btn_limpar_bkr;
    private javax.swing.JButton Btn_limpar_ip;
    private javax.swing.JButton Btn_limpar_mdc;
    private javax.swing.JButton Btn_limpar_mmc;
    private javax.swing.JButton Btn_limpar_primo;
    private javax.swing.JButton Btn_limpar_todos_esp;
    private javax.swing.JButton Btn_verificar_bkr;
    private javax.swing.JButton Btn_verificar_ip;
    private javax.swing.JButton Btn_verificar_mdc;
    private javax.swing.JButton Btn_verificar_mmc;
    private javax.swing.JButton Btn_verificar_primo;
    private javax.swing.JMenuItem LIMPAR_TODOS;
    private javax.swing.JLabel Lbl_delta;
    private javax.swing.JLabel Lbl_delta2;
    private javax.swing.JLabel Lbl_numero1_bkr;
    private javax.swing.JLabel Lbl_numero1_mdc;
    private javax.swing.JLabel Lbl_numero1_mmc;
    private javax.swing.JLabel Lbl_numero2_bkr;
    private javax.swing.JLabel Lbl_numero2_mdc;
    private javax.swing.JLabel Lbl_numero2_mmc;
    private javax.swing.JLabel Lbl_numero3_bkr;
    private javax.swing.JLabel Lbl_numero_ip;
    private javax.swing.JLabel Lbl_numero_primo;
    private javax.swing.JLabel Lbl_resultado_bkr;
    private javax.swing.JLabel Lbl_resultado_ip;
    private javax.swing.JLabel Lbl_resultado_mdc;
    private javax.swing.JLabel Lbl_resultado_mmc;
    private javax.swing.JLabel Lbl_resultado_primo;
    private javax.swing.JLabel Lbl_x1;
    private javax.swing.JLabel Lbl_x12;
    private javax.swing.JLabel Lbl_x2;
    private javax.swing.JLabel Lbl_x22;
    private javax.swing.JMenu Menu;
    private javax.swing.JPanel Pnl_mdc;
    private javax.swing.JPanel Pnl_mmc;
    private javax.swing.JMenuItem SOBRE;
    private javax.swing.JMenu Sobre;
    private javax.swing.JMenuItem TELA_INICIAL;
    private javax.swing.JTextField Txt_a;
    private javax.swing.JTextField Txt_b;
    private javax.swing.JTextField Txt_c;
    private javax.swing.JTextField Txt_numero1_mdc;
    private javax.swing.JTextField Txt_numero1_mmc;
    private javax.swing.JTextField Txt_numero2_mdc;
    private javax.swing.JTextField Txt_numero2_mmc;
    private javax.swing.JTextField Txt_numero_ip;
    private javax.swing.JTextField Txt_numero_primo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
