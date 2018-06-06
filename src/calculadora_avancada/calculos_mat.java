package calculadora_avancada;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* Matheus de Souza */
public class calculos_mat extends javax.swing.JFrame {

    public calculos_mat() {
        initComponents();
    }

    private void limpar_tabuada() {
        txt_numtab.requestFocus();
        lst_resultado.removeAll();
        txt_numtab.setText("");
    }

    private void limpar_fatorial() {
        txt_numfat.setText("");
        txt_resultado_number.setText("0");
        txt_numfat.requestFocus();
    }

    private void limpar_multiplo() {
        txt_resultado_dobro.setText("0");
        txt_resultado_triplo.setText("0");
        txt_resultado_quadruplo.setText("0");
        txt_resultado_quintuplo.setText("0");
        txt_nummult.setText("");
        txt_nummult.requestFocus();
    }

    private void limpar_potencia() {
        txt_numpow.requestFocus();
        txt_numpow.setText("");
        txt_quadrado.setText("0");
        txt_cubo.setText("0");
        txt_pow4.setText("0");
        txt_pow5.setText("0");
        txt_pow6.setText("0");
        txt_raiz.setText("0");
    }

    private void limpar_graus() {
        txt_resultado_seno.setText("0");
        txt_resultado_cosseno.setText("0");
        txt_numgraus.setText("");
        txt_numgraus.requestFocus();
    }

    private void limpar_media() {
        txt_nummedia1.setText("");
        txt_nummedia2.setText("");
        txt_nummedia3.setText("");
        txt_nummedia4.setText("");
        txt_resultado.setText("0");
        txt_nummedia1.requestFocus();
    }

    private void exibe_pow(double a, double b, double c, double d, double e, double n1) {
        DecimalFormat formata = new DecimalFormat("###,###,###");

        txt_quadrado.setText(formata.format(a));
        txt_cubo.setText(formata.format(b));
        txt_pow4.setText(formata.format(c));
        txt_pow5.setText(formata.format(d));
        txt_pow6.setText(formata.format(e));

        if (n1 < 0) {
            txt_raiz.setText("Sem raiz!");
        } else {
            double resultado = Math.sqrt(n1);
            if (resultado % 1 == 0) {
                DecimalFormat formatar = new DecimalFormat("#");
                txt_raiz.setText(formatar.format(resultado));
            } else {
                DecimalFormat formatar = new DecimalFormat("#.00");
                txt_raiz.setText(formatar.format(resultado));
            }
        }
    }

