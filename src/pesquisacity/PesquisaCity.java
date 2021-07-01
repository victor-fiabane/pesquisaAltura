
package pesquisacity;

import java.util.Scanner;

/**
 *
 * @author Sandro Fiabane
 */
public class PesquisaCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int masc, fem, sexo, rep;
        double maxAlt, minAlt, altMasc, altFem, alt, medPop, medHom,
                medAltFem;
        maxAlt = 0; minAlt = 0; altMasc = 0; altFem = 1000; masc = 0; fem = 0;
        rep = 0; masc = 0; fem = 1;
        while(rep <= 50){
            System.out.println("Digite 0 para Masculino e 1 para Feminino:");
            sexo = teclado.nextInt();
            System.out.println("Digite a sua altura:");
            alt = teclado.nextDouble();
            if(sexo == 0){
                masc = masc + 1;
                altMasc = altMasc + alt;
            }else{
                fem = fem + 1;
                altFem = altFem + alt;
            }
            if(alt > maxAlt){
                maxAlt = alt;
            }
            if(alt < minAlt){
                minAlt = alt;
            }
        }
        medAltFem = altFem / fem;
        medPop = (altFem + altMasc) / 50;
        medHom = (100 / 50) * masc;
        System.out.println("A maior altura é "+maxAlt+"cm, e a menor altura é "
                +minAlt+"cm");
        System.out.println("A media de altura feminina é de "+medAltFem+"cm");
        System.out.println("A media de altura da população é de "+medPop+"cm");
        System.out.println("O percentual de homens na população é de "+medHom+"%");
    }
    
}
