public class Item {
    private String name;
    private int price;
    private boolean selected;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.selected = false;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }

    public void selectItem(){
        this.selected = true;
    }
}
