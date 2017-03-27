/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_servidor;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brenner
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.25.31", 9000);
            String msg = "Mensagem enviada ao servidor com sucesso!";
            OutputStream os = socket.getOutputStream();
            os.write(msg.getBytes());
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
