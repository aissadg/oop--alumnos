public class nota {
    alumno alum;
    asignatura asig;
    private int evalucion;
    private int curso;
    private int calificacion;
    public nota( alumno alum,asignatura asg,int evalucion, int curso, int calificacion) {

        
        this.alum = alum;
        this.asig= asig;
        this.evalucion = evalucion;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public alumno getAlum() {
        return alum;
    }

    public void setAlum(alumno alum) {
        this.alum = alum;
    }

    public asignatura getAsig() {
        return asig;
    }

    public void setAsig(asignatura asig) {
        this.asig = asig;
    }

    public int getEvalucion() {
        return evalucion;
    }
    public void setEvalucion(int evalucion) {
        this.evalucion = evalucion;
    }
    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }
    public int getcalificacion() {
        return calificacion;
    }
    public void setcalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
