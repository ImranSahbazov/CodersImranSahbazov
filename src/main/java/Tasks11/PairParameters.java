package Tasks11;

import javax.swing.plaf.PanelUI;

public class PairParameters implements Pair<String,Integer> {
    private String key;
    private Integer value;




    public PairParameters(String key, Integer value){
        this.key=key;
        this.value=value;
    }

    @Override
    public String getkey() {
        return key;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
