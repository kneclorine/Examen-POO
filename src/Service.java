public interface Service {
    
    public static Shape createShape(Shapes shape){
        switch (shape) {
            case HEART:
                return new Heart();
            case LIGHTNING:
                return new Lightning();
            default:
                return new Star();
        }
    }
}
