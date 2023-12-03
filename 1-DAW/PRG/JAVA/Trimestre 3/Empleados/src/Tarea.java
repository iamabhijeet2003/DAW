public class Tarea {
    private String tarea;
    private boolean tareaCompletada;

    public Tarea(String tarea, boolean tareaCompletada) {
        this.tarea = tarea;
        this.tareaCompletada = tareaCompletada;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public boolean isTareaCompletada() {
        return tareaCompletada;
    }

    public void setTareaCompletada(boolean tareaCompletada) {
        this.tareaCompletada = tareaCompletada;
    }


}
