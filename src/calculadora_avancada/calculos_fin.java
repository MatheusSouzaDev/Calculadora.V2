package calculadora_avancada;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* Matheus de Souza */
public class calculos_fin extends javax.swing.JFrame {

    DecimalFormat formatar = new DecimalFormat("#.00");

    public calculos_fin() {
        initComponents();
    }

    public void limpar_todos() {
        limpar_desconto_e_total();
        limpar_combb();
        limpar_cb1();
        limpar_cb2();
        limpar_cb3();
        limpar_cb4();
        limpar_cb5();
        limpar_cb6();
        limpar_cb7();
        limpar_cb8();
        limpar_cb9();
        limpar_cb10();
        limpar_cb11();
        limpar_cb12();
        limpar_rb();
        limpar_subtotal();
        RB_A_PRAZO.setEnabled(false);
    }

    public void limpar_combb() {
        CB_NUMERO_PARCELA.setSelectedIndex(0);
        TXT_VALOR_DE_PARCELA.setText("0,00");
        RB_A_PRAZO.setEnabled(false);
        BG_FORMAS_DE_PAGAMENTOS.clearSelection();
    }

    public void limpar_cb1() {
        TXT_CAMISETA_REGATA.setEnabled(false);
        TXT_CAMISETA_REGATA.setText("0");
        TXT_VALOR_CAMISETA_REGATA.setText("0,00");
        cb_camiseta_regata.setSelected(false);
    }

    public void limpar_cb2() {
        TXT_CAMISA_SOCIAL.setEnabled(false);
        TXT_CAMISA_SOCIAL.setText("0");
        TXT_VALOR_CAMISA_SOCIAL.setText("0,00");
        cb_camisa_social.setSelected(false);
    }

    public void limpar_cb3() {
        TXT_BLUSA.setEnabled(false);
        TXT_BLUSA.setText("0");
        TXT_VALOR_BLUSA.setText("0,00");
        cb_blusa.setSelected(false);
    }

    public void limpar_cb4() {
        TXT_PULLOVER.setEnabled(false);
        TXT_PULLOVER.setText("0");
        TXT_VALOR_PULLOVER.setText("0,00");
        cb_pullover.setSelected(false);
    }

    public void limpar_cb5() {
        TXT_SAPATO.setEnabled(false);
        TXT_SAPATO.setText("0");
        TXT_VALOR_SAPATO.setText("0,00");
        cb_sapato.setSelected(false);
    }

    public void limpar_cb6() {
        TXT_CALCA.setEnabled(false);
        TXT_CALCA.setText("0");
        TXT_VALOR_CALCA.setText("0,00");
        cb_calca.setSelected(false);
    }

    public void limpar_cb7() {
        TXT_MEIAS.setEnabled(false);
        TXT_MEIAS.setText("0");
        TXT_VALOR_MEIAS.setText("0,00");
        cb_meias.setSelected(false);
    }

    public void limpar_cb8() {
        TXT_LUVAS.setEnabled(false);
        TXT_LUVAS.setText("0");
        TXT_VALOR_LUVAS.setText("0,00");
        cb_luvas.setSelected(false);
    }

    public void limpar_cb9() {
        TXT_JAQUETA.setEnabled(false);
        TXT_JAQUETA.setText("0");
        TXT_VALOR_JAQUETA.setText("0,00");
        cb_jaqueta.setSelected(false);
    }

    public void limpar_cb10() {
        TXT_BERMUDA.setEnabled(false);
        TXT_BERMUDA.setText("0");
        TXT_VALOR_BERMUDA.setText("0,00");
        cb_bermuda.setSelected(false);
    }

    public void limpar_cb11() {
        TXT_CHINELO.setEnabled(false);
        TXT_CHINELO.setText("0");
        TXT_VALOR_CHINELO.setText("0,00");
        cb_chinelo.setSelected(false);
    }

    public void limpar_cb12() {
        cb_bone.setSelected(false);
        TXT_BONE.setEnabled(false);
        TXT_BONE.setText("0");
        TXT_VALOR_BONE.setText("0,00");
    }

    public void limpar_rb() {
        CB_NUMERO_PARCELA.setEnabled(false);
        BG_FORMAS_DE_PAGAMENTOS.clearSelection();

    }

    public void limpar_subtotal() {
        TXT_SUB_TOTAL.setText("0,00");
    }

    public void checar_valor(double resultado) {
        if (resultado < 10) {
            JOptionPane.showMessageDialog(null, "Parcela não pode ser inferior à R$ 10,00!\nTente outra opção de parcelamento!");
            TXT_VALOR_DE_PARCELA.setText("0,00");
            CB_NUMERO_PARCELA.setSelectedIndex(0);
        } else {
            resultado = (resultado * (1 / 100)) + resultado + 6.90;
            TXT_VALOR_DE_PARCELA.setText(formatar.format(resultado));
        }
    }

    public void checar_parcelas() {
        double resultado = Double.parseDouble(TXT_SUB_TOTAL.getText().replace(",", "."));
        try {
            int n = Integer.parseInt(CB_NUMERO_PARCELA.getSelectedItem().toString());
            if (n == 2) {
                resultado = resultado / n;
                checar_valor(resultado);
            } else if (n == 3) {
                resultado = resultado / n;
                checar_valor(resultado);
            } else if (n == 4) {
                resultado = resultado / n;
                checar_valor(resultado);
            } else if (n == 5) {
                resultado = resultado / n;
                checar_valor(resultado);
            }
        } catch (NumberFormatException erro) {
            TXT_VALOR_DE_PARCELA.setText("0,00");
        }

    }

