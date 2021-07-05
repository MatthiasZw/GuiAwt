package de.iad;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {

    public Main() {

        //Menütitel
        super("Zeichne Oval und Füllen von Fensterhintergrund");
        setBounds(100, 100, 1000, 1000);
        setBackground(Color.blue);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(30, 30, 60, 40);

        g.setColor(Color.red.darker());
        g.fillOval(300, 300, 150, 110);


    }


}
