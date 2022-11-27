package perez.arroyo.javier.dl.memory;

public class Conector {
    private static AccesoBD coneccionBD = null;

    public static AccesoBD getConnector() throws Exception{
        String URL = "jdbc:mysql://localhost/MatriculaUniversidad?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "root";
        String password = "1qaz2wsx3edc";

        // singleton
        if(coneccionBD == null){
            coneccionBD = new AccesoBD(URL,user,password);
        }
        return coneccionBD;
    }
}
