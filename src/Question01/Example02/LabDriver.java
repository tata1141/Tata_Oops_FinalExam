/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.Example02;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class LabDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question number: 01 Example 02"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Experiment exp = new Experiment();
        System.out.println(exp);
        exp.doExperiment();
        Biosafety bio = new Biosafety();
        bio.doExperiment();
    }

}
