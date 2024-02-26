package tcsc.designpatterns.decorator.decorators;



import tcsc.designpatterns.decorator.DataSource;

public class RenameDataSourceDecorator extends DataSourceDecorator{
    public RenameDataSourceDecorator(DataSource dataSource){
        this.dataSource = dataSource;
    }

    // Yaha bas wrappee( jisko wrap kr rhe hai, uske methods call honge )
    @Override
    public void writeData(String data) {
        super.writeData(rename(data));
    }

    @Override
    public String readData() {
        return rename(super.readData());
    }


    public String rename(String data){
        return  "Rename..." + data;
    }

}

