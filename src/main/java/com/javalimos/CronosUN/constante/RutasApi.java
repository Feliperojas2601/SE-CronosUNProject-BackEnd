package com.javalimos.CronosUN.constante;

public class RutasApi {
    
    public static final String CREAR_USUARIO = "/registro";
    public static final String INICIO_SESION = "/autenticacion";
    public static final String OPCION_ASIGNATURA = "/asignaturaOpcion";
    public static final String RECURSO_DIARIO = "/entradasDiario";
    public static final String RECURSO_DIARIO_ITEM = RECURSO_DIARIO + "/:id";
    
    
    
    private RutasApi() { }
}