    private void exibe_graus(double sen, double cos) {
        DecimalFormat temp = new DecimalFormat("0.0000");
        DecimalFormat inteiro = new DecimalFormat("#");

        String seno = temp.format(sen).replace(",", ".");
        String cosseno = temp.format(cos).replace(",", ".");
        double senotemp = Double.parseDouble(seno);
        double costemp = Double.parseDouble(cosseno);

        if (senotemp % 1 == 0) {
            if (senotemp == 0) {
                txt_resultado_seno.setText("0");
            } else {
                txt_resultado_seno.setText(inteiro.format(sen));
            }
        } else {
            txt_resultado_seno.setText(temp.format(sen));
        }

        if (costemp % 1 == 0) {
            if (costemp == 0) {
                txt_resultado_cosseno.setText("0");
            } else {
                txt_resultado_cosseno.setText(inteiro.format(cos));
            }
        } else {
            txt_resultado_cosseno.setText(temp.format(cos));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_tabuada = new javax.swing.JPanel();
        lbl_numero_tabuada = new javax.swing.JLabel();
        txt_numtab = new javax.swing.JTextField();
        btn_calculartab = new javax.swing.JButton();
        btn_limpartab = new javax.swing.JButton();
        lst_resultado = new java.awt.List();
        pnl_fatorial = new javax.swing.JPanel();
        lbl_numero_fat = new javax.swing.JLabel();
        txt_numfat = new javax.swing.JTextField();
        lbl_resultado_texto = new javax.swing.JLabel();
        btn_calcularfat = new javax.swing.JButton();
        btn_limparfat = new javax.swing.JButton();
        txt_resultado_number = new javax.swing.JTextField();
        pnl_mediaaritmetica = new javax.swing.JPanel();
        lbl_numero_media1 = new javax.swing.JLabel();
        txt_nummedia1 = new javax.swing.JTextField();
        lbl_numero_media2 = new javax.swing.JLabel();
        txt_nummedia2 = new javax.swing.JTextField();
        lbl_numero_media3 = new javax.swing.JLabel();
        txt_nummedia3 = new javax.swing.JTextField();
        lbl_numero_media4 = new javax.swing.JLabel();
        txt_nummedia4 = new javax.swing.JTextField();
        btn_calcularmed = new javax.swing.JButton();
        btn_limparmed = new javax.swing.JButton();
        txt_resultado = new javax.swing.JTextField();
        lbl_resultado_texto1 = new javax.swing.JLabel();
        pnl_graus = new javax.swing.JPanel();
        lbl_numero_graus = new javax.swing.JLabel();
        txt_numgraus = new javax.swing.JTextField();
        btn_calculargraus = new javax.swing.JButton();
        btn_limpargraus = new javax.swing.JButton();
        lbl_numero_seno = new javax.swing.JLabel();
        lbl_numero_cosseno = new javax.swing.JLabel();
        txt_resultado_seno = new javax.swing.JTextField();
        txt_resultado_cosseno = new javax.swing.JTextField();
        pnl_multiplos = new javax.swing.JPanel();
        txt_nummult = new javax.swing.JTextField();
        lbl_numero_nummult = new javax.swing.JLabel();
        lbl_numero_dobro = new javax.swing.JLabel();
        txt_resultado_dobro = new javax.swing.JTextField();
        txt_resultado_triplo = new javax.swing.JTextField();
        lbl_numero_triplo = new javax.swing.JLabel();
        btn_calcularmulti = new javax.swing.JButton();
        btn_limparmulti = new javax.swing.JButton();
        txt_resultado_quintuplo = new javax.swing.JTextField();
        lbl_numero_quintuplo = new javax.swing.JLabel();
        lbl_numero_quadruplo = new javax.swing.JLabel();
        txt_resultado_quadruplo = new javax.swing.JTextField();
        pnl_potencia = new javax.swing.JPanel();
        txt_numpow = new javax.swing.JTextField();
        lbl_numero_numpow = new javax.swing.JLabel();
        btn_calcularpow = new javax.swing.JButton();
        lbl_numero_dob = new javax.swing.JLabel();
        txt_quadrado = new javax.swing.JTextField();
        lbl_numero_cub = new javax.swing.JLabel();
        txt_cubo = new javax.swing.JTextField();
        txt_pow4 = new javax.swing.JTextField();
        lbl_numero_numpow4 = new javax.swing.JLabel();
        lbl_numero_raiz = new javax.swing.JLabel();
        txt_raiz = new javax.swing.JTextField();
        txt_pow5 = new javax.swing.JTextField();
        lbl_numero_pow5 = new javax.swing.JLabel();
        lbl_numero_pow6 = new javax.swing.JLabel();
        txt_pow6 = new javax.swing.JTextField();
        btn_limparpow = new javax.swing.JButton();
        pnl_menu = new javax.swing.JPanel();
        btn_limpar = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculos Matemáticos");
        setMaximumSize(new java.awt.Dimension(984, 490));
        setMinimumSize(new java.awt.Dimension(984, 490));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        pnl_tabuada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Tabuada:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_tabuada.setLayout(null);

        lbl_numero_tabuada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_tabuada.setText("Número:");
        pnl_tabuada.add(lbl_numero_tabuada);
        lbl_numero_tabuada.setBounds(10, 30, 58, 15);

        txt_numtab.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_numtab.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_numtab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numtabActionPerformed(evt);
            }
        });
        pnl_tabuada.add(txt_numtab);
        txt_numtab.setBounds(60, 30, 88, 21);

        btn_calculartab.setText("Calcular");
        btn_calculartab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculartabActionPerformed(evt);
            }
        });
        pnl_tabuada.add(btn_calculartab);
        btn_calculartab.setBounds(172, 32, 83, 31);

        btn_limpartab.setText("Limpar");
        btn_limpartab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpartabActionPerformed(evt);
            }
        });
        pnl_tabuada.add(btn_limpartab);
        btn_limpartab.setBounds(172, 69, 83, 31);

        lst_resultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lst_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lst_resultadoActionPerformed(evt);
            }
        });
        pnl_tabuada.add(lst_resultado);
        lst_resultado.setBounds(10, 60, 150, 200);

        getContentPane().add(pnl_tabuada);
        pnl_tabuada.setBounds(10, 10, 271, 280);

        pnl_fatorial.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Fatorial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_fatorial.setMaximumSize(new java.awt.Dimension(0, 0));
        pnl_fatorial.setLayout(null);

        lbl_numero_fat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_fat.setText("Número:");
        pnl_fatorial.add(lbl_numero_fat);
        lbl_numero_fat.setBounds(16, 35, 58, 15);

        txt_numfat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_numfat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_numfat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numfatActionPerformed(evt);
            }
        });
        pnl_fatorial.add(txt_numfat);
        txt_numfat.setBounds(78, 32, 56, 21);

        lbl_resultado_texto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_resultado_texto.setText("Resultado:");
        pnl_fatorial.add(lbl_resultado_texto);
        lbl_resultado_texto.setBounds(16, 61, 60, 15);

        btn_calcularfat.setText("Calcular");
        btn_calcularfat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularfatActionPerformed(evt);
            }
        });
        pnl_fatorial.add(btn_calcularfat);
        btn_calcularfat.setBounds(140, 30, 100, 23);

        btn_limparfat.setText("Limpar");
        btn_limparfat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparfatActionPerformed(evt);
            }
        });
        pnl_fatorial.add(btn_limparfat);
        btn_limparfat.setBounds(250, 30, 110, 23);

        txt_resultado_number.setEditable(false);
        txt_resultado_number.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado_number.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado_number.setText("0");
        txt_resultado_number.setBorder(null);
        txt_resultado_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultado_numberActionPerformed(evt);
            }
        });
        pnl_fatorial.add(txt_resultado_number);
        txt_resultado_number.setBounds(80, 61, 181, 15);

        getContentPane().add(pnl_fatorial);
        pnl_fatorial.setBounds(290, 10, 370, 100);

        pnl_mediaaritmetica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Média Aritmética:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_mediaaritmetica.setLayout(null);

        lbl_numero_media1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_media1.setText("1º Valor:");
        pnl_mediaaritmetica.add(lbl_numero_media1);
        lbl_numero_media1.setBounds(16, 32, 58, 23);

        txt_nummedia1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nummedia1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_nummedia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nummedia1ActionPerformed(evt);
            }
        });
        pnl_mediaaritmetica.add(txt_nummedia1);
        txt_nummedia1.setBounds(84, 32, 56, 23);

        lbl_numero_media2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_media2.setText("2º Valor:");
        pnl_mediaaritmetica.add(lbl_numero_media2);
        lbl_numero_media2.setBounds(16, 62, 58, 23);

        txt_nummedia2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nummedia2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_nummedia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nummedia2ActionPerformed(evt);
            }
        });
        pnl_mediaaritmetica.add(txt_nummedia2);
        txt_nummedia2.setBounds(84, 62, 56, 23);

        lbl_numero_media3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_media3.setText("3º Valor:");
        pnl_mediaaritmetica.add(lbl_numero_media3);
        lbl_numero_media3.setBounds(16, 97, 58, 23);

        txt_nummedia3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nummedia3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_nummedia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nummedia3ActionPerformed(evt);
            }
        });
        pnl_mediaaritmetica.add(txt_nummedia3);
        txt_nummedia3.setBounds(84, 97, 56, 23);

        lbl_numero_media4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_media4.setText("4º Valor:");
        pnl_mediaaritmetica.add(lbl_numero_media4);
        lbl_numero_media4.setBounds(16, 129, 58, 23);

        txt_nummedia4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nummedia4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_nummedia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nummedia4ActionPerformed(evt);
            }
        });
        pnl_mediaaritmetica.add(txt_nummedia4);
        txt_nummedia4.setBounds(84, 129, 56, 23);

        btn_calcularmed.setText("Calcular");
        btn_calcularmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularmedActionPerformed(evt);
            }
        });
        pnl_mediaaritmetica.add(btn_calcularmed);
        btn_calcularmed.setBounds(185, 33, 103, 23);

        btn_limparmed.setText("Limpar");
        btn_limparmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparmedActionPerformed(evt);
            }
        });
        pnl_mediaaritmetica.add(btn_limparmed);
        btn_limparmed.setBounds(185, 63, 103, 23);

        txt_resultado.setEditable(false);
        txt_resultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado.setText("0");
        txt_resultado.setBorder(null);
        txt_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultadoActionPerformed(evt);
            }
        });
        pnl_mediaaritmetica.add(txt_resultado);
        txt_resultado.setBounds(119, 177, 99, 15);

        lbl_resultado_texto1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_resultado_texto1.setText("Média:");
        pnl_mediaaritmetica.add(lbl_resultado_texto1);
        lbl_resultado_texto1.setBounds(72, 177, 37, 15);

        getContentPane().add(pnl_mediaaritmetica);
        pnl_mediaaritmetica.setBounds(670, 10, 304, 210);

        pnl_graus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Graus:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_graus.setLayout(null);

        lbl_numero_graus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_graus.setText("Número:");
        pnl_graus.add(lbl_numero_graus);
        lbl_numero_graus.setBounds(16, 35, 58, 15);

        txt_numgraus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_numgraus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_numgraus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numgrausActionPerformed(evt);
            }
        });
        pnl_graus.add(txt_numgraus);
        txt_numgraus.setBounds(78, 32, 56, 21);

        btn_calculargraus.setText("Calcular");
        btn_calculargraus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculargrausActionPerformed(evt);
            }
        });
        pnl_graus.add(btn_calculargraus);
        btn_calculargraus.setBounds(153, 30, 100, 23);

        btn_limpargraus.setText("Limpar");
        btn_limpargraus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpargrausActionPerformed(evt);
            }
        });
        pnl_graus.add(btn_limpargraus);
        btn_limpargraus.setBounds(153, 60, 100, 23);

        lbl_numero_seno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_seno.setText("Seno:");
        pnl_graus.add(lbl_numero_seno);
        lbl_numero_seno.setBounds(16, 61, 32, 23);

        lbl_numero_cosseno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_cosseno.setText("Cosseno:");
        pnl_graus.add(lbl_numero_cosseno);
        lbl_numero_cosseno.setBounds(16, 90, 58, 15);

        txt_resultado_seno.setEditable(false);
        txt_resultado_seno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado_seno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado_seno.setText("0");
        txt_resultado_seno.setBorder(null);
        txt_resultado_seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultado_senoActionPerformed(evt);
            }
        });
        pnl_graus.add(txt_resultado_seno);
        txt_resultado_seno.setBounds(78, 69, 70, 15);

        txt_resultado_cosseno.setEditable(false);
        txt_resultado_cosseno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado_cosseno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado_cosseno.setText("0");
        txt_resultado_cosseno.setBorder(null);
        txt_resultado_cosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultado_cossenoActionPerformed(evt);
            }
        });
        pnl_graus.add(txt_resultado_cosseno);
        txt_resultado_cosseno.setBounds(78, 90, 60, 15);

        getContentPane().add(pnl_graus);
        pnl_graus.setBounds(10, 300, 270, 118);

        pnl_multiplos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Mútiplos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_multiplos.setMaximumSize(new java.awt.Dimension(0, 0));
        pnl_multiplos.setLayout(null);

        txt_nummult.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nummult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_nummult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nummultActionPerformed(evt);
            }
        });
        pnl_multiplos.add(txt_nummult);
        txt_nummult.setBounds(78, 32, 56, 21);

        lbl_numero_nummult.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_nummult.setText("Número:");
        pnl_multiplos.add(lbl_numero_nummult);
        lbl_numero_nummult.setBounds(16, 35, 58, 15);

        lbl_numero_dobro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_dobro.setText("Dobro:");
        pnl_multiplos.add(lbl_numero_dobro);
        lbl_numero_dobro.setBounds(16, 61, 37, 23);

        txt_resultado_dobro.setEditable(false);
        txt_resultado_dobro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado_dobro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado_dobro.setText("0");
        txt_resultado_dobro.setBorder(null);
        txt_resultado_dobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultado_dobroActionPerformed(evt);
            }
        });
        pnl_multiplos.add(txt_resultado_dobro);
        txt_resultado_dobro.setBounds(78, 65, 56, 15);

        txt_resultado_triplo.setEditable(false);
        txt_resultado_triplo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado_triplo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado_triplo.setText("0");
        txt_resultado_triplo.setBorder(null);
        txt_resultado_triplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultado_triploActionPerformed(evt);
            }
        });
        pnl_multiplos.add(txt_resultado_triplo);
        txt_resultado_triplo.setBounds(78, 90, 56, 15);

        lbl_numero_triplo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_triplo.setText("Triplo:");
        pnl_multiplos.add(lbl_numero_triplo);
        lbl_numero_triplo.setBounds(16, 90, 58, 15);

        btn_calcularmulti.setText("Calcular");
        btn_calcularmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularmultiActionPerformed(evt);
            }
        });
        pnl_multiplos.add(btn_calcularmulti);
        btn_calcularmulti.setBounds(150, 30, 100, 23);

        btn_limparmulti.setText("Limpar");
        btn_limparmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparmultiActionPerformed(evt);
            }
        });
        pnl_multiplos.add(btn_limparmulti);
        btn_limparmulti.setBounds(260, 30, 100, 23);

        txt_resultado_quintuplo.setEditable(false);
        txt_resultado_quintuplo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado_quintuplo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado_quintuplo.setText("0");
        txt_resultado_quintuplo.setBorder(null);
        txt_resultado_quintuplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultado_quintuploActionPerformed(evt);
            }
        });
        pnl_multiplos.add(txt_resultado_quintuplo);
        txt_resultado_quintuplo.setBounds(204, 90, 71, 15);

        lbl_numero_quintuplo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_quintuplo.setText("Quíntuplo:");
        pnl_multiplos.add(lbl_numero_quintuplo);
        lbl_numero_quintuplo.setBounds(138, 90, 58, 15);

        lbl_numero_quadruplo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_quadruplo.setText("Quádruplo:");
        pnl_multiplos.add(lbl_numero_quadruplo);
        lbl_numero_quadruplo.setBounds(138, 61, 62, 23);

        txt_resultado_quadruplo.setEditable(false);
        txt_resultado_quadruplo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_resultado_quadruplo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_resultado_quadruplo.setText("0");
        txt_resultado_quadruplo.setBorder(null);
        txt_resultado_quadruplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultado_quadruploActionPerformed(evt);
            }
        });
        pnl_multiplos.add(txt_resultado_quadruplo);
        txt_resultado_quadruplo.setBounds(204, 65, 71, 15);

        getContentPane().add(pnl_multiplos);
        pnl_multiplos.setBounds(290, 120, 370, 130);

        pnl_potencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Potência:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        pnl_potencia.setLayout(null);

        txt_numpow.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_numpow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_numpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numpowActionPerformed(evt);
            }
        });
        pnl_potencia.add(txt_numpow);
        txt_numpow.setBounds(78, 32, 58, 21);

        lbl_numero_numpow.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_numpow.setText("Número:");
        pnl_potencia.add(lbl_numero_numpow);
        lbl_numero_numpow.setBounds(16, 32, 58, 21);

        btn_calcularpow.setText("Calcular");
        btn_calcularpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularpowActionPerformed(evt);
            }
        });
        pnl_potencia.add(btn_calcularpow);
        btn_calcularpow.setBounds(150, 30, 100, 23);

        lbl_numero_dob.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_dob.setText("Quadrado:");
        pnl_potencia.add(lbl_numero_dob);
        lbl_numero_dob.setBounds(20, 80, 59, 15);

        txt_quadrado.setEditable(false);
        txt_quadrado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_quadrado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_quadrado.setText("0");
        txt_quadrado.setBorder(null);
        txt_quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quadradoActionPerformed(evt);
            }
        });
        pnl_potencia.add(txt_quadrado);
        txt_quadrado.setBounds(90, 80, 58, 15);

        lbl_numero_cub.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_cub.setText("Cubo:");
        pnl_potencia.add(lbl_numero_cub);
        lbl_numero_cub.setBounds(20, 100, 32, 15);

        txt_cubo.setEditable(false);
        txt_cubo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_cubo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cubo.setText("0");
        txt_cubo.setBorder(null);
        txt_cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cuboActionPerformed(evt);
            }
        });
        pnl_potencia.add(txt_cubo);
        txt_cubo.setBounds(90, 100, 56, 15);

        txt_pow4.setEditable(false);
        txt_pow4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_pow4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_pow4.setText("0");
        txt_pow4.setBorder(null);
        txt_pow4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pow4ActionPerformed(evt);
            }
        });
        pnl_potencia.add(txt_pow4);
        txt_pow4.setBounds(90, 120, 56, 15);

        lbl_numero_numpow4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_numpow4.setText("4ª Potência:");
        pnl_potencia.add(lbl_numero_numpow4);
        lbl_numero_numpow4.setBounds(20, 120, 67, 15);

        lbl_numero_raiz.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_raiz.setText("Raíz Quadrada:");
        pnl_potencia.add(lbl_numero_raiz);
        lbl_numero_raiz.setBounds(180, 120, 94, 15);

        txt_raiz.setEditable(false);
        txt_raiz.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_raiz.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_raiz.setText("0");
        txt_raiz.setBorder(null);
        txt_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_raizActionPerformed(evt);
            }
        });
        pnl_potencia.add(txt_raiz);
        txt_raiz.setBounds(280, 120, 56, 15);

        txt_pow5.setEditable(false);
        txt_pow5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_pow5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_pow5.setText("0");
        txt_pow5.setBorder(null);
        txt_pow5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pow5ActionPerformed(evt);
            }
        });
        pnl_potencia.add(txt_pow5);
        txt_pow5.setBounds(280, 80, 56, 15);

        lbl_numero_pow5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_pow5.setText("5ª Potência:");
        pnl_potencia.add(lbl_numero_pow5);
        lbl_numero_pow5.setBounds(180, 80, 94, 15);

        lbl_numero_pow6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_numero_pow6.setText("6ª Potência:");
        pnl_potencia.add(lbl_numero_pow6);
        lbl_numero_pow6.setBounds(180, 100, 94, 15);

        txt_pow6.setEditable(false);
        txt_pow6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_pow6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_pow6.setText("0");
        txt_pow6.setBorder(null);
        txt_pow6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pow6ActionPerformed(evt);
            }
        });
        pnl_potencia.add(txt_pow6);
        txt_pow6.setBounds(280, 100, 56, 15);

        btn_limparpow.setText("Limpar");
        btn_limparpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparpowActionPerformed(evt);
            }
        });
        pnl_potencia.add(btn_limparpow);
        btn_limparpow.setBounds(260, 30, 100, 23);

        getContentPane().add(pnl_potencia);
        pnl_potencia.setBounds(290, 260, 370, 170);

        pnl_menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnl_menu.setLayout(null);

        btn_limpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpar.setText("<html><center>\nLimpar<br>\nTodos</html>\n");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });
        pnl_menu.add(btn_limpar);
        btn_limpar.setBounds(40, 20, 100, 36);

        btn_fechar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_fechar.setText("<html><center>\nFechar<br>\nFormulário</html>");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });
        pnl_menu.add(btn_fechar);
        btn_fechar.setBounds(160, 20, 95, 36);

        getContentPane().add(pnl_menu);
        pnl_menu.setBounds(670, 230, 300, 70);

        jMenu1.setText("Menu");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Tela Inicial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Limpar Todos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Sobre");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numtabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numtabActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_numtabActionPerformed

    private void btn_calculartabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculartabActionPerformed
        // Calcular:
        try {
            lst_resultado.removeAll();
            int n1 = Integer.parseInt(txt_numtab.getText());
            for (int i = 0; i <= 10; i++) {
                int result = n1 * i;
                lst_resultado.add(n1 + " x " + i + " = " + result);
                txt_numtab.requestFocus();
            }
        } catch (NumberFormatException erro) {
            lst_resultado.removeAll();
            if (txt_numtab.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com o campo vazio!");
                txt_numtab.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com: " + "(" + txt_numtab.getText().toUpperCase() + ")");
                txt_numtab.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_calculartabActionPerformed

    private void btn_limpartabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpartabActionPerformed
        // Limpar Tabuada:
        limpar_tabuada();
    }//GEN-LAST:event_btn_limpartabActionPerformed

    private void txt_numfatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numfatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numfatActionPerformed

    private void btn_calcularfatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularfatActionPerformed
        // Calcular Fatorial:
        try {

            double temp = Double.parseDouble(txt_numfat.getText());
            DecimalFormat formatar = new DecimalFormat("#");

            if (temp % 1 != 0) {
                JOptionPane.showMessageDialog(null, "Apenas números inteiros!");
                txt_numfat.requestFocus();
            } else {
                if (temp < 0 && temp >= -139) {
                    double fat = Double.parseDouble(txt_numfat.getText());
                    for (int i = Integer.parseInt(txt_numfat.getText()); i < -1; i++) {
                        fat = fat * (i + 1);
                        String exibe = Double.toString(fat);
                        if (exibe.length() < 19) {
                            txt_resultado_number.setText(formatar.format(fat));
                        } else {
                            txt_resultado_number.setText(Double.toString(fat));
                        }
                    }
                } else if (temp > 0 && temp <= 139) {
                    double fat = Double.parseDouble(txt_numfat.getText());
                    for (int i = Integer.parseInt(txt_numfat.getText()); i > 1; i--) {
                        fat = fat * (i - 1);
                        String exibe = Double.toString(fat);
                        if (exibe.length() < 19) {
                            txt_resultado_number.setText(formatar.format(fat));
                        } else {
                            txt_resultado_number.setText(Double.toString(fat));
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Limite de cálculo atingido! \n"
                            + "Por favor insira um número de -139 à 139");
                    txt_numfat.requestFocus();
                }
            }

        } catch (NumberFormatException erro) {
            if (txt_numfat.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com o campo vazio!");
                txt_numfat.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com: " + "(" + txt_numfat.getText().toUpperCase() + ")");
                txt_numfat.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_calcularfatActionPerformed

    private void btn_limparfatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparfatActionPerformed
        // Limpar Fatorial:
        limpar_fatorial();
    }//GEN-LAST:event_btn_limparfatActionPerformed

    private void txt_resultado_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultado_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultado_numberActionPerformed

    private void txt_nummedia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nummedia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nummedia1ActionPerformed

    private void txt_nummedia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nummedia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nummedia2ActionPerformed

    private void txt_nummedia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nummedia3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nummedia3ActionPerformed

    private void txt_nummedia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nummedia4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nummedia4ActionPerformed

    private void btn_calcularmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularmedActionPerformed
        // Média Aritmética:
        try {
            double n1, n2, n3, n4, result;
            n1 = Double.parseDouble(txt_nummedia1.getText());
            n2 = Double.parseDouble(txt_nummedia2.getText());
            n3 = Double.parseDouble(txt_nummedia3.getText());
            n4 = Double.parseDouble(txt_nummedia4.getText());
            DecimalFormat formatar = new DecimalFormat("#.00");
            result = (n1 + n2 + n3 + n4) / 4;
            txt_resultado.setText(formatar.format(result));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                    + "Não é possível fazer cálculos!");
        }
    }//GEN-LAST:event_btn_calcularmedActionPerformed

    private void btn_limparmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparmedActionPerformed
        // Limpar Média Aritmética:
        limpar_media();
    }//GEN-LAST:event_btn_limparmedActionPerformed

    private void txt_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultadoActionPerformed

    private void txt_numgrausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numgrausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numgrausActionPerformed

    private void btn_calculargrausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculargrausActionPerformed
        // Cálculo Graus:
        try {

            int n1 = Integer.parseInt(txt_numgraus.getText());
            double rad = (Math.toRadians(n1));
            double cosseno = Math.cos(rad);
            double seno = Math.sin(rad);

            exibe_graus(seno, cosseno);

        } catch (NumberFormatException erro) {
            if (txt_numgraus.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com o campo vazio!");
                txt_numgraus.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com: " + "(" + txt_numgraus.getText().toUpperCase() + ")"
                        + "\nInsira apenas números inteiros!");
                txt_numgraus.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_calculargrausActionPerformed

    private void btn_limpargrausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpargrausActionPerformed
        // Limpar graus:
        limpar_graus();
    }//GEN-LAST:event_btn_limpargrausActionPerformed

    private void txt_resultado_senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultado_senoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultado_senoActionPerformed

    private void txt_resultado_cossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultado_cossenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultado_cossenoActionPerformed

    private void txt_nummultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nummultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nummultActionPerformed

    private void txt_resultado_dobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultado_dobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultado_dobroActionPerformed

    private void txt_resultado_triploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultado_triploActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultado_triploActionPerformed

    private void btn_calcularmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularmultiActionPerformed
        // Calcular Multiplos:
        try {
            int n1, dob, tri, qua, qui;
            n1 = Integer.parseInt(txt_nummult.getText());
            dob = n1 * 2;
            tri = n1 * 3;
            qua = n1 * 4;
            qui = n1 * 5;
            txt_resultado_dobro.setText(Integer.toString(dob));
            txt_resultado_triplo.setText(Integer.toString(tri));
            txt_resultado_quadruplo.setText(Integer.toString(qua));
            txt_resultado_quintuplo.setText(Integer.toString(qui));
        } catch (NumberFormatException erro) {
            if (txt_nummult.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com o campo vazio!");
                txt_nummult.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com: " + "(" + txt_nummult.getText().toUpperCase() + ")"
                        + "\nInsira apenas números inteiros!");
                txt_nummult.requestFocus();
            }
        }

    }//GEN-LAST:event_btn_calcularmultiActionPerformed

    private void btn_limparmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparmultiActionPerformed
        // Limpar Mútiplos:
        limpar_multiplo();
    }//GEN-LAST:event_btn_limparmultiActionPerformed

    private void txt_resultado_quintuploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultado_quintuploActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultado_quintuploActionPerformed

    private void txt_resultado_quadruploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultado_quadruploActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultado_quadruploActionPerformed

    private void txt_numpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numpowActionPerformed
        // Tela:
    }//GEN-LAST:event_txt_numpowActionPerformed

    private void btn_calcularpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularpowActionPerformed
        // Calcular Potência:
        try {
            double n1 = Integer.parseInt(txt_numpow.getText());
            double p2, p3, p4, p5, p6;

            p2 = Math.pow(n1, 2);
            p3 = Math.pow(n1, 3);
            p4 = Math.pow(n1, 4);
            p5 = Math.pow(n1, 5);
            p6 = Math.pow(n1, 6);

            exibe_pow(p2, p3, p4, p5, p6, n1);
        } catch (NumberFormatException erro) {
            if (txt_numpow.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com o campo vazio!");
                txt_numpow.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha corretamente o campo!\n"
                        + "Não é possível fazer cálculos com: " + "(" + txt_numpow.getText().toUpperCase() + ")"
                        + "\nInsira apenas números inteiros!");
                txt_numpow.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_calcularpowActionPerformed

    private void btn_limparpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparpowActionPerformed
        // Limpar Potência:
        limpar_potencia();
    }//GEN-LAST:event_btn_limparpowActionPerformed

    private void txt_quadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quadradoActionPerformed

    private void txt_cuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cuboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cuboActionPerformed

    private void txt_pow4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pow4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pow4ActionPerformed

    private void txt_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_raizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_raizActionPerformed

    private void txt_pow5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pow5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pow5ActionPerformed

    private void txt_pow6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pow6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pow6ActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // Limpar Todos:
        limpar_tabuada();
        limpar_graus();
        limpar_fatorial();
        limpar_multiplo();
        limpar_potencia();
        limpar_media();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        // FEchar Janela:
        dispose();
        new tela_inicial().setVisible(true);
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Fechar formulário e abrir o principal:
        dispose();
        new tela_inicial().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void lst_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lst_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lst_resultadoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Tela Inicial:
        new tela_inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Limpar Todos:
        limpar_tabuada();
        limpar_graus();
        limpar_fatorial();
        limpar_multiplo();
        limpar_potencia();
        limpar_media();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Sobre:
        new about().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcularfat;
    private javax.swing.JButton btn_calculargraus;
    private javax.swing.JButton btn_calcularmed;
    private javax.swing.JButton btn_calcularmulti;
    private javax.swing.JButton btn_calcularpow;
    private javax.swing.JButton btn_calculartab;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_limparfat;
    private javax.swing.JButton btn_limpargraus;
    private javax.swing.JButton btn_limparmed;
    private javax.swing.JButton btn_limparmulti;
    private javax.swing.JButton btn_limparpow;
    private javax.swing.JButton btn_limpartab;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lbl_numero_cosseno;
    private javax.swing.JLabel lbl_numero_cub;
    private javax.swing.JLabel lbl_numero_dob;
    private javax.swing.JLabel lbl_numero_dobro;
    private javax.swing.JLabel lbl_numero_fat;
    private javax.swing.JLabel lbl_numero_graus;
    private javax.swing.JLabel lbl_numero_media1;
    private javax.swing.JLabel lbl_numero_media2;
    private javax.swing.JLabel lbl_numero_media3;
    private javax.swing.JLabel lbl_numero_media4;
    private javax.swing.JLabel lbl_numero_nummult;
    private javax.swing.JLabel lbl_numero_numpow;
    private javax.swing.JLabel lbl_numero_numpow4;
    private javax.swing.JLabel lbl_numero_pow5;
    private javax.swing.JLabel lbl_numero_pow6;
    private javax.swing.JLabel lbl_numero_quadruplo;
    private javax.swing.JLabel lbl_numero_quintuplo;
    private javax.swing.JLabel lbl_numero_raiz;
    private javax.swing.JLabel lbl_numero_seno;
    private javax.swing.JLabel lbl_numero_tabuada;
    private javax.swing.JLabel lbl_numero_triplo;
    private javax.swing.JLabel lbl_resultado_texto;
    private javax.swing.JLabel lbl_resultado_texto1;
    private java.awt.List lst_resultado;
    private javax.swing.JPanel pnl_fatorial;
    private javax.swing.JPanel pnl_graus;
    private javax.swing.JPanel pnl_mediaaritmetica;
    private javax.swing.JPanel pnl_menu;
    private javax.swing.JPanel pnl_multiplos;
    private javax.swing.JPanel pnl_potencia;
    private javax.swing.JPanel pnl_tabuada;
    private javax.swing.JTextField txt_cubo;
    private javax.swing.JTextField txt_numfat;
    private javax.swing.JTextField txt_numgraus;
    private javax.swing.JTextField txt_nummedia1;
    private javax.swing.JTextField txt_nummedia2;
    private javax.swing.JTextField txt_nummedia3;
    private javax.swing.JTextField txt_nummedia4;
    private javax.swing.JTextField txt_nummult;
    private javax.swing.JTextField txt_numpow;
    private javax.swing.JTextField txt_numtab;
    private javax.swing.JTextField txt_pow4;
    private javax.swing.JTextField txt_pow5;
    private javax.swing.JTextField txt_pow6;
    private javax.swing.JTextField txt_quadrado;
    private javax.swing.JTextField txt_raiz;
    private javax.swing.JTextField txt_resultado;
    private javax.swing.JTextField txt_resultado_cosseno;
    private javax.swing.JTextField txt_resultado_dobro;
    private javax.swing.JTextField txt_resultado_number;
    private javax.swing.JTextField txt_resultado_quadruplo;
    private javax.swing.JTextField txt_resultado_quintuplo;
    private javax.swing.JTextField txt_resultado_seno;
    private javax.swing.JTextField txt_resultado_triplo;
    // End of variables declaration//GEN-END:variables
}
