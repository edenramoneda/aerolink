/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lei
 */
public class Sample extends Synapse.Model {

    public Sample() {
        setColumns("id", "name", "description");
        setTable("tbl_test");
    }
    
}