    public void limpar_desconto_e_total() {
        TXT_TOTAL_DE_DESCONTO.setText("0,00");
        TXT_TOTAL_A_PAGAR.setText("0,00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_FORMAS_DE_PAGAMENTOS = new javax.swing.ButtonGroup();
        PNL_Controle_de_vendas = new javax.swing.JPanel();
        cb_camiseta_regata = new javax.swing.JCheckBox();
        cb_camisa_social = new javax.swing.JCheckBox();
        cb_blusa = new javax.swing.JCheckBox();
        cb_pullover = new javax.swing.JCheckBox();
        cb_sapato = new javax.swing.JCheckBox();
        cb_calca = new javax.swing.JCheckBox();
        cb_meias = new javax.swing.JCheckBox();
        cb_luvas = new javax.swing.JCheckBox();
        cb_jaqueta = new javax.swing.JCheckBox();
        cb_bermuda = new javax.swing.JCheckBox();
        cb_chinelo = new javax.swing.JCheckBox();
        cb_bone = new javax.swing.JCheckBox();
        LBL_PRODUTO = new javax.swing.JLabel();
        LBL_VALOR = new javax.swing.JLabel();
        LBL_BONE = new javax.swing.JLabel();
        LBL_CAMISETA_REGATA = new javax.swing.JLabel();
        LBL_CAMISA_SOCIAL = new javax.swing.JLabel();
        LBL_BLUSA = new javax.swing.JLabel();
        LBL_PULLOVER = new javax.swing.JLabel();
        LBL_CHINELO = new javax.swing.JLabel();
        LBL_BERMUDA = new javax.swing.JLabel();
        LBL_JAQUETA = new javax.swing.JLabel();
        LBL_LUVAS = new javax.swing.JLabel();
        LBL_MEIAS = new javax.swing.JLabel();
        LBL_CALCA = new javax.swing.JLabel();
        LBL_SAPATO = new javax.swing.JLabel();
        LBL_PRECO = new javax.swing.JLabel();
        TXT_BONE = new javax.swing.JTextField();
        TXT_CAMISETA_REGATA = new javax.swing.JTextField();
        TXT_CAMISA_SOCIAL = new javax.swing.JTextField();
        TXT_BLUSA = new javax.swing.JTextField();
        TXT_PULLOVER = new javax.swing.JTextField();
        TXT_SAPATO = new javax.swing.JTextField();
        TXT_CALCA = new javax.swing.JTextField();
        TXT_MEIAS = new javax.swing.JTextField();
        TXT_LUVAS = new javax.swing.JTextField();
        TXT_JAQUETA = new javax.swing.JTextField();
        TXT_BERMUDA = new javax.swing.JTextField();
        TXT_CHINELO = new javax.swing.JTextField();
        LBL_QUANTIDADE = new javax.swing.JLabel();
        TXT_VALOR_BONE = new javax.swing.JTextField();
        TXT_VALOR_CAMISA_SOCIAL = new javax.swing.JTextField();
        TXT_VALOR_BLUSA = new javax.swing.JTextField();
        TXT_VALOR_PULLOVER = new javax.swing.JTextField();
        TXT_VALOR_SAPATO = new javax.swing.JTextField();
        TXT_VALOR_CALCA = new javax.swing.JTextField();
        TXT_VALOR_MEIAS = new javax.swing.JTextField();
        TXT_VALOR_LUVAS = new javax.swing.JTextField();
        TXT_VALOR_JAQUETA = new javax.swing.JTextField();
        TXT_VALOR_BERMUDA = new javax.swing.JTextField();
        TXT_VALOR_CHINELO = new javax.swing.JTextField();
        TXT_VALOR_CAMISETA_REGATA = new javax.swing.JTextField();
        BTN_SUB_TOTAL = new javax.swing.JButton();
        LBL_SUB_TOTAL = new javax.swing.JLabel();
        TXT_SUB_TOTAL = new javax.swing.JTextField();
        PNL_FORMA_DE_PAGAMENTO = new javax.swing.JPanel();
        RB_A_PRAZO = new javax.swing.JRadioButton();
        RB_A_VISTA = new javax.swing.JRadioButton();
        LBL_VALOR_DA_PARCELA = new javax.swing.JLabel();
        LBL_QUANTIDADE_DE_PARCELA = new javax.swing.JLabel();
        CB_NUMERO_PARCELA = new javax.swing.JComboBox();
        TXT_VALOR_DE_PARCELA = new javax.swing.JTextField();
        TXT_TOTAL_DE_DESCONTO = new javax.swing.JTextField();
        LBL_TOTAL_DE_DESCONTO = new javax.swing.JLabel();
        TXT_TOTAL_A_PAGAR = new javax.swing.JTextField();
        LBL_TOTAL_A_PAGAR = new javax.swing.JLabel();
        BTN_FECHAR_FORMULARIO = new javax.swing.JButton();
        BTN_CALCULAR_TOTAL = new javax.swing.JButton();
        BTN_LIMPAR_TODOS = new javax.swing.JButton();
        Barra_de_menu = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        TELA_INICIAL = new javax.swing.JMenuItem();
        LIMPAR_TODOS = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();
        SOBRE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculos Financeiros");
        setMaximumSize(new java.awt.Dimension(920, 450));
        setMinimumSize(new java.awt.Dimension(920, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        PNL_Controle_de_vendas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Controle de Vendas:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        PNL_Controle_de_vendas.setLayout(null);

        cb_camiseta_regata.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_camiseta_regata.setText("Camiseta Regata");
        cb_camiseta_regata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_camiseta_regataActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_camiseta_regata);
        cb_camiseta_regata.setBounds(10, 60, 123, 23);

        cb_camisa_social.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_camisa_social.setText("Camisa Social");
        cb_camisa_social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_camisa_socialActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_camisa_social);
        cb_camisa_social.setBounds(10, 80, 107, 23);

        cb_blusa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_blusa.setText("Blusa");
        cb_blusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_blusaActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_blusa);
        cb_blusa.setBounds(10, 100, 57, 23);

        cb_pullover.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_pullover.setText("Pullover");
        cb_pullover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pulloverActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_pullover);
        cb_pullover.setBounds(10, 120, 71, 23);

