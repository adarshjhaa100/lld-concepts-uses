package tcsc.designpatterns.decorator.decorators;

import tcsc.designpatterns.decorator.DataSource;


// Extends since parent is abstract
public class EncryptDataSourceDecorator extends DataSourceDecorator{
    public EncryptDataSourceDecorator(DataSource dataSource){
        this.dataSource = dataSource;
    }

    // Yaha bas wrappee( jisko wrap kr rhe hai, uske methods call honge )
    @Override
    public void writeData(String data) {
        // Yaha modify hua hai to add wrapper over data
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData()); // layering
    }

    public String encrypt(String data){
        return "Encrypting..." + data;
    }

    public String decrypt(String data){
        return "Decrypting..." + data;
    }
}
