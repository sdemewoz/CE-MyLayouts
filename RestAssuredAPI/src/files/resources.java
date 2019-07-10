package files;

public class resources {

    public static String getPostDeleteData() {
        String str = "/maps/api/place/delete/json";
        return str;
    }

    public static String getPostAddData() {
        String str = "/maps/api/place/add/json";
        return str;
    }

    public static String getGetData() {
        String str = "/maps/api/place/nearbysearch/json";
        return str;
    }
}
