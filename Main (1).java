

class Data {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.setName("adarshjain");
        String dataName = d.getName();
        System.out.println("Name: " + dataName);
    }
}

