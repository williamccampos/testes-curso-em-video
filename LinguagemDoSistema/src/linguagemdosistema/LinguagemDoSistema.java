// Programa mostra linguagem do sistema
package linguagemdosistema;

import java.util.*;

public class LinguagemDoSistema {

        public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("A linguagem do seu sistema é ");
        System.out.println(loc.getDisplayLanguage());
    }
    
}
