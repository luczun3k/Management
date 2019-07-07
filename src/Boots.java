import java.awt.*;

public class Boots extends Product{

    private int size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, Float price, Float weight, Color color, Integer productCount, Integer size, Boolean isNaturalSkin) {
        super(id, productName, price, weight, color, productCount);

        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }


    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }
}
