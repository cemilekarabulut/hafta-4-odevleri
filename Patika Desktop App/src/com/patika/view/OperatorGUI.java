package com.patika.view;

import com.patika.helper.Config;
import com.patika.helper.DBConnector;
import com.patika.helper.Helper;
import com.patika.model.Operator;
import com.patika.model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OperatorGUI extends JFrame {

    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JLabel lbl_welcome;
    private JPanel pnl_user_list;
    private JScrollPane scroll_user_list;
    private JTable tbl_user_list;
    private JTextField textField1;
    private final Operator operator;
    private DefaultTableModel mdl_user_list;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        add(wrapper);
        setSize(1000,500);
        setLocation(Helper.calculateScreenCenter("x",getSize()), Helper.calculateScreenCenter("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Helper.setLayout();
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        //Set top information
        lbl_welcome.setText(operator.getName());

        //Set User Info panel
        mdl_user_list = new DefaultTableModel();
        Object[] col_user_list = {"ID","Name","Username","Password","User Type"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        for(User obj: User.getList()){
            Object[] row = new Object[col_user_list.length];
            row[0] = obj.getId();
            row[1] = obj.getName();
            row[2] = obj.getUsername();
            row[3] = obj.getPassword();
            row[4] = obj.getType();
            mdl_user_list.addRow(row);
        }

        tbl_user_list.setModel(mdl_user_list);
        tbl_user_list.getTableHeader().setReorderingAllowed(false);
    }
    public static void main(String... args) {
        Helper.setLayout();
        Operator operator = new Operator();
        operator.setName("x");
        OperatorGUI operatorGUI = new OperatorGUI(operator);
        DBConnector.getInstance();
    }
}