        cb_sapato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_sapato.setText("Sapato");
        cb_sapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sapatoActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_sapato);
        cb_sapato.setBounds(10, 140, 65, 23);

        cb_calca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_calca.setText("Calça");
        cb_calca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_calcaActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_calca);
        cb_calca.setBounds(10, 160, 57, 23);

        cb_meias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_meias.setText("Meias");
        cb_meias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_meiasActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_meias);
        cb_meias.setBounds(10, 180, 59, 23);

        cb_luvas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_luvas.setText("Luvas");
        cb_luvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_luvasActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_luvas);
        cb_luvas.setBounds(10, 200, 59, 23);

        cb_jaqueta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_jaqueta.setText("Jaqueta");
        cb_jaqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_jaquetaActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_jaqueta);
        cb_jaqueta.setBounds(10, 220, 71, 23);

        cb_bermuda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_bermuda.setText("Bermuda");
        cb_bermuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bermudaActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_bermuda);
        cb_bermuda.setBounds(10, 240, 77, 23);

        cb_chinelo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_chinelo.setText("Chinelo");
        cb_chinelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_chineloActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_chinelo);
        cb_chinelo.setBounds(10, 260, 67, 23);

        cb_bone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cb_bone.setText("Boné");
        cb_bone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_boneActionPerformed(evt);
            }
        });
        PNL_Controle_de_vendas.add(cb_bone);
        cb_bone.setBounds(10, 280, 55, 23);

        LBL_PRODUTO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_PRODUTO.setText("Produto:");
        PNL_Controle_de_vendas.add(LBL_PRODUTO);
        LBL_PRODUTO.setBounds(30, 30, 48, 15);

        LBL_VALOR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_VALOR.setText("Valor (em R$):");
        PNL_Controle_de_vendas.add(LBL_VALOR);
        LBL_VALOR.setBounds(480, 30, 80, 20);

        LBL_BONE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_BONE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_BONE.setText("6,90");
        PNL_Controle_de_vendas.add(LBL_BONE);
        LBL_BONE.setBounds(190, 280, 90, 20);

        LBL_CAMISETA_REGATA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_CAMISETA_REGATA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_CAMISETA_REGATA.setText("19,90");
        LBL_CAMISETA_REGATA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PNL_Controle_de_vendas.add(LBL_CAMISETA_REGATA);
        LBL_CAMISETA_REGATA.setBounds(190, 60, 90, 20);

        LBL_CAMISA_SOCIAL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_CAMISA_SOCIAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_CAMISA_SOCIAL.setText("59,90");
        PNL_Controle_de_vendas.add(LBL_CAMISA_SOCIAL);
        LBL_CAMISA_SOCIAL.setBounds(190, 80, 90, 20);

        LBL_BLUSA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_BLUSA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_BLUSA.setText("119,90");
        PNL_Controle_de_vendas.add(LBL_BLUSA);
        LBL_BLUSA.setBounds(190, 100, 90, 20);

        LBL_PULLOVER.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_PULLOVER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_PULLOVER.setText("39,90");
        PNL_Controle_de_vendas.add(LBL_PULLOVER);
        LBL_PULLOVER.setBounds(190, 120, 90, 20);

        LBL_CHINELO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_CHINELO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_CHINELO.setText("14,90");
        PNL_Controle_de_vendas.add(LBL_CHINELO);
        LBL_CHINELO.setBounds(190, 260, 90, 20);

        LBL_BERMUDA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_BERMUDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_BERMUDA.setText("69,90");
        PNL_Controle_de_vendas.add(LBL_BERMUDA);
        LBL_BERMUDA.setBounds(190, 240, 90, 20);

        LBL_JAQUETA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_JAQUETA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_JAQUETA.setText("329,90");
        PNL_Controle_de_vendas.add(LBL_JAQUETA);
        LBL_JAQUETA.setBounds(190, 220, 90, 20);

        LBL_LUVAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_LUVAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_LUVAS.setText("24,90");
        PNL_Controle_de_vendas.add(LBL_LUVAS);
        LBL_LUVAS.setBounds(190, 200, 90, 20);

        LBL_MEIAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_MEIAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_MEIAS.setText("9,90");
        PNL_Controle_de_vendas.add(LBL_MEIAS);
        LBL_MEIAS.setBounds(190, 180, 90, 20);

        LBL_CALCA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_CALCA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_CALCA.setText("38,90");
        PNL_Controle_de_vendas.add(LBL_CALCA);
        LBL_CALCA.setBounds(190, 160, 90, 20);

        LBL_SAPATO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_SAPATO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_SAPATO.setText("99,90");
        PNL_Controle_de_vendas.add(LBL_SAPATO);
        LBL_SAPATO.setBounds(190, 140, 90, 20);

        LBL_PRECO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_PRECO.setText("Preço (em R$):");
        PNL_Controle_de_vendas.add(LBL_PRECO);
        LBL_PRECO.setBounds(190, 30, 90, 20);

        TXT_BONE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_BONE.setText("0");
        TXT_BONE.setEnabled(false);
        TXT_BONE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_BONEFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_BONEFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_BONE);
        TXT_BONE.setBounds(360, 280, 60, 21);

        TXT_CAMISETA_REGATA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_CAMISETA_REGATA.setText("0");
        TXT_CAMISETA_REGATA.setEnabled(false);
        TXT_CAMISETA_REGATA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_CAMISETA_REGATAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_CAMISETA_REGATAFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_CAMISETA_REGATA);
        TXT_CAMISETA_REGATA.setBounds(360, 60, 60, 21);

        TXT_CAMISA_SOCIAL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_CAMISA_SOCIAL.setText("0");
        TXT_CAMISA_SOCIAL.setEnabled(false);
        TXT_CAMISA_SOCIAL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_CAMISA_SOCIALFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_CAMISA_SOCIALFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_CAMISA_SOCIAL);
        TXT_CAMISA_SOCIAL.setBounds(360, 80, 60, 20);

        TXT_BLUSA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_BLUSA.setText("0");
        TXT_BLUSA.setEnabled(false);
        TXT_BLUSA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_BLUSAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_BLUSAFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_BLUSA);
        TXT_BLUSA.setBounds(360, 100, 60, 21);

        TXT_PULLOVER.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_PULLOVER.setText("0");
        TXT_PULLOVER.setEnabled(false);
        TXT_PULLOVER.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_PULLOVERFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_PULLOVERFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_PULLOVER);
        TXT_PULLOVER.setBounds(360, 120, 60, 21);

        TXT_SAPATO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_SAPATO.setText("0");
        TXT_SAPATO.setEnabled(false);
        TXT_SAPATO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_SAPATOFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_SAPATOFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_SAPATO);
        TXT_SAPATO.setBounds(360, 140, 60, 21);

        TXT_CALCA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_CALCA.setText("0");
        TXT_CALCA.setEnabled(false);
        TXT_CALCA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_CALCAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_CALCAFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_CALCA);
        TXT_CALCA.setBounds(360, 160, 60, 21);

        TXT_MEIAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_MEIAS.setText("0");
        TXT_MEIAS.setEnabled(false);
        TXT_MEIAS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_MEIASFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_MEIASFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_MEIAS);
        TXT_MEIAS.setBounds(360, 180, 60, 21);

        TXT_LUVAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_LUVAS.setText("0");
        TXT_LUVAS.setEnabled(false);
        TXT_LUVAS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_LUVASFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_LUVASFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_LUVAS);
        TXT_LUVAS.setBounds(360, 200, 60, 21);

        TXT_JAQUETA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_JAQUETA.setText("0");
        TXT_JAQUETA.setEnabled(false);
        TXT_JAQUETA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_JAQUETAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_JAQUETAFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_JAQUETA);
        TXT_JAQUETA.setBounds(360, 220, 60, 21);

        TXT_BERMUDA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_BERMUDA.setText("0");
        TXT_BERMUDA.setEnabled(false);
        TXT_BERMUDA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_BERMUDAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_BERMUDAFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_BERMUDA);
        TXT_BERMUDA.setBounds(360, 240, 60, 21);

        TXT_CHINELO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_CHINELO.setText("0");
        TXT_CHINELO.setEnabled(false);
        TXT_CHINELO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_CHINELOFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_CHINELOFocusLost(evt);
            }
        });
        PNL_Controle_de_vendas.add(TXT_CHINELO);
        TXT_CHINELO.setBounds(360, 260, 60, 21);

        LBL_QUANTIDADE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_QUANTIDADE.setText("Quantidade:");
        PNL_Controle_de_vendas.add(LBL_QUANTIDADE);
        LBL_QUANTIDADE.setBounds(350, 30, 70, 20);

        TXT_VALOR_BONE.setEditable(false);
        TXT_VALOR_BONE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_BONE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_BONE.setText("0,00");
        TXT_VALOR_BONE.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_BONE);
        TXT_VALOR_BONE.setBounds(490, 280, 60, 15);

        TXT_VALOR_CAMISA_SOCIAL.setEditable(false);
        TXT_VALOR_CAMISA_SOCIAL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_CAMISA_SOCIAL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_CAMISA_SOCIAL.setText("0,00");
        TXT_VALOR_CAMISA_SOCIAL.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_CAMISA_SOCIAL);
        TXT_VALOR_CAMISA_SOCIAL.setBounds(490, 80, 60, 20);

        TXT_VALOR_BLUSA.setEditable(false);
        TXT_VALOR_BLUSA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_BLUSA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_BLUSA.setText("0,00");
        TXT_VALOR_BLUSA.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_BLUSA);
        TXT_VALOR_BLUSA.setBounds(490, 100, 59, 15);

        TXT_VALOR_PULLOVER.setEditable(false);
        TXT_VALOR_PULLOVER.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_PULLOVER.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_PULLOVER.setText("0,00");
        TXT_VALOR_PULLOVER.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_PULLOVER);
        TXT_VALOR_PULLOVER.setBounds(490, 120, 60, 15);

        TXT_VALOR_SAPATO.setEditable(false);
        TXT_VALOR_SAPATO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_SAPATO.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_SAPATO.setText("0,00");
        TXT_VALOR_SAPATO.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_SAPATO);
        TXT_VALOR_SAPATO.setBounds(490, 140, 60, 15);

        TXT_VALOR_CALCA.setEditable(false);
        TXT_VALOR_CALCA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_CALCA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_CALCA.setText("0,00");
        TXT_VALOR_CALCA.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_CALCA);
        TXT_VALOR_CALCA.setBounds(490, 160, 60, 15);

        TXT_VALOR_MEIAS.setEditable(false);
        TXT_VALOR_MEIAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_MEIAS.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_MEIAS.setText("0,00");
        TXT_VALOR_MEIAS.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_MEIAS);
        TXT_VALOR_MEIAS.setBounds(490, 180, 60, 15);

        TXT_VALOR_LUVAS.setEditable(false);
        TXT_VALOR_LUVAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_LUVAS.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_LUVAS.setText("0,00");
        TXT_VALOR_LUVAS.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_LUVAS);
        TXT_VALOR_LUVAS.setBounds(490, 200, 60, 15);

        TXT_VALOR_JAQUETA.setEditable(false);
        TXT_VALOR_JAQUETA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_JAQUETA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_JAQUETA.setText("0,00");
        TXT_VALOR_JAQUETA.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_JAQUETA);
        TXT_VALOR_JAQUETA.setBounds(490, 220, 60, 15);

        TXT_VALOR_BERMUDA.setEditable(false);
        TXT_VALOR_BERMUDA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_BERMUDA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_BERMUDA.setText("0,00");
        TXT_VALOR_BERMUDA.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_BERMUDA);
        TXT_VALOR_BERMUDA.setBounds(490, 240, 60, 15);

        TXT_VALOR_CHINELO.setEditable(false);
        TXT_VALOR_CHINELO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_CHINELO.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_CHINELO.setText("0,00");
        TXT_VALOR_CHINELO.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_CHINELO);
        TXT_VALOR_CHINELO.setBounds(490, 260, 60, 15);

        TXT_VALOR_CAMISETA_REGATA.setEditable(false);
        TXT_VALOR_CAMISETA_REGATA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_CAMISETA_REGATA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_CAMISETA_REGATA.setText("0,00");
        TXT_VALOR_CAMISETA_REGATA.setBorder(null);
        PNL_Controle_de_vendas.add(TXT_VALOR_CAMISETA_REGATA);
        TXT_VALOR_CAMISETA_REGATA.setBounds(490, 60, 60, 15);

        getContentPane().add(PNL_Controle_de_vendas);
        PNL_Controle_de_vendas.setBounds(10, 10, 590, 310);

        BTN_SUB_TOTAL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_SUB_TOTAL.setText("Sub-Total");
        BTN_SUB_TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SUB_TOTALActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_SUB_TOTAL);
        BTN_SUB_TOTAL.setBounds(170, 330, 130, 31);

        LBL_SUB_TOTAL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LBL_SUB_TOTAL.setText("Sub-Total: R$");
        getContentPane().add(LBL_SUB_TOTAL);
        LBL_SUB_TOTAL.setBounds(310, 340, 120, 20);

        TXT_SUB_TOTAL.setBackground(new java.awt.Color(240, 240, 240));
        TXT_SUB_TOTAL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TXT_SUB_TOTAL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_SUB_TOTAL.setText("0,00");
        TXT_SUB_TOTAL.setBorder(null);
        getContentPane().add(TXT_SUB_TOTAL);
        TXT_SUB_TOTAL.setBounds(440, 340, 90, 20);

        PNL_FORMA_DE_PAGAMENTO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Forma de Pagamento:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        PNL_FORMA_DE_PAGAMENTO.setLayout(null);

        BG_FORMAS_DE_PAGAMENTOS.add(RB_A_PRAZO);
        RB_A_PRAZO.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RB_A_PRAZO.setText("À Prazo");
        RB_A_PRAZO.setEnabled(false);
        RB_A_PRAZO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_A_PRAZOActionPerformed(evt);
            }
        });
        PNL_FORMA_DE_PAGAMENTO.add(RB_A_PRAZO);
        RB_A_PRAZO.setBounds(20, 50, 80, 23);

        BG_FORMAS_DE_PAGAMENTOS.add(RB_A_VISTA);
        RB_A_VISTA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RB_A_VISTA.setText("À Vista");
        RB_A_VISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_A_VISTAActionPerformed(evt);
            }
        });
        PNL_FORMA_DE_PAGAMENTO.add(RB_A_VISTA);
        RB_A_VISTA.setBounds(20, 30, 80, 23);

        LBL_VALOR_DA_PARCELA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_VALOR_DA_PARCELA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBL_VALOR_DA_PARCELA.setText("Valor da Parcela: R$");
        PNL_FORMA_DE_PAGAMENTO.add(LBL_VALOR_DA_PARCELA);
        LBL_VALOR_DA_PARCELA.setBounds(20, 120, 120, 20);

        LBL_QUANTIDADE_DE_PARCELA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBL_QUANTIDADE_DE_PARCELA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBL_QUANTIDADE_DE_PARCELA.setText("Quantidade de Parcelas: ");
        PNL_FORMA_DE_PAGAMENTO.add(LBL_QUANTIDADE_DE_PARCELA);
        LBL_QUANTIDADE_DE_PARCELA.setBounds(20, 80, 150, 20);

        CB_NUMERO_PARCELA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CB_NUMERO_PARCELA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "2", "3", "4", "5" }));
        CB_NUMERO_PARCELA.setEnabled(false);
        CB_NUMERO_PARCELA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_NUMERO_PARCELAActionPerformed(evt);
            }
        });
        PNL_FORMA_DE_PAGAMENTO.add(CB_NUMERO_PARCELA);
        CB_NUMERO_PARCELA.setBounds(170, 80, 40, 23);

        TXT_VALOR_DE_PARCELA.setEditable(false);
        TXT_VALOR_DE_PARCELA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_VALOR_DE_PARCELA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_VALOR_DE_PARCELA.setText("0,00");
        TXT_VALOR_DE_PARCELA.setBorder(null);
        PNL_FORMA_DE_PAGAMENTO.add(TXT_VALOR_DE_PARCELA);
        TXT_VALOR_DE_PARCELA.setBounds(140, 123, 70, 15);

        getContentPane().add(PNL_FORMA_DE_PAGAMENTO);
        PNL_FORMA_DE_PAGAMENTO.setBounds(610, 10, 300, 160);

        TXT_TOTAL_DE_DESCONTO.setEditable(false);
        TXT_TOTAL_DE_DESCONTO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TXT_TOTAL_DE_DESCONTO.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_TOTAL_DE_DESCONTO.setText("0,00");
        TXT_TOTAL_DE_DESCONTO.setBorder(null);
        getContentPane().add(TXT_TOTAL_DE_DESCONTO);
        TXT_TOTAL_DE_DESCONTO.setBounds(800, 182, 70, 20);

        LBL_TOTAL_DE_DESCONTO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBL_TOTAL_DE_DESCONTO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBL_TOTAL_DE_DESCONTO.setText("Total de Descontos: R$");
        getContentPane().add(LBL_TOTAL_DE_DESCONTO);
        LBL_TOTAL_DE_DESCONTO.setBounds(630, 180, 170, 20);

        TXT_TOTAL_A_PAGAR.setEditable(false);
        TXT_TOTAL_A_PAGAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TXT_TOTAL_A_PAGAR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_TOTAL_A_PAGAR.setText("0,00");
        TXT_TOTAL_A_PAGAR.setBorder(null);
        getContentPane().add(TXT_TOTAL_A_PAGAR);
        TXT_TOTAL_A_PAGAR.setBounds(750, 220, 70, 20);

        LBL_TOTAL_A_PAGAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBL_TOTAL_A_PAGAR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBL_TOTAL_A_PAGAR.setText("Total à Pagar: R$");
        getContentPane().add(LBL_TOTAL_A_PAGAR);
        LBL_TOTAL_A_PAGAR.setBounds(630, 220, 120, 20);

        BTN_FECHAR_FORMULARIO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_FECHAR_FORMULARIO.setText("<html><center>Fechar<br> Formulário");
        BTN_FECHAR_FORMULARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_FECHAR_FORMULARIOActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_FECHAR_FORMULARIO);
        BTN_FECHAR_FORMULARIO.setBounds(710, 300, 120, 50);

        BTN_CALCULAR_TOTAL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_CALCULAR_TOTAL.setText("<html><center>Calcular<br> Total");
        BTN_CALCULAR_TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CALCULAR_TOTALActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_CALCULAR_TOTAL);
        BTN_CALCULAR_TOTAL.setBounds(660, 250, 100, 40);

        BTN_LIMPAR_TODOS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_LIMPAR_TODOS.setText("<html><center>Limpar <br>Todos");
        BTN_LIMPAR_TODOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LIMPAR_TODOSActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_LIMPAR_TODOS);
        BTN_LIMPAR_TODOS.setBounds(770, 250, 100, 40);

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

    private void SOBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOBREActionPerformed
        // Sobre:
        new about().setVisible(true);
    }//GEN-LAST:event_SOBREActionPerformed

    private void TELA_INICIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELA_INICIALActionPerformed
        // Tela Inicial:
        new tela_inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_TELA_INICIALActionPerformed

    private void LIMPAR_TODOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPAR_TODOSActionPerformed
        // Limpar Tdos:
        limpar_todos();
    }//GEN-LAST:event_LIMPAR_TODOSActionPerformed

    private void cb_camiseta_regataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_camiseta_regataActionPerformed
        // comiseta regata cb:
        if (cb_camiseta_regata.isSelected()) {
            TXT_CAMISETA_REGATA.setEnabled(true);
            TXT_CAMISETA_REGATA.setText("");
            TXT_CAMISETA_REGATA.requestFocus();
        } else {
            limpar_cb1();
        }

    }//GEN-LAST:event_cb_camiseta_regataActionPerformed

    private void cb_camisa_socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_camisa_socialActionPerformed
        // camisa social cb:
        if (cb_camisa_social.isSelected()) {
            TXT_CAMISA_SOCIAL.setEnabled(true);
            TXT_CAMISA_SOCIAL.setText("");
            TXT_CAMISA_SOCIAL.requestFocus();
        } else {
            limpar_cb2();
        }

    }//GEN-LAST:event_cb_camisa_socialActionPerformed

    private void cb_blusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_blusaActionPerformed
        // CheckBox Blusa :
        if (cb_blusa.isSelected()) {
            TXT_BLUSA.setEnabled(true);
            TXT_BLUSA.setText("");
            TXT_BLUSA.requestFocus();
        } else {
            limpar_cb3();
        }

    }//GEN-LAST:event_cb_blusaActionPerformed

    private void cb_pulloverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pulloverActionPerformed
        // CheckBox pullover:
        if (cb_pullover.isSelected()) {
            TXT_PULLOVER.setEnabled(true);
            TXT_PULLOVER.setText("");
            TXT_PULLOVER.requestFocus();
        } else {
            limpar_cb4();
        }
    }//GEN-LAST:event_cb_pulloverActionPerformed

    private void cb_sapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sapatoActionPerformed
        // CheckBox Sapato:
        if (cb_sapato.isSelected()) {
            TXT_SAPATO.setEnabled(true);
            TXT_SAPATO.setText("");
            TXT_SAPATO.requestFocus();
        } else {
            limpar_cb5();
        }
    }//GEN-LAST:event_cb_sapatoActionPerformed

    private void cb_calcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_calcaActionPerformed
        // CheckBox calça:
        if (cb_calca.isSelected()) {
            TXT_CALCA.setEnabled(true);
            TXT_CALCA.setText("");
            TXT_CALCA.requestFocus();
        } else {
            limpar_cb6();
        }
    }//GEN-LAST:event_cb_calcaActionPerformed

    private void cb_meiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_meiasActionPerformed
        // CheckBox meias:
        if (cb_meias.isSelected()) {
            TXT_MEIAS.setEnabled(true);
            TXT_MEIAS.setText("");
            TXT_MEIAS.requestFocus();
        } else {
            limpar_cb7();
        }
    }//GEN-LAST:event_cb_meiasActionPerformed

    private void cb_luvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_luvasActionPerformed
        // CheckBox luvas:
        if (cb_luvas.isSelected()) {
            TXT_LUVAS.setEnabled(true);
            TXT_LUVAS.setText("");
            TXT_LUVAS.requestFocus();
        } else {
            limpar_cb8();
        }
    }//GEN-LAST:event_cb_luvasActionPerformed

    private void cb_jaquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_jaquetaActionPerformed
        // CheckBox jaqueta:
        if (cb_jaqueta.isSelected()) {
            TXT_JAQUETA.setEnabled(true);
            TXT_JAQUETA.setText("");
            TXT_JAQUETA.requestFocus();
        } else {
            limpar_cb9();
        }
    }//GEN-LAST:event_cb_jaquetaActionPerformed

    private void cb_bermudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bermudaActionPerformed
        // CheckBox bermuda:
        if (cb_bermuda.isSelected()) {
            TXT_BERMUDA.setEnabled(true);
            TXT_BERMUDA.setText("");
            TXT_BERMUDA.requestFocus();
        } else {
            limpar_cb10();
        }
    }//GEN-LAST:event_cb_bermudaActionPerformed

    private void cb_chineloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_chineloActionPerformed
        // CheckBox chinelo:
        if (cb_chinelo.isSelected()) {
            TXT_CHINELO.setEnabled(true);
            TXT_CHINELO.setText("");
            TXT_CHINELO.requestFocus();
        } else {
            limpar_cb11();
        }
    }//GEN-LAST:event_cb_chineloActionPerformed

    private void cb_boneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_boneActionPerformed
        // CheckBox bone:
        if (cb_bone.isSelected()) {
            TXT_BONE.setEnabled(true);
            TXT_BONE.setText("");
            TXT_BONE.requestFocus();
        } else {
            limpar_cb12();
        }
    }//GEN-LAST:event_cb_boneActionPerformed

    private void TXT_CAMISETA_REGATAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CAMISETA_REGATAFocusLost
        // Quando caixa de texto camiseta regata perde foco:
        int n1 = Integer.parseInt(TXT_CAMISETA_REGATA.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb1();
        } else {
            try {
                n1 = Integer.parseInt(TXT_CAMISETA_REGATA.getText());
                double n2 = Double.parseDouble(LBL_CAMISETA_REGATA.getText().replace(",", "."));
                TXT_VALOR_CAMISETA_REGATA.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_CAMISETA_REGATA.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_CAMISETA_REGATAFocusLost

    private void TXT_CAMISETA_REGATAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CAMISETA_REGATAFocusGained
        // Quando caixa de texto camiseta regata ganha foco:
        TXT_CAMISETA_REGATA.setText("");
        TXT_VALOR_CAMISETA_REGATA.setText("0,00");
    }//GEN-LAST:event_TXT_CAMISETA_REGATAFocusGained

    private void BTN_LIMPAR_TODOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LIMPAR_TODOSActionPerformed
        // Limpar todos:
        limpar_todos();
    }//GEN-LAST:event_BTN_LIMPAR_TODOSActionPerformed

    private void RB_A_PRAZOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_A_PRAZOActionPerformed
        // RadioButton a prazo:
        CB_NUMERO_PARCELA.setEnabled(true);
    }//GEN-LAST:event_RB_A_PRAZOActionPerformed

    private void TXT_CAMISA_SOCIALFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CAMISA_SOCIALFocusGained
        // Quando caixa de texto camisa social ganha foco:
        TXT_CAMISA_SOCIAL.setText("");
        TXT_VALOR_CAMISA_SOCIAL.setText("0,00");
    }//GEN-LAST:event_TXT_CAMISA_SOCIALFocusGained

    private void TXT_CAMISA_SOCIALFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CAMISA_SOCIALFocusLost
        // Quando caixa de texto camisa social perde foco:
        int n1 = Integer.parseInt(TXT_CAMISA_SOCIAL.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb2();
        } else {
            try {
                n1 = Integer.parseInt(TXT_CAMISA_SOCIAL.getText());
                double n2 = Double.parseDouble(LBL_CAMISA_SOCIAL.getText().replace(",", "."));
                TXT_VALOR_CAMISA_SOCIAL.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_CAMISA_SOCIAL.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_CAMISA_SOCIALFocusLost

    private void TXT_BLUSAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_BLUSAFocusGained
        // Quando caixa de texto blusa ganha foco:
        TXT_BLUSA.setText("");
        TXT_VALOR_BLUSA.setText("0,00");
    }//GEN-LAST:event_TXT_BLUSAFocusGained

    private void TXT_BLUSAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_BLUSAFocusLost
        // Quando caixa de texto blusa perde foco:
        int n1 = Integer.parseInt(TXT_BLUSA.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb3();
        } else {
            try {
                n1 = Integer.parseInt(TXT_BLUSA.getText());
                double n2 = Double.parseDouble(LBL_BLUSA.getText().replace(",", "."));
                TXT_VALOR_BLUSA.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_BLUSA.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_BLUSAFocusLost

    private void TXT_PULLOVERFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_PULLOVERFocusGained
        // Quando caixa de texto pullover ganha foco:
        TXT_PULLOVER.setText("");
        TXT_VALOR_PULLOVER.setText("0,00");
    }//GEN-LAST:event_TXT_PULLOVERFocusGained

    private void TXT_PULLOVERFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_PULLOVERFocusLost
        // Quando caixa de texto pullover perde foco:
        int n1 = Integer.parseInt(TXT_PULLOVER.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb4();
        } else {
            try {
                n1 = Integer.parseInt(TXT_PULLOVER.getText());
                double n2 = Double.parseDouble(LBL_PULLOVER.getText().replace(",", "."));
                TXT_VALOR_PULLOVER.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_PULLOVER.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_PULLOVERFocusLost

    private void TXT_SAPATOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_SAPATOFocusGained
        // Quando caixa de texto sapato ganha foco:
        TXT_SAPATO.setText("");
        TXT_VALOR_SAPATO.setText("0,00");
    }//GEN-LAST:event_TXT_SAPATOFocusGained

    private void TXT_SAPATOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_SAPATOFocusLost
        // Quando caixa de texto sapato perde foco:
        int n1 = Integer.parseInt(TXT_SAPATO.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb5();
        } else {
            try {
                n1 = Integer.parseInt(TXT_SAPATO.getText());
                double n2 = Double.parseDouble(LBL_SAPATO.getText().replace(",", "."));
                TXT_VALOR_SAPATO.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_SAPATO.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_SAPATOFocusLost

    private void TXT_CALCAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CALCAFocusGained
        // Quando caixa de texto calça ganha foco:
        TXT_CALCA.setText("");
        TXT_VALOR_CALCA.setText("0,00");
    }//GEN-LAST:event_TXT_CALCAFocusGained

    private void TXT_MEIASFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_MEIASFocusLost
        // Quando caixa de texto meias perde foco:
        int n1 = Integer.parseInt(TXT_MEIAS.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb7();
        } else {
            try {
                n1 = Integer.parseInt(TXT_MEIAS.getText());
                double n2 = Double.parseDouble(LBL_MEIAS.getText().replace(",", "."));
                TXT_VALOR_MEIAS.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_MEIAS.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_MEIASFocusLost

    private void TXT_LUVASFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_LUVASFocusGained
        // Quando caixa de texto luvas ganha foco:
        TXT_LUVAS.setText("");
        TXT_VALOR_LUVAS.setText("0,00");
    }//GEN-LAST:event_TXT_LUVASFocusGained

    private void TXT_LUVASFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_LUVASFocusLost
        // Quando caixa de texto luvas perde foco:
        int n1 = Integer.parseInt(TXT_LUVAS.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb8();
        } else {
            try {
                n1 = Integer.parseInt(TXT_LUVAS.getText());
                double n2 = Double.parseDouble(LBL_LUVAS.getText().replace(",", "."));
                TXT_VALOR_LUVAS.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_LUVAS.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_LUVASFocusLost

    private void BTN_SUB_TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SUB_TOTALActionPerformed
        // Calcular Sub-total:
        limpar_desconto_e_total();
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;
        double resultado = 0;
        n1 = Double.parseDouble(TXT_VALOR_CAMISETA_REGATA.getText().replace(",", "."));
        n2 = Double.parseDouble(TXT_VALOR_CAMISA_SOCIAL.getText().replace(",", "."));
        n3 = Double.parseDouble(TXT_VALOR_BLUSA.getText().replace(",", "."));
        n4 = Double.parseDouble(TXT_VALOR_PULLOVER.getText().replace(",", "."));
        n5 = Double.parseDouble(TXT_VALOR_SAPATO.getText().replace(",", "."));
        n6 = Double.parseDouble(TXT_VALOR_CALCA.getText().replace(",", "."));
        n7 = Double.parseDouble(TXT_VALOR_MEIAS.getText().replace(",", "."));
        n8 = Double.parseDouble(TXT_VALOR_LUVAS.getText().replace(",", "."));
        n9 = Double.parseDouble(TXT_VALOR_JAQUETA.getText().replace(",", "."));
        n10 = Double.parseDouble(TXT_VALOR_BERMUDA.getText().replace(",", "."));
        n11 = Double.parseDouble(TXT_VALOR_CHINELO.getText().replace(",", "."));
        n12 = Double.parseDouble(TXT_VALOR_BONE.getText().replace(",", "."));

        resultado = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12;
        if (resultado == 0) {
            TXT_SUB_TOTAL.setText("0,00");
        } else {
            TXT_SUB_TOTAL.setText(formatar.format(resultado));

            if (resultado < 20) {
                limpar_combb();
                RB_A_VISTA.setSelected(true);
                JOptionPane.showMessageDialog(null, "Parcelas disponíveis apenas em compras de R$ 20,00 acima!");
            } else {
                RB_A_PRAZO.setEnabled(true);
                RB_A_VISTA.setSelected(true);
            }
        }


    }//GEN-LAST:event_BTN_SUB_TOTALActionPerformed

    private void TXT_CALCAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CALCAFocusLost
        // Quando caixa de texto calça perde foco:
        int n1 = Integer.parseInt(TXT_CALCA.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb6();
        } else {
            try {
                n1 = Integer.parseInt(TXT_CALCA.getText());
                double n2 = Double.parseDouble(LBL_CALCA.getText().replace(",", "."));
                TXT_VALOR_CALCA.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_CALCA.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_CALCAFocusLost

    private void TXT_MEIASFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_MEIASFocusGained
        // Quando caixa de texto meias ganha foco:
        TXT_MEIAS.setText("");
        TXT_VALOR_MEIAS.setText("0,00");
    }//GEN-LAST:event_TXT_MEIASFocusGained

    private void TXT_JAQUETAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_JAQUETAFocusGained
        // Quando caixa de texto jaqueta ganha foco:
        TXT_JAQUETA.setText("");
        TXT_VALOR_JAQUETA.setText("0,00");
    }//GEN-LAST:event_TXT_JAQUETAFocusGained

    private void TXT_JAQUETAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_JAQUETAFocusLost
        // Quando caixa de texto jaqueta perde foco:
        int n1 = Integer.parseInt(TXT_JAQUETA.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb9();
        } else {
            try {
                n1 = Integer.parseInt(TXT_JAQUETA.getText());
                double n2 = Double.parseDouble(LBL_JAQUETA.getText().replace(",", "."));
                TXT_VALOR_JAQUETA.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_JAQUETA.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_JAQUETAFocusLost

    private void TXT_BERMUDAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_BERMUDAFocusGained
        // Quando caixa de texto bermuda ganha foco:
        TXT_BERMUDA.setText("");
        TXT_VALOR_BERMUDA.setText("0,00");
    }//GEN-LAST:event_TXT_BERMUDAFocusGained

    private void TXT_BERMUDAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_BERMUDAFocusLost
        // Quando caixa de texto bermuda perde foco:
        int n1 = Integer.parseInt(TXT_BERMUDA.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb10();
        } else {
            try {
                n1 = Integer.parseInt(TXT_BERMUDA.getText());
                double n2 = Double.parseDouble(LBL_BERMUDA.getText().replace(",", "."));
                TXT_VALOR_BERMUDA.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_BERMUDA.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_BERMUDAFocusLost

    private void TXT_CHINELOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CHINELOFocusGained
        // Quando caixa de texto chinelo ganha foco:
        TXT_CHINELO.setText("");
        TXT_VALOR_CHINELO.setText("0,00");
    }//GEN-LAST:event_TXT_CHINELOFocusGained

    private void TXT_BONEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_BONEFocusGained
        // Quando caixa de texto bone ganha foco:
        TXT_BONE.setText("");
        TXT_VALOR_BONE.setText("0,00");
    }//GEN-LAST:event_TXT_BONEFocusGained

    private void TXT_CHINELOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_CHINELOFocusLost
        // Quando caixa de texto chinelo perde foco:
        int n1 = Integer.parseInt(TXT_CHINELO.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb11();
        } else {
            try {
                n1 = Integer.parseInt(TXT_CHINELO.getText());
                double n2 = Double.parseDouble(LBL_CHINELO.getText().replace(",", "."));
                TXT_VALOR_CHINELO.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_CHINELO.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_CHINELOFocusLost

    private void TXT_BONEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_BONEFocusLost
        // Quando caixa de texto bone perde foco:
        int n1 = Integer.parseInt(TXT_BONE.getText().replace("", "0"));
        if (n1 == 0) {
            limpar_cb12();
        } else {
            try {
                n1 = Integer.parseInt(TXT_BONE.getText());
                double n2 = Double.parseDouble(LBL_BONE.getText().replace(",", "."));
                TXT_VALOR_BONE.setText(formatar.format(n1 * n2));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível executar o cálculo!\nUse apenas números inteiros!");
                TXT_BONE.requestFocus();
            }
        }
    }//GEN-LAST:event_TXT_BONEFocusLost

    private void RB_A_VISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_A_VISTAActionPerformed
        CB_NUMERO_PARCELA.setEnabled(false);
    }//GEN-LAST:event_RB_A_VISTAActionPerformed

    private void CB_NUMERO_PARCELAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_NUMERO_PARCELAActionPerformed
        checar_parcelas();
    }//GEN-LAST:event_CB_NUMERO_PARCELAActionPerformed

    private void BTN_CALCULAR_TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CALCULAR_TOTALActionPerformed
        // Calcula Total:
        if (RB_A_VISTA.isSelected()) {
            double n1 = Double.parseDouble(TXT_SUB_TOTAL.getText().replace(",", "."));
            double resultado = (n1 * (11.5 / 100));
            double n2 = n1 - resultado;
            TXT_TOTAL_DE_DESCONTO.setText(formatar.format(resultado));
            TXT_TOTAL_A_PAGAR.setText(formatar.format(n2));
        } else {
            limpar_desconto_e_total();
            double n1 = Double.parseDouble(TXT_VALOR_DE_PARCELA.getText().replace(",", "."));
            int n2 = Integer.parseInt(CB_NUMERO_PARCELA.getSelectedItem().toString());
            double resultado = n1 * n2;
            TXT_TOTAL_A_PAGAR.setText(formatar.format(resultado));
        }
    }//GEN-LAST:event_BTN_CALCULAR_TOTALActionPerformed

    private void BTN_FECHAR_FORMULARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FECHAR_FORMULARIOActionPerformed
        // TODO add your handling code here:
        new tela_inicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_BTN_FECHAR_FORMULARIOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_FORMAS_DE_PAGAMENTOS;
    private javax.swing.JButton BTN_CALCULAR_TOTAL;
    private javax.swing.JButton BTN_FECHAR_FORMULARIO;
    private javax.swing.JButton BTN_LIMPAR_TODOS;
    private javax.swing.JButton BTN_SUB_TOTAL;
    private javax.swing.JMenuBar Barra_de_menu;
    private javax.swing.JComboBox CB_NUMERO_PARCELA;
    private javax.swing.JLabel LBL_BERMUDA;
    private javax.swing.JLabel LBL_BLUSA;
    private javax.swing.JLabel LBL_BONE;
    private javax.swing.JLabel LBL_CALCA;
    private javax.swing.JLabel LBL_CAMISA_SOCIAL;
    private javax.swing.JLabel LBL_CAMISETA_REGATA;
    private javax.swing.JLabel LBL_CHINELO;
    private javax.swing.JLabel LBL_JAQUETA;
    private javax.swing.JLabel LBL_LUVAS;
    private javax.swing.JLabel LBL_MEIAS;
    private javax.swing.JLabel LBL_PRECO;
    private javax.swing.JLabel LBL_PRODUTO;
    private javax.swing.JLabel LBL_PULLOVER;
    private javax.swing.JLabel LBL_QUANTIDADE;
    private javax.swing.JLabel LBL_QUANTIDADE_DE_PARCELA;
    private javax.swing.JLabel LBL_SAPATO;
    private javax.swing.JLabel LBL_SUB_TOTAL;
    private javax.swing.JLabel LBL_TOTAL_A_PAGAR;
    private javax.swing.JLabel LBL_TOTAL_DE_DESCONTO;
    private javax.swing.JLabel LBL_VALOR;
    private javax.swing.JLabel LBL_VALOR_DA_PARCELA;
    private javax.swing.JMenuItem LIMPAR_TODOS;
    private javax.swing.JMenu Menu;
    private javax.swing.JPanel PNL_Controle_de_vendas;
    private javax.swing.JPanel PNL_FORMA_DE_PAGAMENTO;
    private javax.swing.JRadioButton RB_A_PRAZO;
    private javax.swing.JRadioButton RB_A_VISTA;
    private javax.swing.JMenuItem SOBRE;
    private javax.swing.JMenu Sobre;
    private javax.swing.JMenuItem TELA_INICIAL;
    private javax.swing.JTextField TXT_BERMUDA;
    private javax.swing.JTextField TXT_BLUSA;
    private javax.swing.JTextField TXT_BONE;
    private javax.swing.JTextField TXT_CALCA;
    private javax.swing.JTextField TXT_CAMISA_SOCIAL;
    private javax.swing.JTextField TXT_CAMISETA_REGATA;
    private javax.swing.JTextField TXT_CHINELO;
    private javax.swing.JTextField TXT_JAQUETA;
    private javax.swing.JTextField TXT_LUVAS;
    private javax.swing.JTextField TXT_MEIAS;
    private javax.swing.JTextField TXT_PULLOVER;
    private javax.swing.JTextField TXT_SAPATO;
    private javax.swing.JTextField TXT_SUB_TOTAL;
    private javax.swing.JTextField TXT_TOTAL_A_PAGAR;
    private javax.swing.JTextField TXT_TOTAL_DE_DESCONTO;
    private javax.swing.JTextField TXT_VALOR_BERMUDA;
    private javax.swing.JTextField TXT_VALOR_BLUSA;
    private javax.swing.JTextField TXT_VALOR_BONE;
    private javax.swing.JTextField TXT_VALOR_CALCA;
    private javax.swing.JTextField TXT_VALOR_CAMISA_SOCIAL;
    private javax.swing.JTextField TXT_VALOR_CAMISETA_REGATA;
    private javax.swing.JTextField TXT_VALOR_CHINELO;
    private javax.swing.JTextField TXT_VALOR_DE_PARCELA;
    private javax.swing.JTextField TXT_VALOR_JAQUETA;
    private javax.swing.JTextField TXT_VALOR_LUVAS;
    private javax.swing.JTextField TXT_VALOR_MEIAS;
    private javax.swing.JTextField TXT_VALOR_PULLOVER;
    private javax.swing.JTextField TXT_VALOR_SAPATO;
    private javax.swing.JCheckBox cb_bermuda;
    private javax.swing.JCheckBox cb_blusa;
    private javax.swing.JCheckBox cb_bone;
    private javax.swing.JCheckBox cb_calca;
    private javax.swing.JCheckBox cb_camisa_social;
    private javax.swing.JCheckBox cb_camiseta_regata;
    private javax.swing.JCheckBox cb_chinelo;
    private javax.swing.JCheckBox cb_jaqueta;
    private javax.swing.JCheckBox cb_luvas;
    private javax.swing.JCheckBox cb_meias;
    private javax.swing.JCheckBox cb_pullover;
    private javax.swing.JCheckBox cb_sapato;
    // End of variables declaration//GEN-END:variables
}
