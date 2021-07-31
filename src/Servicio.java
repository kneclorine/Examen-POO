public interface Servicio {
    
    public static Figura createShape(String shape){
        switch (shape) {
            case "CORAZON":
                return new Corazon();
            case "RAYO":
                return new Rayo();
            case "ESTRELLA":
                return new Estrella();
            default:
                return null;
        }
    }
}
