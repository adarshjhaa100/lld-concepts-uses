package tcsc.designpatterns.decorator;

/*
*   Problem: Given a data source, (For now File)
*   Add behaviors on a file like:
*   compression, encryption, rename
*
*   can be in any order and are optional
*
*   Need to return a DataSource object and work on it
* */


import tcsc.designpatterns.decorator.decorators.EncryptDataSourceDecorator;
import tcsc.designpatterns.decorator.decorators.RenameDataSourceDecorator;

public class UtilityDecorator {
    public static void main(String[] args) {
        System.out.println("Utility of decorator");


        // Combi 1 : Encrypt and Rename
        DataSource ds1 = new FileDataSource();
        ds1 = new EncryptDataSourceDecorator(ds1); //constructor shall be public
        ds1 = new RenameDataSourceDecorator(ds1);

        ds1.writeData("Data 1");
        System.out.println("Reading: " + ds1.readData());

    }
}
