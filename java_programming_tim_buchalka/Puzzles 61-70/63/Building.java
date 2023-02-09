public class Building implements Mappable{
    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getMarker() {
        return null;
    }

    @Override
    public void toJSON(String string) {
        Mappable.super.toJSON(string);
    }
}
