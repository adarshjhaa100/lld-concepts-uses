package tcsc.designpatterns.decorator.decorators;

import tcsc.designpatterns.decorator.DataSource;

public class CompressDataSourceDecorator extends DataSourceDecorator{
    public CompressDataSourceDecorator(DataSource dataSource){
        this.dataSource = dataSource;
    }

    // Yaha bas wrappee( jisko wrap kr rhe hai, uske methods call honge )
    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return deCompress(super.readData());
    }

    public String compress(String data){
        return "Compressing..." + data;
    }

    public String deCompress(String data){
        return "DeCompressing..." + data;
    }
}
