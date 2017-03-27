/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brenner
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9000); 
            Socket socket = server.accept();
            Scanner scan = new Scanner(socket.getInputStream());
            while(scan.hasNext()){
                String linha = scan.nextLine();
                System.out.println(linha);
            }
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
