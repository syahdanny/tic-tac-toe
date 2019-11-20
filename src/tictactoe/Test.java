/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Muhammad Aliyul Murtadlo
 */
public class Test {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[500];
            DatagramPacket incoming = new DatagramPacket(buffer,buffer.length);
            DatagramSocket ds = new DatagramSocket(2134);
            while (true) {                
                ds.receive(incoming);
                byte[] data = incoming.getData();
                String s = new String(data, 0, data.length);
                String ss = s.trim();
                System.out.println(ss);
                if (ss.equals("exit")) {
                    System.exit(0);
                }
            }
        } catch (IOException e) {
        }
    }
}
