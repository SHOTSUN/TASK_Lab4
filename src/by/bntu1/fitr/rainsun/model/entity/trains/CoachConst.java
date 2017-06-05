package by.bntu1.fitr.rainsun.model.entity.trains;

import java.util.Locale;
import java.util.ResourceBundle;

public class CoachConst {

    private static ResourceBundle bundle;

    static {
        Locale l = new Locale("GB", "en");
        
        //Locale l = new Locale("Ru", "ru");

        bundle = ResourceBundle.getBundle(
                "by.bntu1.fitr.rainsun.model.entity.trains.l10n.Locale", l);
    }
    
    
    public static final String COACH = bundle.getString("coach");
    public static final String WEIGHT = bundle.getString("weight");;
    public static final String LENGTH = bundle.getString("length");;
    public static final String TYPE = bundle.getString("type");;
    public static final String ARMOR = bundle.getString("armor");;
    public static final String ARMORED = bundle.getString("armored");;
    public static final String SIMPLE = bundle.getString("simple");;

}
