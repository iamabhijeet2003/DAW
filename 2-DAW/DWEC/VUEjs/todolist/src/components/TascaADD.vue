<template>
    <div class="container">
        <div class="row">
            <div class="col">
                <form @submit.prevent="OnSubmit">
                    <div class="col-4">
                        <label for="text" class="form-label">Text</label>
                        <!-- Utiliza v-model para enlazar el valor del campo de texto -->
                        <input type="text" name="text" v-model="task.text" class="form-control">
                    </div>

                    <div class="col-4">
                        <label for="fecha" class="form-label">Fecha</label>
                        <input type="date" name="fecha" v-model="task.insercion" class="form-control">
                    </div>

                    <div class="col-4">
                        <label for="prioritat" class="form-label">Prioritat</label>
                        <!-- Utiliza v-model para enlazar el valor del select -->
                        <select class="form-select" v-model="task.prioritat">
                            <option value="Baixa">Baixa</option>
                            <option value="Mitja">Mitja</option>
                            <option value="Alta">Alta</option>
                        </select>
                    </div>

                    <div>
                        <button type="submit" class="btn btn-primary">Afegir</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                task: {
                    id: null,
                    text: "",
                    insercion: null,
                    completada: false,
                    dataCompletada: null,
                    prioritat: 'Baixa' // Establece un valor por defecto para el select
                }
            }
        },
        methods: {
            OnSubmit() {
                if (this.task.text === "") {
                    alert("Introduce algo cabron");
                } else {
                    // Create a new object for the task
                    const newTask = Object.assign({}, this.task);
                    this.$emit("AfegirTasca", newTask);
                    this.task.text = "";
                    /*
                    let id= 0;
              
                    if (this.task.length > 0) {
                        id = this.task[this.task.length - 1].id + 1;
                    }
                    this.task= [...this.task, { ...task, id}];
                    */
                }
            },
            
        },
        emits: ["AfegirTasca"],
       
    }
</script>
