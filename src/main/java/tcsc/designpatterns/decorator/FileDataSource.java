package tcsc.designpatterns.decorator;

public class FileDataSource implements DataSource {

    private String data;

    public void writeData(String data) {
//        System.out.println(data);
        this.data = data;
    }

    // override those which explicity not declared abstract
    @Override
    public String readData(){
        return this.data;
    }
}
