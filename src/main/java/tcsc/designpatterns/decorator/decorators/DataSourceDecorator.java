package tcsc.designpatterns.decorator.decorators;

import tcsc.designpatterns.decorator.DataSource;


/*
*   Its concrete implementations will add behaviors
* */
public abstract class DataSourceDecorator implements DataSource {
    DataSource dataSource;

    // Yaha bas wrappee( jisko wrap kr rhe hai, uske methods call honge )
    @Override
    public void writeData(String data) {
//        System.out.println(data);
        this.dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return this.dataSource.readData();
    }

}
