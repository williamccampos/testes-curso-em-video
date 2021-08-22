// Programa mostra resolução da tela do computador
package resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoSistema {

    
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Sua tela tem resolução " + lar + " x " + alt);


    }
    
}
