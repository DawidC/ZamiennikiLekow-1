package shackyshell.zamiennikilekow.client.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.sql.*;

/**
 * Created by Dawid on 26.02.2017.
 */
public class MainWindow{
    private Object[][] data=null;
    private String[] columnNames = {
            "",
            "Nazwa",
            "Skladnik1",
            "Skladnik2",
            "Skladnik3",
            "Skladnik4",
            "Skladnik5",
            "Skladnik6",
            "Skladnik7",
            "Skladnik8",
            "Skladnik9",
            "Skladnik10",
            "Dawka",
            "Ilosc",
            "Jednostka",
            "Forma",
            "PhotoURL"
    };
    private JTextField searchField;
    private JButton searchButton;
    private JPanel panel;
    private JTable table1 = new JTable(data,columnNames);
    private JButton addButton;
    private JButton removeButton;
    private JButton editButton;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Zamienniki Leków");
        frame.setContentPane(new MainWindow().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Connection conn = null;




        //table1 = new JTable(data,columnNames);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "newuser", "password");
            Statement sqlState = conn.createStatement();
            String selectStuff = "select * from medicine_table";


        } catch (Exception e) {
            System.out.println("Wyjatek (SQLException|ClassNotFoundException): " + e);
        }

    }
}


