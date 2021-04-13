/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import sk.stu.fiit.inputs.InputProcessor;
import sk.stu.fiit.logic.Category;
import sk.stu.fiit.logic.Customer;
import sk.stu.fiit.logic.Hotel;
import sk.stu.fiit.logic.Reservation;
import sk.stu.fiit.logic.Room;

/**
 *
 * @author PeterSmrecek
 */
public class AddReservationWindow extends javax.swing.JFrame {
    
    private static final Logger logger = Logger.getLogger(AddReservationWindow.class.getName());
    
    private Hotel hotel;
    private MainWindow mainWindow;
    
    private SimpleDateFormat sdfRoom = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    private SimpleDateFormat sdfCreate = new SimpleDateFormat("dd.MM.yyyy");
    private ArrayList<String> listCategoriesNames;
    private ArrayList<Category> listCategories;

    private ArrayList<String> listRoomNames;
    private ArrayList<Room> listRooms;
    
    private ArrayList<String> listCustomerNames;
    private ArrayList<Customer> listCustomers;

    private Customer accommCustomer;
    private Room accommRoom;
    private Date accommStartDate;
    private Date accommEndDate;
    
    /**
     * Creates new form CustomerHistoriWindow
     */
    public AddReservationWindow(MainWindow mainWindow, Hotel hotel) {
        initComponents();
        this.hotel = hotel;
        this.mainWindow = mainWindow;
        
        refreshCategories();
        
        listCustomers = hotel.getListCustomers();
        listCustomerNames = InputProcessor.getListOfNames(listCustomers);
        
        clearFields();
        customersCb.setModel(new DefaultComboBoxModel<String>(listCustomerNames.toArray(new String[0])));
        loadCustomer(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        buttonsPnl = new javax.swing.JPanel();
        newReservationBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        customerPnl = new javax.swing.JPanel();
        phoneLbl = new javax.swing.JLabel();
        phoneTf = new javax.swing.JTextField();
        emailTf = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        chooseLbl = new javax.swing.JLabel();
        addressTf = new javax.swing.JTextField();
        addressLbl = new javax.swing.JLabel();
        customersCb = new javax.swing.JComboBox<>();
        nameLbl = new javax.swing.JLabel();
        newAccommodationPnl = new javax.swing.JPanel();
        priceNightLbl = new javax.swing.JLabel();
        roomLbl = new javax.swing.JLabel();
        endDateLbl = new javax.swing.JLabel();
        discountLbl = new javax.swing.JLabel();
        categoryLbl = new javax.swing.JLabel();
        priceNightTf = new javax.swing.JTextField();
        discountTf = new javax.swing.JTextField();
        endDateTf = new javax.swing.JTextField();
        startDateTf = new javax.swing.JTextField();
        startDateLbl = new javax.swing.JLabel();
        sumTf = new javax.swing.JTextField();
        nightsLbl = new javax.swing.JLabel();
        nightsTf = new javax.swing.JTextField();
        sumLbl = new javax.swing.JLabel();
        categoryCb = new javax.swing.JComboBox<>();
        roomCb = new javax.swing.JComboBox<>();
        availableBtn = new javax.swing.JButton();
        selectCategoryBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ubytovanie");

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        mainPnl.setLayout(jPanel1Layout);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Rezervácie");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLbl.setPreferredSize(new java.awt.Dimension(450, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        mainPnl.add(titleLbl, gridBagConstraints);

        buttonsPnl.setLayout(new javax.swing.BoxLayout(buttonsPnl, javax.swing.BoxLayout.LINE_AXIS));

        newReservationBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newReservationBtn.setText("Vytvoriť novú rezerváciu");
        newReservationBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newReservationBtnMouseReleased(evt);
            }
        });
        buttonsPnl.add(newReservationBtn);

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelBtn.setText("Zrušiť");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelBtnMouseReleased(evt);
            }
        });
        buttonsPnl.add(cancelBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        mainPnl.add(buttonsPnl, gridBagConstraints);

        customerPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informácie o zákazníkovi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        java.awt.GridBagLayout customerPnlLayout = new java.awt.GridBagLayout();
        customerPnlLayout.columnWidths = new int[] {0, 5, 0};
        customerPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        customerPnl.setLayout(customerPnlLayout);

        phoneLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneLbl.setText("Telefónne číslo");
        phoneLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        phoneLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        customerPnl.add(phoneLbl, gridBagConstraints);

        phoneTf.setEditable(false);
        phoneTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneTf.setMinimumSize(new java.awt.Dimension(300, 26));
        phoneTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        customerPnl.add(phoneTf, gridBagConstraints);

        emailTf.setEditable(false);
        emailTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTf.setMinimumSize(new java.awt.Dimension(300, 26));
        emailTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        customerPnl.add(emailTf, gridBagConstraints);

        emailLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLbl.setText("Email");
        emailLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        emailLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        customerPnl.add(emailLbl, gridBagConstraints);

        nameTf.setEditable(false);
        nameTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameTf.setMinimumSize(new java.awt.Dimension(300, 26));
        nameTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        customerPnl.add(nameTf, gridBagConstraints);

        chooseLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chooseLbl.setText("Zvoľ zákazníka");
        chooseLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        chooseLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        customerPnl.add(chooseLbl, gridBagConstraints);

        addressTf.setEditable(false);
        addressTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressTf.setMinimumSize(new java.awt.Dimension(300, 26));
        addressTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        customerPnl.add(addressTf, gridBagConstraints);

        addressLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressLbl.setText("Adresa");
        addressLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        addressLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        customerPnl.add(addressLbl, gridBagConstraints);

        customersCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customersCb.setMinimumSize(new java.awt.Dimension(300, 26));
        customersCb.setPreferredSize(new java.awt.Dimension(300, 26));
        customersCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersCbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        customerPnl.add(customersCb, gridBagConstraints);

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText("Meno");
        nameLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        nameLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        customerPnl.add(nameLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 7;
        mainPnl.add(customerPnl, gridBagConstraints);

        newAccommodationPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ubytovanie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        java.awt.GridBagLayout newAccommodationPnlLayout = new java.awt.GridBagLayout();
        newAccommodationPnlLayout.columnWidths = new int[] {0, 5, 0};
        newAccommodationPnlLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        newAccommodationPnl.setLayout(newAccommodationPnlLayout);

        priceNightLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceNightLbl.setText("Cena za noc");
        priceNightLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        priceNightLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        newAccommodationPnl.add(priceNightLbl, gridBagConstraints);

        roomLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roomLbl.setText("Izba");
        roomLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        roomLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        newAccommodationPnl.add(roomLbl, gridBagConstraints);

        endDateLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        endDateLbl.setText("Dátum konca ubytovania");
        endDateLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        endDateLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        newAccommodationPnl.add(endDateLbl, gridBagConstraints);

        discountLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        discountLbl.setText("Zľava");
        discountLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        discountLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        newAccommodationPnl.add(discountLbl, gridBagConstraints);

        categoryLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoryLbl.setText("Kategória izby");
        categoryLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        categoryLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        newAccommodationPnl.add(categoryLbl, gridBagConstraints);

        priceNightTf.setEditable(false);
        priceNightTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceNightTf.setMinimumSize(new java.awt.Dimension(300, 26));
        priceNightTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        newAccommodationPnl.add(priceNightTf, gridBagConstraints);

        discountTf.setEditable(false);
        discountTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        discountTf.setMinimumSize(new java.awt.Dimension(300, 26));
        discountTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        newAccommodationPnl.add(discountTf, gridBagConstraints);

        endDateTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        endDateTf.setMinimumSize(new java.awt.Dimension(300, 26));
        endDateTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        newAccommodationPnl.add(endDateTf, gridBagConstraints);

        startDateTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startDateTf.setMinimumSize(new java.awt.Dimension(300, 26));
        startDateTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        newAccommodationPnl.add(startDateTf, gridBagConstraints);

        startDateLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startDateLbl.setText("Dátum začiatku ubytovania");
        startDateLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        startDateLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        newAccommodationPnl.add(startDateLbl, gridBagConstraints);

        sumTf.setEditable(false);
        sumTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sumTf.setMinimumSize(new java.awt.Dimension(300, 26));
        sumTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        newAccommodationPnl.add(sumTf, gridBagConstraints);

        nightsLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nightsLbl.setText("Počet nocí");
        nightsLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        nightsLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        newAccommodationPnl.add(nightsLbl, gridBagConstraints);

        nightsTf.setEditable(false);
        nightsTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nightsTf.setMinimumSize(new java.awt.Dimension(300, 26));
        nightsTf.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        newAccommodationPnl.add(nightsTf, gridBagConstraints);

        sumLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sumLbl.setText("Cena bez služieb");
        sumLbl.setMinimumSize(new java.awt.Dimension(200, 20));
        sumLbl.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        newAccommodationPnl.add(sumLbl, gridBagConstraints);

        categoryCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoryCb.setToolTipText("");
        categoryCb.setMinimumSize(new java.awt.Dimension(300, 26));
        categoryCb.setPreferredSize(new java.awt.Dimension(300, 26));
        categoryCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryCbItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        newAccommodationPnl.add(categoryCb, gridBagConstraints);

        roomCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roomCb.setToolTipText("");
        roomCb.setMinimumSize(new java.awt.Dimension(300, 26));
        roomCb.setPreferredSize(new java.awt.Dimension(300, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        newAccommodationPnl.add(roomCb, gridBagConstraints);

        availableBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        availableBtn.setText("Vypočítať cenu a overiť dostupnosť");
        availableBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                availableBtnMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        newAccommodationPnl.add(availableBtn, gridBagConstraints);

        selectCategoryBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectCategoryBtn.setText("Zvoliť kategóriu");
        selectCategoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                selectCategoryBtnMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        newAccommodationPnl.add(selectCategoryBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 11;
        mainPnl.add(newAccommodationPnl, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newReservationBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newReservationBtnMouseReleased
        // TODO add your handling code here:
        
        countForRoom();
        if (hotel.available(accommStartDate, accommEndDate, accommRoom)) {
            Reservation reservation = new Reservation(accommCustomer, accommRoom, accommStartDate, accommEndDate);
            hotel.addReservation(reservation);
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Izba v danom termíne nie je dostupná!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        mainWindow.updateAll();
        logger.info("New reservation added");
        this.dispose();
    }//GEN-LAST:event_newReservationBtnMouseReleased

    private void cancelBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseReleased
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseReleased

    private void customersCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersCbActionPerformed
        // TODO add your handling code here:
        String atribute = "";

        if (customersCb.getSelectedItem() != null) {
            atribute = String.valueOf(customersCb.getSelectedItem());
        }

        if (InputProcessor.emptyString(atribute)) {
//            JOptionPane.showMessageDialog(rootPane,
//                    "Výber nemôže byť prázdny!",
//                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int index = listCustomerNames.indexOf(atribute);
        loadCustomer(index);
    }//GEN-LAST:event_customersCbActionPerformed

    private void availableBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availableBtnMouseReleased
        // TODO add your handling code here:
        countForRoom();
        if (!hotel.available(accommStartDate, accommEndDate, accommRoom)) {
                JOptionPane.showMessageDialog(rootPane,
                        "Izba v danom termíne nie je dostupná!",
                        "Chyba!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_availableBtnMouseReleased

    private void selectCategoryBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectCategoryBtnMouseReleased
        // TODO add your handling code here:
        refrehRooms();
        roomCb.setEnabled(true);
    }//GEN-LAST:event_selectCategoryBtnMouseReleased

    private void categoryCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryCbItemStateChanged
        // TODO add your handling code here:
        priceNightTf.setText("");
        nightsTf.setText("");
        discountTf.setText("");
        sumTf.setText("");
        roomCb.removeAllItems();
        roomCb.setEnabled(false);
    }//GEN-LAST:event_categoryCbItemStateChanged

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoriWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoriWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoriWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerHistoriWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerHistoriWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTf;
    private javax.swing.JButton availableBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel buttonsPnl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> categoryCb;
    private javax.swing.JLabel categoryLbl;
    private javax.swing.JLabel chooseLbl;
    private javax.swing.JPanel customerPnl;
    private javax.swing.JComboBox<String> customersCb;
    private javax.swing.JLabel discountLbl;
    private javax.swing.JTextField discountTf;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel endDateLbl;
    private javax.swing.JTextField endDateTf;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JPanel newAccommodationPnl;
    private javax.swing.JButton newReservationBtn;
    private javax.swing.JLabel nightsLbl;
    private javax.swing.JTextField nightsTf;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTf;
    private javax.swing.JLabel priceNightLbl;
    private javax.swing.JTextField priceNightTf;
    private javax.swing.JComboBox<String> roomCb;
    private javax.swing.JLabel roomLbl;
    private javax.swing.JButton selectCategoryBtn;
    private javax.swing.JLabel startDateLbl;
    private javax.swing.JTextField startDateTf;
    private javax.swing.JLabel sumLbl;
    private javax.swing.JTextField sumTf;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
    
    private void refreshCategories() {
        listCategories = hotel.getListCategories();
        listCategoriesNames = InputProcessor.getListOfNames(listCategories);
        categoryCb.setModel(new DefaultComboBoxModel<String>(listCategoriesNames.toArray(new String[0])));
        
        roomCb.setEnabled(false);
        
        refrehRooms();
    }

    private void refrehRooms() {
        String atribute = "";

        if (categoryCb.getSelectedItem() != null) {
            atribute = String.valueOf(categoryCb.getSelectedItem());
        }

        if (InputProcessor.emptyString(atribute)) {
            JOptionPane.showMessageDialog(rootPane,
                    "Výber kategórie nemôže byť prázdny!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int index = listCategoriesNames.indexOf(atribute);

        if (!InputProcessor.isPositiveInt(index)) {
//            JOptionPane.showMessageDialog(rootPane,
//                    "Zlý výber!",
//                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Category category = listCategories.get(index);

        listRooms = category.getListRooms();
        listRoomNames = InputProcessor.getListOfNames(listRooms);
        roomCb.setModel(new DefaultComboBoxModel<String>(listRoomNames.toArray(new String[0])));
    }
    
    private void clearFields(){
        nameTf.setText("");
        addressTf.setText("");
        phoneTf.setText("");
        emailTf.setText("");
        startDateTf.setText("");
        endDateTf.setText("");
        priceNightTf.setText("");
        nightsTf.setText("");
        discountTf.setText("");
        sumTf.setText("");
    }

    private void loadCustomer(int id) {
        clearFields();
        if (listCustomers.size() == 0) {
            return;
        }
        
        startDateTf.setEditable(true);
        endDateTf.setEditable(true);
        categoryCb.setEnabled(true);
        
        priceNightTf.setEditable(false);
        nightsTf.setEditable(false);
        discountTf.setEditable(false);
        sumTf.setEditable(false);
        
        Customer customer = listCustomers.get(id);
        
        accommCustomer = customer;
        accommRoom = null;
        accommStartDate = null;
        accommEndDate = null;
        
        nameTf.setText(customer.getName());
        addressTf.setText(customer.getAddress());
        phoneTf.setText(customer.getPhoneNumber());
        emailTf.setText(customer.getEmail());
        
        if (listCategories.size() == 0) {
            return;
        }
        categoryCb.setSelectedIndex(0);
        roomCb.removeAllItems();
    }

    private void countForRoom() {
        String atribute = "";

        if (roomCb.getSelectedItem() != null) {
            atribute = String.valueOf(roomCb.getSelectedItem());
        }

        if (InputProcessor.emptyString(atribute)) {
            JOptionPane.showMessageDialog(rootPane,
                    "Výber izby nemôže byť prázdny!",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int index = listRoomNames.indexOf(atribute);

        Room room = listRooms.get(index);
        
        Category category = room.getCategory();
        
        Date start;
        Date end;
        try {
            start = sdfCreate.parse(startDateTf.getText());
            end = sdfCreate.parse(endDateTf.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(rootPane,
                    "Nesprávny formát dátumu. Zadajte dátum vo formáte dd.MM.yyyy.",
                    "Chyba!", JOptionPane.ERROR_MESSAGE);
            logger.warn("Wrong date format");
            return;
        }
        
        long diffInMillies = Math.abs(end.getTime() - start.getTime());
        int diffInDays = (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        double nightPrice = category.getPrice();
        double originalPrice = nightPrice * diffInDays;
        int discount = diffInDays > 7 ? 10 : 0;
        double priceSum = originalPrice * (100 - discount) / 100;

        priceNightTf.setText(String.valueOf(nightPrice));
        nightsTf.setText(String.valueOf(diffInDays));
        discountTf.setText(discount > 0 ? String.valueOf(discount) : "Bez zľavy");
        sumTf.setText(String.valueOf(priceSum));

        priceNightTf.setEditable(false);
        nightsTf.setEditable(false);
        discountTf.setEditable(false);
        sumTf.setEditable(false);
        
        accommRoom = room;
        accommStartDate = InputProcessor.dateStart(start);
        accommEndDate = InputProcessor.dateStart(end);
    }
}
