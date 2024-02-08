/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterdp;

/**
 *
 * @author payal
 */
public class PrinterAdapter implements Printer {

    public PrinterAdapter() {
        this.legacy = new LegacyPrinter();
    }
    private LegacyPrinter legacy;
    
    

    @Override
    public void print() {
        legacy.printDocument();
    }
    
}
